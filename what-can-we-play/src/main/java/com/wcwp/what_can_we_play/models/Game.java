package com.wcwp.what_can_we_play.models;

public class Game {

    private int appId;
    private String name;

    private double playtime_2weeks;
    private double playtime_forever;

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

    public double getPlaytime_2weeks() {
        return playtime_2weeks;
    }

    public void setPlaytime_2weeks(double playtime_2weeks) {
        this.playtime_2weeks = playtime_2weeks;
    }

    public double getPlaytime_forever() {
        return playtime_forever;
    }

    public void setPlaytime_forever(double playtime_forever) {
        this.playtime_forever = playtime_forever;
    }

    public String getImgLink() {
        return String.format("http://media.steampowered.com/steamcommunity/public/images/apps/%s/%s.jpg", appId, img_hash);
    }

    public void setImg_hash(String img_hash) {
        this.img_hash = img_hash;
    } 

    
}
