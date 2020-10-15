package com.example.demo.model;
import javax.persistence.*;
import java.util.Set;


@Entity
public class Artist {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;


    private String name;


    @ManyToMany(mappedBy = "artists")
    private Set<Album> album;


    public Long getId() {
        return id; }

    public void setId(Long id) {
        this.id = id; }

    public String getName() {
        return name; }

    public void setName(String name) {
        this.name = name; }

    public Set<Album> getAlbum() {
        return album; }

    public void setAlbum(Set<Album> album) {
        this.album = album; }
}
