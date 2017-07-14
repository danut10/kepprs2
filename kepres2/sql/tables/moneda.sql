drop table MONEDA;

create table MONEDA
(
	  ID number(10, 0) not null
	, COD nvarchar2(3) not null
	, NUME nvarchar2(50) not null
	, IMPLICITA number(1,0) default 1 not null 
	, REFERINTA number(1,0) default 1 not null 
	, constraint PK_MONEDA primary key(ID)
);

drop sequence SEQ_MONEDA;
create sequence SEQ_MONEDA;