drop table ANGAJAT;

create table ANGAJAT 
(
	  ID number(10, 0) not null 
	, COD nvarchar2(5) not null 
	, NUME nvarchar2(100) not null 
	, MEMO nvarchar2(500) 
	, constraint PK_ANGAJAT primary key (ID)
);  

drop sequence SEQ_ANGAJAT;
create sequence SEQ_ANGAJAT;