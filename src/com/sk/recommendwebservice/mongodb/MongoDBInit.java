/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sk.recommendwebservice.mongodb;

/**
 *
 * @author toanhx
 */
import java.util.Arrays;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;
import com.sk.core.configer.SKConfig;

public class MongoDBInit {

    private static final String _nameClass = MongoDBInit.class.getSimpleName();

    private static String HOST;
    private static int PORT;

    //
    private static String USERNAME;
    private static String PASSWORD;
    private static String NAME;

    public MongoDBInit(String name) {
        NAME = name;
        HOST = SKConfig.Instance.getString(MongoDBInit.class, "RecommendSystem", "host", "localhost");
        PORT = SKConfig.Instance.getInt(MongoDBInit.class, "RecommendSystem", "port", 27017);
        USERNAME = SKConfig.Instance.getString(MongoDBInit.class, "RecommendSystem", "username", "");
        PASSWORD = SKConfig.Instance.getString(MongoDBInit.class, "RecommendSystem", "password", "");
    }

    // Cách kết nối vào YAMongoDB không bắt buộc bảo mật.
    private MongoDatabase getMongoDBNoCredential() {
        MongoClient mongoClient = new MongoClient(HOST, PORT);
        return mongoClient.getDatabase(NAME);

    }

    // Cách kết nối vào DB YAMongoDB có bảo mật.
    private MongoDatabase getMongoDBWithCredential() {
        MongoCredential credential = MongoCredential.createMongoCRCredential(
                USERNAME, NAME, PASSWORD.toCharArray());

        MongoClient mongoClient = new MongoClient(
                new ServerAddress(HOST, PORT), Arrays.asList(credential));
        return mongoClient.getDatabase(NAME);
    }

    public MongoDatabase getMongoDB() {
        if (USERNAME.equals("") && PASSWORD.equals("")) {
            return getMongoDBNoCredential();
        } else {
            return getMongoDBWithCredential();
        }

    }

}
