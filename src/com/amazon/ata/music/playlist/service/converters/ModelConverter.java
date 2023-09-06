package com.amazon.ata.music.playlist.service.converters;

import com.amazon.ata.music.playlist.service.dynamodb.models.AlbumTrack;
import com.amazon.ata.music.playlist.service.models.PlaylistModel;
import com.amazon.ata.music.playlist.service.dynamodb.models.Playlist;
import com.amazon.ata.music.playlist.service.models.SongModel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ModelConverter {
    /**
     * Converts a provided {@link Playlist} into a {@link PlaylistModel} representation.
     * @param playlist the playlist to convert
     * @return the converted playlist
     */
    public static PlaylistModel toPlaylistModel(Playlist playlist) {
        return PlaylistModel.builder()
            .withId(playlist.getId())
            .build();


    }

    public static List<SongModel> toSongModel(List<AlbumTrack> songList) {
        List<SongModel> songModelList = new LinkedList<>();
        for (AlbumTrack albumTrack : songList) {
            songModelList.add(SongModel.builder()
                .withAsin(albumTrack.getAsin())
                .withTrackNumber(albumTrack.getTrackNumber())
                            .withAlbum(albumTrack.getAlbumName())
                            .withTitle(albumTrack.getSongTitle())
                .build());
        }
        return songModelList;
    }
}
