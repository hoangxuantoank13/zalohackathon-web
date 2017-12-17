/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sk.recommendwebservice.object;

import javax.xml.bind.annotation.XmlElement;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author toanhx
 */
public class LogMp3 implements java.io.Serializable {

    private long startTime;
    private long duration;

    public LogMp3() {
    }

    public LogMp3(long startTime, long duration) {
        this.startTime = startTime;
        this.duration = duration;
    }

    @JsonProperty("startTime")
    public long getStartTime() {
        return startTime;
    }

    @JsonProperty("startTime")
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("duration")
    public long getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(long duration) {
        this.duration = duration;
    }

}
