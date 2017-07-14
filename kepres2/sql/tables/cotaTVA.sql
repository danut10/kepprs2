drop table COTATVA;

create table COTATVA
(
	  ID number(10, 0) not null
	, COD nvarchar2(5) not null
	, NUME nvarchar2(50) not null
	, PROCENT decimal(10, 2) not null
	, constraint PK_COTATVA primary key(ID)
);

drop sequence SEQ_COTATVA;
create sequence SEQ_COTATVA;