drop table TIP_FISIER;

CREATE TABLE TIP_FISIER
(	
	ID NUMBER(*, 0) NOT NULL, 
	NUME NVARCHAR2(50) NOT NULL, 
	EXTENSIE VARCHAR2(200), 
	constraint PK_TIP_FISIER primary key (ID)
);

drop sequence SEQ_TIP_FISIER;
create sequence SEQ_TIP_FISIER;