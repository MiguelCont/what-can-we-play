package com.wcwp.what_can_we_play.models;

import java.time.LocalDate;

public class Game {

    private int appId;
    private String name;
    private double playtime;
    private LocalDate last_played;
    public String img_hash;

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgLink() {
        return String.format("http://media.steampowered.com/steamcommunity/public/images/apps/%s/%s.jpg", appId, img_hash);
    }

    public void setImg_hash(String img_hash) {
        this.img_hash = img_hash;
    }

    public double getPlaytime() {
        return playtime;
    }

    public void setPlaytime(double playtime) {
        this.playtime = playtime;
    }

    public LocalDate getLast_played() {
        return last_played;
    }

    public void setLast_played(LocalDate last_played) {
        this.last_played = last_played;
    }

    public String getImg_hash() {
        return img_hash;
    } 

    
}
