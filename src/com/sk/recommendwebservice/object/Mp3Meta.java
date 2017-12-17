/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sk.recommendwebservice.object;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author toanhx
 */
public class Mp3Meta implements java.io.Serializable{
    private String id;
    private String title;
    private String artists;
    private String composers;
    private String album;
    private String genre;
    

    public Mp3Meta() {
    }

    public Mp3Meta(String id, String title, String artists, String composers, String album, String genre) {
        this.id = id;
        this.title = title;
        this.artists = artists;
        this.composers = composers;
        this.album = album;
        this.genre = genre;
    }
    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("artists")
    public String getArtists() {
        return artists;
    }

    @JsonProperty("artists")
    public void setArtists(String artists) {
        this.artists = artists;
    }

    @JsonProperty("composers")
    public String getComposers() {
        return composers;
    }

    @JsonProperty("composers")
    public void setComposers(String composers) {
        this.composers = composers;
    }

    @JsonProperty("album")
    public String getAlbum() {
        return album;
    }

    @JsonProperty("album")
    public void setAlbum(String album) {
        this.album = album;
    }

    @JsonProperty("genre")
    public String getGenre() {
        return genre;
    }

    @JsonProperty("genre")
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
