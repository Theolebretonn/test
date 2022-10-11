package org.stcharles.introjdbc.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Album extends Entity {
    private final Artist artist;
    private final String title;
    private final LocalDate releaseDate;
    private final List<Song> songs;

    public Album(Artist artist, String title, LocalDate releaseDate, List<Song> songs) {
        this.artist = artist;
        this.title = title;
        this.releaseDate = releaseDate;
        this.songs = new ArrayList<>(songs);
    }

    public Artist getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public List<Song> getSongs() {
        return List.copyOf(songs);
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
}
