INSERT INTO Artist (name) VALUES ('Justin Bieber');
INSERT INTO Artist (name) VALUES ('Linkin Park');
INSERT INTO Artist (name) VALUES ('NickelBack');
INSERT INTO Artist (name) VALUES ('Fall Out Boys');



INSERT INTO Album (artist_name,title,genre_category) VALUES ('Justin Bieber', 'Good Song', 'RNB');
INSERT INTO Album (artist_name,title,genre_category) VALUES ('Linkin Park', 'Heavy Song', 'Rock');
INSERT INTO Album (artist_name,title,genre_category) VALUES ('Linkin Park', 'Loud Song', 'Hip');
INSERT INTO Album (artist_name,title,genre_category) VALUES ('NickelBack', 'Centuries', 'Hop');
INSERT INTO Album (artist_name,title,genre_category) VALUES ('Fall Out Boys', 'That one Song', 'Dans');

INSERT INTO Genre (category) VALUES ('Afrikansk');
INSERT INTO Genre (category) VALUES ('HipHop');
INSERT INTO Genre (category) VALUES ('Gospel');
INSERT INTO Genre (category) VALUES ('FadoFilmmusik');
INSERT INTO Genre (category) VALUES ('Rock');
INSERT INTO Genre (category) VALUES ('Heavy');
INSERT INTO Genre (category) VALUES ('Loud');
INSERT INTO Genre (category) VALUES ('Salsa');

UPDATE Album SET artist_name = (SELECT name FROM Artist WHERE name = artist_name);

UPDATE Album SET genre_category = (SELECT category FROM Genre WHERE category = genre_category);