package com.sk.recommendwebservice.model;

import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;
import com.sk.recommendwebservice.common.Constant;
import com.sk.recommendwebservice.mongodb.CollectionMongo;
import com.sk.recommendwebservice.object.LogMp3;
import com.sk.recommendwebservice.object.Mp3Meta;
import com.sk.recommendwebservice.object.UserLogMp3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import org.apache.log4j.Logger;
import org.bson.Document;
import org.json.simple.JSONObject;

public class Mp3Model {

    private static final Logger _logger = Logger.getLogger(Mp3Model.class);
    public static Mp3Model Instance = new Mp3Model();
    protected static CollectionMongo _collectionMp3Meta = new CollectionMongo(Constant._COLLECTION_ZMP3_META);
    protected static CollectionMongo _collectionZMp3 = new CollectionMongo(Constant._COLLECTION_ZMP3);
    private static List<String> listUserId = new LinkedList<>();
    private final String USER_AGENT = "Mozilla/5.0";

    public void init() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("user_id"));
        try {
            String line = br.readLine();

            while (line != null) {
                listUserId.add(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mp3Model.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Mp3Model.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            br.close();
        }
        System.out.println(listUserId.size());
    }

    public UserLogMp3 getMp3OfUser(String userId) {
        Document doc = new Document("_id", userId);
        FindIterable<Document> find = _collectionZMp3.getCollection().find(doc);
        Document first = find.first();
        if (first != null) {
            Set<Map.Entry<String, Object>> entrySet = first.entrySet();
            Map<String, Object> mapFromSet = new HashMap<>();
            for (Map.Entry<String, Object> entry : entrySet) {
                mapFromSet.put(entry.getKey(), entry.getValue());
            }

            UserLogMp3 result = new UserLogMp3();
            result.setSongListen((Map<String, LogMp3>) mapFromSet.get("songListen"));
            result.setSongRecommend((Map<String, Double>) mapFromSet.get("songRecommend"));
            return result;
        }
        return null;

    }

    public Mp3Meta getMp3Meta(String songId) {
        return _collectionMp3Meta.getById(Mp3Meta.class, songId);

    }

    public List<Mp3Meta> getMp3Meta(List<String> songId) {
        return _collectionMp3Meta.getById(Mp3Meta.class, songId);

    }

    public String getRandomUserId() {
        Random random = new Random();
        int nextInt = random.nextInt(listUserId.size());
        String userId = listUserId.get(nextInt);
        return userId;
    }
    
    public List<String> getSongRecommend(String userId) {
        List<String> result = new ArrayList();
        try {
            String url = "http://118.102.6.65:8080/predict?userId=" + userId;
            String sendGet = sendGet(url);
            if(sendGet != null && !sendGet.isEmpty()) {
                String replaceAll = sendGet.replaceAll(" ", "").replaceAll("\\[", "").replaceAll("\\]", "");
                
                result.addAll(Arrays.asList(replaceAll.split(",")));
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Mp3Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    private String sendGet(String url) throws Exception {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        return response.toString();

    }

    public static void main(String[] args) throws IOException {
//        File file = new File("img.jpg");
//        String uploadImage = SKUploadImage.uploadImage(file);
//        long userId = 330531430;
//        UserLogMp3 mp3OfUser = Instance.getMp3OfUser(userId + "");
//        System.out.println(mp3OfUser.getSongListen().keySet());
//        System.out.println(mp3OfUser.getSongRecommend().keySet());
//
//        long songId = 1073741849;
//        Mp3Meta mp3Meta = Instance.getMp3Meta(songId + "");
//        System.out.println(mp3Meta.getTitle());
//        String userId = "1000754730";
//        long start = System.currentTimeMillis();
//        System.out.println(Instance.getSongRecommend(userId));
//        long end = System.currentTimeMillis();
//        System.out.println((end - start) / 1000);

          
    }
}
