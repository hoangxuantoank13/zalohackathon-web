package com.sk.recommendwebservice.common;

import com.sk.core.configer.SKConfig;

public class Constant {

    public static final String ISDEBUG = SKConfig.Instance.getString(Constant.class, "ya_web_service", "isDebug", "true");
    public static final String _PROJECT_NAME = "test"; 
    public static final String _COLLECTION_ZMP3 = "zmp3";
    public static final String _COLLECTION_ZMP3_META = "metaData";

}
