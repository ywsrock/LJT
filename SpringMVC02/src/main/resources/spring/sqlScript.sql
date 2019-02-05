create table MyTestJPA(
id INTEGER primary key auto_increment,
name Varchar(20) not null,
mail Varchar(50),
age Integer
);

insert into MyTestJPA(name,mail,age) values('yws','yws@dis.com',18);
insert into MyTestJPA(name,mail,age) values('dis','www@www.com',19);