DROP TABLE FACTURA;

CREATE TABLE FACTURA
(
	  ID number(*, 0) not null 
	, SERIE nvarchar2(5) not null
	, NUMAR decimal(10, 2)
	, DTEMITERE date 
	, DTSCADENTA date 
	, SUMA decimal(10, 2) not null
	, TVA decimal(3, 2) not null
	, TOTAL decimal(10, 2) not null
	, DRAFT int not null
	, MEMO nvarchar2(100) 
	, constraint PK_FACTURA primary key(ID)
);

drop sequence SEQ_FACTURA;
create sequence SEQ_FACTURA;