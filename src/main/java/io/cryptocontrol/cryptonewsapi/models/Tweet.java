package io.cryptocontrol.cryptonewsapi.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * @author enamakel@eshe.io
 */
public class Tweet {
    @SerializedName("isRetweeted")
    private Boolean isRetweeted;

    @SerializedName("favoriteCount")
    private Number favoriteCount;

    @SerializedName("retweetCount")
    private Number retweetCount;

    @SerializedName("id")
    private String id;

    @SerializedName("publishedAt")
    private String publishedAt;

    @SerializedName("text")
    private String text;

    @SerializedName("url")
    private String url;

    @SerializedName("username")
    private String username;

    @SerializedName("hashtags")
    private List<String> hashtags;

    @SerializedName("links")
    private List<String> links;

    @SerializedName("mentions")
    private List<String> mentions;

    @SerializedName("symbols")
    private List<String> symbols;


    public String getUrl() {
        return url;
    }


    public List<String> getSymbols() {
        return symbols;
    }


    public void setSymbols(List<String> symbols) {
        this.symbols = symbols;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getPublishedAt() {
        return publishedAt;
    }


    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }


    public Boolean getRetweeted() {
        return isRetweeted;
    }


    public void setRetweeted(Boolean retweeted) {
        isRetweeted = retweeted;
    }


    public Number getRetweetCount() {
        return retweetCount;
    }


    public void setRetweetCount(Number retweetCount) {
        this.retweetCount = retweetCount;
    }


    public Number getFavoriteCount() {
        return favoriteCount;
    }


    public void setFavoriteCount(Number favoriteCount) {
        this.favoriteCount = favoriteCount;
    }


    public List<String> getLinks() {
        return links;
    }


    public void setLinks(List<String> list) {
        this.links = list;
    }


    public List<String> getHashtags() {
        return hashtags;
    }


    public void setHashtags(List<String> hashtags) {
        this.hashtags = hashtags;
    }


    public List<String> getMentions() {
        return mentions;
    }


    public void setMentions(List<String> mentions) {
        this.mentions = mentions;
    }


    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }


    public static class TweetList extends ArrayList<Tweet> {
    }
}
