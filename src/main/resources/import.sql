droptable if exists city;
droptable if exists hotel;

createtable city (id intprimarykeyauto_increment, name varchar, state varchar, country varchar);
createtable hotel(city int, name varchar, address varchar, zip varchar);

insertinto city(name, state, country) values ('SanFrancisco', 'CA', 'US');
insertintohotel(city, name, address, zip) values (1, 'ConradTreasury Place', 'William & George Streets', '4001')