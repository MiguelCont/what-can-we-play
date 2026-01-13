package com.wcwp.what_can_we_play.models;

import java.util.ArrayList;

public class User {
    private int steamID;
    private String name;
    private String avatarImageURL;
    private ArrayList<Game> games;
    private ArrayList<User> friends;
    
    
    public User() {
    }
    
    public User(int steamID, String name, String avatarImageURL) {
        this.steamID = steamID;
        this.name = name;
        this.avatarImageURL = avatarImageURL;
    }

    public int getSteamID() {
        return steamID;
    }
    
    public void setSteamID(int steamID) {
        this.steamID = steamID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarImageURL() {
        return avatarImageURL;
    }

    public void setAvatarImageURL(String avatarImageURL) {
        this.avatarImageURL = avatarImageURL;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public ArrayList<User> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<User> friends) {
        this.friends = friends;
    }
    
}
