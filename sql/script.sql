create table winner (
	id integer not null auto_increment, 
	season integer not null,
	champion varchar(100) not null,
    score varchar(15) not null,	
	subChampion varchar(100) not null, 
	headquarters varchar(150) not null, 
	primary key (id)
);

INSERT INTO winner(season,champion,score,subChampion, headquarters) VALUES (2018, 'Real Madrid C. F.','3-1','Liverpool','Estadio Olímpico, Kiev, Ucrania');
INSERT INTO winner(season,champion,score,subChampion, headquarters) VALUES (2017, 'Real Madrid C. F.','4-1','Juventus F. C.','Millennium Stadium, Cardiff, Gales');
INSERT INTO winner(season,champion,score,subChampion, headquarters) VALUES (2016, 'Real Madrid C. F.','1-1 (5-3 pen.)','Atlético de Madrid','Giuseppe Meazza, Milán, Italia');
INSERT INTO winner(season,champion,score,subChampion, headquarters) VALUES (2015, 'F. C. Barcelona','3-1','Juventus F. C.','Estadio Olímpico, Berlín, Alemania');
INSERT INTO winner(season,champion,score,subChampion, headquarters) VALUES (2014, 'Real Madrid C. F.','3-1','Atlético de Madrid','Estádio da Luz, Lisboa, Portugal');
INSERT INTO winner(season,champion,score,subChampion, headquarters) VALUES (2013, 'F. C. Bayern','2-1','B. V. Borussia','Estadio de Wembley, Londres, Inglaterra');
