package com.example.acer.Movie1;

import java.io.Serializable;

class Moviedata implements Serializable {
    private String backdrop;
    private String title;
    private String image;
    private String id;
    private String vote;
    private String overview;
    private String releasedate;

    public Moviedata(String backdrop, String image, String title, String id, String vote, String overview, String releasedate) {
        this.title = title;
        this.backdrop = backdrop;
        this.image = image;
        this.id = id;
        this.overview = overview;
        this.releasedate = releasedate;
        this.vote = vote;

    }

    public String getBackdrop() {
        return backdrop;
    }

    public void setBackdrop(String backdrop) {
        this.backdrop = backdrop;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }
}
