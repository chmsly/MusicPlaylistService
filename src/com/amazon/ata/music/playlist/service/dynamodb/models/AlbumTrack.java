package com.amazon.ata.music.playlist.service.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * Represents a record in the album_tracks table.
 */
@DynamoDBTable(tableName = "album_tracks")
public class AlbumTrack {


    private String asin;


    private int trackNumber;


    private String albumName;


    private String songTitle;

    @DynamoDBHashKey(attributeName = "asin")
    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }
    @DynamoDBRangeKey(attributeName = "track_number")
    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }
    @DynamoDBAttribute(attributeName = "album_name")
    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
    @DynamoDBAttribute(attributeName = "song_title")
    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }
}
