/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sk.recommendwebservice.object;

import java.util.Map;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author toanhx
 */
public class UserLogMp3 implements java.io.Serializable{
    @JsonProperty("songListen")
    private Map<String, LogMp3> songListen;
    @JsonProperty("songRecommend")
    private Map<String, Double> songRecommend;

    public UserLogMp3() {
    }

    public UserLogMp3(Map<String, LogMp3> songListen, Map<String, Double> songRecommend) {
        this.songListen = songListen;
        this.songRecommend = songRecommend;
    }


    @JsonProperty("songListen")
    public Map<String, LogMp3> getSongListen() {
        return songListen;
    }

    @JsonProperty("songListen")
    public void setSongListen(Map<String, LogMp3> songs) {
        this.songListen = songs;
    }

    @JsonProperty("songRecommend")
    public Map<String, Double> getSongRecommend() {
        return songRecommend;
    }

    @JsonProperty("songRecommend")
    public void setSongRecommend(Map<String, Double> songRecommend) {
        this.songRecommend = songRecommend;
    }
}
