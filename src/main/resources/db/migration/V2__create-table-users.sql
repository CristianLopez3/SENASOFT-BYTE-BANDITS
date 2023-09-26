
create table tb_users(

    id bigint not null auto_increment,
    name varchar(100) not null,
    username varchar(100) not null unique,
    password varchar(6) not null,
    role varchar(100) not null,
    city varchar(100) not null,
    birthDate date not null,
    education varchar(100),
    firstTime tinyint(1) default 1,

    primary key(id)

);
