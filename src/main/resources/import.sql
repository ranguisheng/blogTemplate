drop table if exists city;
drop table if exists hotel;

create table city (id intprimarykeyauto_increment, name varchar, state varchar, country varchar);
create table hotel(city int, name varchar, address varchar, zip varchar);

insert into city(name, state, country) values ('SanFrancisco', 'CA', 'US');
insert intohotel(city, name, address, zip) values (1, 'ConradTreasury Place', 'William & George Streets', '4001')