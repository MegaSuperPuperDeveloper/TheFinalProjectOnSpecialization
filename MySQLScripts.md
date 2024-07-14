Пункт 7 // Начинаем работу с MySQL
mysql
CREATE DATABASE HumanFriends;

Пункт 8 // Создаем таблицы и внешние ключи к ним для иерархии
use HumanFriends;
create table Animals (    
	id int primary key auto_increment not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null
);

create table Pets (
	id int not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null,
    foreign key (id) references Animal(id)
);

create table PackAnimals (
	id int not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null,
    foreign key (id) references Animal(id)
);

create table Cat (
	id int not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null,
    foreign key (id) references Pets(id)
);

create table Dog (
	id int not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null,
    foreign key (id) references Pets(id)
);

create table Hamster (
	id int not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null,
    foreign key (id) references Pets(id)
);

create table Camel (
	id int not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null,
    foreign key (id) references PackAnimals(id)
);

create table Horse (
	id int not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null,
    foreign key (id) references PackAnimals(id)
);

create table Donkey (
	id int not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null,
    foreign key (id) references PackAnimals(id)
);

Пункт 9
create table Animals (    
    id int primary key auto_increment not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null
);

create table Pets (
    id int not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null
);

create table PackAnimals (
    id int not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null
);

create table Cat (
    id int not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null
);

create table Dog (
    id int not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null
);

create table Hamster (
    id int not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null
);

create table Camel (
    id int not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null
);

create table Horse (  
    id int not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null
);

create table Donkey (
    id int not null,
    name varchar(45) not null,
    type varchar(15) not null,
    birthday date not null,
    commands varchar(100) not null
);

alter table Donkey
add constraint animal_id8
foreign key (id)
references Animals (id);

alter table Camel
add constraint animal_id7
foreign key (id)
references Animals (id);

alter table Horse
add constraint animal_id6
foreign key (id)
references Animals (id);

alter table Hamster
add constraint animal_id5
foreign key (id)
references Animals (id);

alter table Dog
add constraint animal_id4
foreign key (id)
references Animals (id);

alter table Cat
add constraint animal_id3
foreign key (id)
references Animals (id);

alter table PackAnimals
add constraint animal_id2
foreign key (id)
references Animals (id);

alter table Pets
add constraint animal_id
foreign key (id)
references Animals (id);

Пункт 9 // Вводим информацию в таблицы
insert into Animals (name, type, birthday, commands)
values
("Fido", "Dog", "2020-01-01", "Sit, Stay, Fetch"),
("Whiskers", "Cat", "2019-05-15", "Sit, Pounce"),
("Hammy", "Hamster", "2021-03-10", "Roll, Hide"),
("Buddy", "Dog", "2018-12-10", "Sit, Paw, Bark"),
("Thunder", "Horse", "2015-07-21", "Trot, Canter, Gallop"),
("Sandy", "Camel", "2016-11-03", "Walk, Carry Load"),
("Eeyore", "Donkey", "2017-09-18", "Walk, Carry Load, Bray"),
("Storm", "Horse", "2014-05-05", "Sit, Stay, Fetch");

insert into Pets (id, name, type, birthday, commands)
values
(1, "Fido", "Dog", "2020-01-01", "Sit, Stay, Fetch"),
(2, "Whiskers", "Cat", "2019-05-15", "Sit, Pounce"),
(3, "Hammy", "Hamster", "2021-03-10", "Roll, Hide"),
(4, "Buddy", "Dog", "2018-12-10", "Sit, Paw, Bark");

insert into PackAnimals (id, name, type, birthday, commands)
values
(5, "Thunder", "Horse", "2015-07-21", "Trot, Canter, Gallop"),
(6, "Sandy", "Camel", "2016-11-03", "Walk, Carry Load"),
(7, "Eeyore", "Donkey", "2017-09-18", "Walk, Carry Load, Bray"),
(8, "Storm", "Horse", "2014-05-05", "Sit, Stay, Fetch");

insert into Cat (id, name, type, birthday, commands)
values
(2, "Whiskers", "Cat", "2019-05-15", "Sit, Pounce");

insert into Dog (id, name, type, birthday, commands)
values
(1, "Fido", "Dog", "2020-01-01", "Sit, Stay, Fetch"),
(4, "Buddy", "Dog", "2018-12-10", "Sit, Paw, Bark");

insert into Hamster (id, name, type, birthday, commands)
values
(3, "Hammy", "Hamster", "2021-03-10", "Roll, Hide");

insert into Horse (id, name, type, birthday, commands)
values
(5, "Thunder", "Horse", "2015-07-21", "Trot, Canter, Gallop"),
(8, "Storm", "Horse", "2014-05-05", "Sit, Stay, Fetch");

insert into Camel (id, name, type, birthday, commands)
values
(6, "Sandy", "Camel", "2016-11-03", "Walk, Carry Load");

insert into Donkey (id, name, type, birthday, commands)
values
(7, "Eeyore", "Donkey", "2017-09-18", "Walk, Carry Load, Bray");

Пункт 10 // Удаляем Camel и объединяем оставшихся вьючих животных
drop table Camel;

delete from PackAnimals
where type = "Camel";

delete from Animals
where type = "Camel";

select * from Horse h
left join Donkey d on d.id = h.id;

Пункт 11 // Вносим в YoungAnimals всех животных, которым больше 1 года, но меньше 3 лет.
insert into YoungAnimals (name, type, birthday, commands, months)
select name, type, birthday, commands, TIMESTAMPDIFF(MONTH, birthday, CURRENT_TIMESTAMP()) AS "months"
from Animals
where TIMESTAMPDIFF(MONTH, birthday, CURRENT_TIMESTAMP()) > 1 and TIMESTAMPDIFF(MONTH, birthday, CURRENT_TIMESTAMP()) < 3;

Пункт 12 // Объединяем все таблицы в 1(так как Animals содержит всю информацию о животных, которые вообще есть, поэтому объединяем просто Animals и YoungAnimals).
select * from animals a 
join younganimals y on a.id = y.id;
