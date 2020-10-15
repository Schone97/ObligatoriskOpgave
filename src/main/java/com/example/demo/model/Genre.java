package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Genre {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    private String category;


    public Long getId() {
        return id; }

    public void setId(Long id) {
        this.id = id; }

    public String getCategory() {
        return category; }

    public void setCategory(String category) {
        this.category = category;  }

    public Set<Album> getAlbumSet() {
        return albumSet; }

    public void setAlbumSet(Set<Album> albumSet) {
        this.albumSet = albumSet; }



    @OneToMany(mappedBy = "genres")
    private Set<Album> albumSet;
}
