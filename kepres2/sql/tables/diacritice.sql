drop table DIACRITICE;

CREATE TABLE DIACRITICE
(	
	ID NUMBER(*, 0) NOT NULL, 
	DIACRITICE NVARCHAR2(50) NOT NULL, 
	constraint PK_DIACRITICE primary key (ID)
);

drop sequence SEQ_DIACRITICE;
create sequence SEQ_DIACRITICE;