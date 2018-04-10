package com.example.talalahmed.moviemanager.models;

import java.io.Serializable;

/**
 * Created by talal.ahmed on 3/21/18.
 */

public class Movie implements Serializable{

    String id;
    String title;
    String overview;
    float voteavg;
    float votecount;
    String posterPath;
    String backdropPath;

    public Movie(String id, String title, String overview, float voteavg, float votecount, String posterPath, String backdropPath) {
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.voteavg = voteavg;
        this.votecount = votecount;
        this.posterPath = posterPath;
        this.backdropPath = backdropPath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public float getVoteavg() {
        return voteavg;
    }

    public void setVoteavg(float voteavg) {
        this.voteavg = voteavg;
    }

    public float getVotecount() {
        return votecount;
    }

    public void setVotecount(float votecount) {
        this.votecount = votecount;
    }

    public String getPosterPath() {
        return String.format("https://image.tmdb.org/t/p/w342%s", posterPath);
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getBackdropPath() {

        return String.format("https://image.tmdb.org/t/p/w780%s", backdropPath);
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }




}
