package com.example.demo.model;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

// Creates a table
@Entity
public class Album {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    private String title;
    private String artistName;
    private String genreCategory;


    @ManyToMany
    private Set<Artist> artists;
    @ManyToOne
    private Genre genres;

    public Album() {
    }
    public Album(Long id, String title, String artistName, String genreCategory) {
        this.id = id;
        this.title = title;
        this.artistName = artistName;
        this.genreCategory = genreCategory;
    }

    public Long getId() {
        return id; }

    public void setId(Long id) {
        this.id = id; }

    public String getTitle() {
        return title; }

    public void setTitle(String title) {
        this.title = title; }

    public String getArtistName() {
        return artistName; }

    public void setArtistName(String artistName) {
        this.artistName = artistName; }

    public Set<Artist> getArtists() {
        return artists; }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists; }

    public String getGenreCategory() {
        return genreCategory; }

    public void setGenreCategory(String genreCategory) {
        this.genreCategory = genreCategory; }

    public Genre getGenres() {
        return genres; }

    public void setGenres(Genre genres) {
        this.genres = genres; }
}