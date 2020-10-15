package com.example.demo.repository;

public class AlbumRepository  {

    /*@Override
    public boolean create(Album album) {
        return false;
    }
    @Override
    public List<Album> readAll() {
        // Creates a list to return
        List<Album> albumToReturn = new ArrayList<>();
        String sql = "SELECT * FROM ALBUM";
        sqlRowSet = jdbcTemplate.queryForRowSet(sql);
        while(sqlRowSet.next()){
            albumToReturn.add(new Album(sqlRowSet.getLong("id"),
                    sqlRowSet.getString("artist_name"),
                    sqlRowSet.getString("genre_category"),
                    sqlRowSet.getString("title")));
        }
        return albumToReturn;
    }*/
}
