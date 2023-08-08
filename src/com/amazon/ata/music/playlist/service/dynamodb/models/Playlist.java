package com.amazon.ata.music.playlist.service.dynamodb.models;

import com.amazon.ata.music.playlist.service.converters.AlbumTrackLinkedListConverter;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import java.util.Set;
import java.util.List;

/**
 * Represents a record in the playlists table.
 */
@DynamoDBTable(tableName = "playlists")
public class Playlist {
    private String id;
    private List<AlbumTrack> songList;
    private String name;
    private String customerId;
    private Integer songCount;
    private Set<String> tags;




    @DynamoDBHashKey(attributeName = "id")
    public String getId() {
        return id;
    }

    @DynamoDBRangeKey
    public String getCustomerId() {
        return customerId;
    }

    @DynamoDBAttribute(attributeName = "songCount")
    public Integer getSongCount() {
        return songCount;
    }

    public void setSongCount(Integer songCount) {
        this.songCount = songCount;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @DynamoDBAttribute(attributeName = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @DynamoDBAttribute(attributeName = "tags")
    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }


    public void setId(String id) {
        this.id = id;
    }

    // PARTICIPANTS: You do not need to modify the songList getters/setters or annotations
    @DynamoDBTypeConverted(converter = AlbumTrackLinkedListConverter.class)
    @DynamoDBAttribute(attributeName = "songList")
    public List<AlbumTrack> getSongList() {
        return songList;
    }

    public void setSongList(List<AlbumTrack> songList) {
        this.songList = songList;
    }
}
