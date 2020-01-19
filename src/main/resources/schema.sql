create schema scoala;
create table scoala.clasa
(
    idClasa   int(5) unsigned auto_increment primary key,
    numeClasa varchar(10) not null
);
create table scoala.elevi
(
    idElev   int(5) unsigned auto_increment primary key,
    numeElev varchar(25) not null,
    idClasa  int(5) unsigned,
    foreign key (idClasa) references scoala.clasa(idClasa)
);
insert into scoala.clasa(numeClasa) values ('10A');
insert into scoala.clasa(numeClasa) values ('10B');
insert into scoala.clasa(numeClasa) values ('10C');
insert into scoala.elevi(numeElev, idClasa) VALUES ('Fratili Mic', 1);
insert into scoala.elevi(numeElev, idClasa) VALUES ('Romu Vasile', 2);
insert into scoala.elevi(numeElev, idClasa) VALUES ('Gamu Ramon', 2);
insert into scoala.elevi(numeElev, idClasa) VALUES ('Zorel Bibilica', 3);
insert into scoala.elevi(numeElev, idClasa) VALUES ('Aramis Catana', 3);
insert into scoala.elevi(numeElev, idClasa) VALUES ('Joric Bunel', 2);
insert into scoala.elevi(numeElev, idClasa) VALUES ('Tocu Milu', 3);
insert into scoala.elevi(numeElev, idClasa) VALUES ('Romulus Cane', 2);
insert into scoala.elevi(numeElev, idClasa) VALUES ('Zorel Cana', 1);
insert into scoala.elevi(numeElev, idClasa) VALUES ('Zara Buni', 3);
CREATE TABLE scoala.note
(
    idNota      INT(5) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    valoareNota INT(2) UNSIGNED,
    idElev      INT(5) UNSIGNED ,
    FOREIGN KEY (idElev) REFERENCES scoala.elevi (idElev)
);
INSERT INTO scoala.note(valoareNota, idElev)
VALUES (9, 1), (5, 1), (4, 2), (10, 2), (8, 3), (1, 3), (4, 4), (8, 4), (10, 5), (2, 5), (7, 6), (3, 6), (8, 7),
       (1, 7), (10, 8),(10, 8), (2, 9), (10, 9), (5, 10), (5, 10);
create table scoala.profesori
(
    idProfesor int(5) unsigned auto_increment primary key,
    numeProfesor varchar(20) not null
);
create table scoala.materii
(
    idMaterie int(5) unsigned auto_increment primary key,
    numeMaterie varchar(20) not null
);
create table scoala.ProfesoriMaterie
(
    idPredare int(5) unsigned auto_increment primary key,
    idProfesor int(5) unsigned,
    idMaterie int(5) unsigned,
    foreign key (idProfesor) references scoala.profesori(idProfesor),
    foreign key (idMaterie) references scoala.materii(idMaterie)
);
insert into scoala.profesori(numeProfesor)values ('Petrica Spataru');
insert into scoala.profesori(numeProfesor)values ('Mitu Vasile');
insert into scoala.profesori(numeProfesor)values ('Japca Florin');
insert into scoala.profesori(numeProfesor)values ('Porcu Victor');
insert into scoala.profesori(numeProfesor)values ('Zaica Trufa');
insert into scoala.materii(numeMaterie) values ('Metafizica');
insert into scoala.materii(numeMaterie) values ('Dat cu sapa');
insert into scoala.materii(numeMaterie) values ('Prins la furca');
insert into scoala.materii(numeMaterie) values ('Vanat pisici');
insert into scoala.materii(numeMaterie) values ('Aruncat cu zaru');
insert into scoala.ProfesoriMaterie(idProfesor, idMaterie) VALUES
(1,2),(1,5),(2,5),(4,1),(2,3),(3,2),(4,2),(5,5),(2,4),(3,1),(5,2),(3,4);
alter table scoala.note add column idPredare int(5) unsigned;
alter table scoala.note add foreign key (idPredare) references  scoala.profesorimaterie(idPredare);
update scoala.note set scoala.note.idPredare ='1' where idNota=1;
update scoala.note set scoala.note.idPredare ='1' where idNota=2;
update scoala.note set scoala.note.idPredare ='3' where idNota=3;
update scoala.note set scoala.note.idPredare ='1' where idNota=4;
update scoala.note set scoala.note.idPredare ='6' where idNota=5;
update scoala.note set scoala.note.idPredare ='7' where idNota=6;
update scoala.note set scoala.note.idPredare ='3' where idNota=7;
update scoala.note set scoala.note.idPredare ='5' where idNota=8;
update scoala.note set scoala.note.idPredare ='12' where idNota=9;
update scoala.note set scoala.note.idPredare ='5' where idNota=10;
update scoala.note set scoala.note.idPredare ='4' where idNota=11;
update scoala.note set scoala.note.idPredare ='5' where idNota=12;
update scoala.note set scoala.note.idPredare ='6' where idNota=13;
update scoala.note set scoala.note.idPredare ='2' where idNota=14;
update scoala.note set scoala.note.idPredare ='11' where idNota=15;
update scoala.note set scoala.note.idPredare ='12' where idNota=16;
update scoala.note set scoala.note.idPredare ='1' where idNota=17;
update scoala.note set scoala.note.idPredare ='5' where idNota=18;
update scoala.note set scoala.note.idPredare ='3' where idNota=19;
update scoala.note set scoala.note.idPredare ='2' where idNota=20;
update scoala.note set scoala.note.idPredare ='6' where idNota=21;
update scoala.note set scoala.note.idPredare ='7' where idNota=22;
update scoala.note set scoala.note.idPredare ='8' where idNota=23;
update scoala.note set scoala.note.idPredare ='9' where idNota=24;
update scoala.note set scoala.note.idPredare ='10' where idNota=25;
update scoala.note set scoala.note.idPredare ='11' where idNota=26;