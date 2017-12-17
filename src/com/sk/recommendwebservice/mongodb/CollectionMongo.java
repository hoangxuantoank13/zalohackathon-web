/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sk.recommendwebservice.mongodb;

import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.DeleteResult;
import com.sk.recommendwebservice.common.Constant;
import com.sk.yawebservice.util.JsonUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import org.apache.thrift.TBase;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author toanhx
 */
public class CollectionMongo {

    protected MongoCollection<Document> _collection;

    public CollectionMongo(String _collectionName) {
        MongoDBInit mongo = new MongoDBInit(Constant._PROJECT_NAME);
        MongoDatabase mongoDB = mongo.getMongoDB();
        _collection = mongoDB.getCollection(_collectionName);
    }

    public MongoCollection<Document> getCollection() {
        return _collection;
    }

    public boolean isExists(String id) {
        Document doc = new Document("_id", id);
        return _collection.count(doc) > 0;
    }

    public boolean insert(TBase comment) {
        try {
            Map map = JsonUtils.Instance.convertValue(comment, Map.class);
            Document doc = new Document(map);
            getCollection().insertOne(doc);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public <T> T getById(Class<T> type, String id) {
        Document doc = new Document("_id", id);
        FindIterable<Document> find = getCollection().find(doc);
        Document first = find.first();
        if (first != null) {
            Set<Map.Entry<String, Object>> entrySet = first.entrySet();
            Map<String, Object> mapFromSet = new HashMap<>();
            for (Entry<String, Object> entry : entrySet) {
                mapFromSet.put(entry.getKey(), entry.getValue());
            }

            return JsonUtils.Instance.convertValue(mapFromSet, type);
        }
        return null;

    }
    
    public <T> List<T> getById(Class<T> type, List<String> listId) {
        List<T> result = new ArrayList();

        FindIterable<Document> find = _collection.find(
                new Document()
                        .append("_id", new Document()
                                .append("$in", listId))
        );
                
        if (find != null) {
            MongoCursor<Document> iterator = find.iterator();
            while (iterator.hasNext()) {
                Document next = iterator.next();
                Set<Map.Entry<String, Object>> entrySet = next.entrySet();
                Map<String, Object> mapFromSet = new HashMap<>();
                for (Entry<String, Object> entry : entrySet) {
                    mapFromSet.put(entry.getKey(), entry.getValue());
                }

                T convertValue = JsonUtils.Instance.convertValue(mapFromSet, type);
                result.add(convertValue);
            }
        }

        return result;


    }

    public <T> List<T> getByIdOrdering(Class<T> type, List<String> listId) {
        if(listId.size() == 1)
            return getById(type, listId);
        List<T> result = new ArrayList();
        Stack<Document> stack = new Stack();
        
        for(int i = listId.size() - 1; i > 0; i--) {
            Document rec = new Document("$cond", 
                                        new ArrayList(Arrays.asList(
                                            new Document("$eq", Arrays.asList("$_id", listId.get(i - 1)))
                                            , i
                                        )));
            if(stack.isEmpty()) {
                List list = rec.get("$cond", List.class);
                        list.add(i + 1);
            } else {
                Document lval = stack.pop();
                List list = rec.get("$cond", List.class);
                list.add(lval);
            }
            stack.push(rec);
        }

        AggregateIterable<Document> find = _collection.aggregate(Arrays.asList(
                new Document().append("$match", new Document("_id", new Document("$in", listId))),
                new Document().append("$project", new Document().append("weight", stack.get(0))
                                                                .append("document", "$$ROOT")),
                new Document().append("$sort", new Document("weight", 1))
        ));
                

        if (find != null) {
            MongoCursor<Document> iterator = find.iterator();
            while (iterator.hasNext()) {
                Document next = iterator.next();
                Document doc = next.get("document", Document.class);
//                System.out.println(next);
                Set<Map.Entry<String, Object>> entrySet = doc.entrySet();
                Map<String, Object> mapFromSet = new HashMap<>();
                for (Entry<String, Object> entry : entrySet) {
                    mapFromSet.put(entry.getKey(), entry.getValue());
                }

                T convertValue = JsonUtils.Instance.convertValue(mapFromSet, type);
                result.add(convertValue);
            }
        }

        return result;


    }

    public boolean updateById(String id, TBase comment, boolean addOrUpdate) {
        if (comment != null) {

            Map map = JsonUtils.Instance.convertValue(comment, Map.class);
            Document doc = new Document(map);
            getCollection().replaceOne(Filters.eq("_id", id),
                    doc,
                    new UpdateOptions().upsert(addOrUpdate));
            return true;
        }
        return false;
    }

    public <T> List<T> getSlice(Class<T> type, int start, int count) {
        List<T> result = new ArrayList<>();
        FindIterable<Document> find = getCollection().find().skip(start).limit(count);
        if (find != null) {
            MongoCursor<Document> iterator = find.iterator();
            while (iterator.hasNext()) {
                Document next = iterator.next();
                Set<Map.Entry<String, Object>> entrySet = next.entrySet();
                Map<String, Object> mapFromSet = new HashMap<>();
                for (Entry<String, Object> entry : entrySet) {
                    mapFromSet.put(entry.getKey(), entry.getValue());
                }
                T object = JsonUtils.Instance.convertValue(mapFromSet, type);
                result.add(object);
            }
        }
        return result;
    }

    public boolean remove(String id) {
        DeleteResult deleteOne = _collection.deleteOne(new Document()
                .append("_id", id)
        );
        return deleteOne.getDeletedCount() > 0;
    }

    public boolean removeMany(String[] ids) {
        List<String> listId = new ArrayList();
        for (String id : ids) {
            listId.add(id);
        }

        DeleteResult deleteMany = _collection.deleteMany(new Document()
                .append("_id", new Document()
                        .append("$in", listId))
        );
        return deleteMany.getDeletedCount() > 0;

    }
}
