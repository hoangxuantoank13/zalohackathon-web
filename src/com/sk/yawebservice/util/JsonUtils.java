/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sk.yawebservice.util;

/**
 *
 * @author toanhx
 */
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonUtils {

	private final ObjectMapper objMapper = new ObjectMapper();
	private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);

	public JsonUtils() {
		objMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objMapper.configure(DeserializationConfig.Feature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
		objMapper.configure(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, false);

	}

	public static JsonUtils Instance = new JsonUtils();

	public JsonUtils(Map<SerializationConfig.Feature, Boolean> config) {
		for (SerializationConfig.Feature feature : config.keySet()) {
			objMapper.configure(feature, config.get(feature));
		}
		objMapper.configure(SerializationConfig.Feature.WRITE_NULL_MAP_VALUES, false);
	}

	public <T> List<T> getList(String json) {
		try {
			return objMapper.readValue(json, new TypeReference<List<T>>() {
			});
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}

	public <T> T convertValue(Object mapData, Class<T> type) {
		return objMapper.convertValue(mapData, type);
	}

	public Map<String, Object> getMap(String json) {
		try {
			return objMapper.readValue(json, new TypeReference<Map<String, Object>>() {
			});
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}

	/**
	 *
	 * @param <T>
	 * @param json
	 * @return
	 */
	public <T> Map<String, T> getMapType(String json) {
		try {

			return objMapper.readValue(json, new TypeReference<Map<String, T>>() {
			});
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}

	public Object getObject(String json) {
		try {
			return objMapper.readValue(json, Object.class);
		} catch (IOException ex) {
			logger.error(ex.getMessage());
			return null;
		}
	}

	public <T> T getObject(Class<T> type, String json) {
		try {
			return objMapper.readValue(json, type);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
                        System.out.println(json);
			return null;
		}
	}

	public String toJson(Object obj) {
		try {
			return objMapper.writeValueAsString(obj);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			return null;
		}
	}

	public <T> T getObject(TypeReference<T> type, String json) {
		try {
			return objMapper.readValue(json, type);
		} catch (Exception e) {
			logger.error("getObject: " + json, e);
			return null;
		}
	}

	public ObjectMapper getMapper() {
		return objMapper;
	}
}
