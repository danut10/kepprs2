drop table FACTURA;

create table FACTURA
(
	  ID number(10, 0) not null 
	, SERIE nvarchar2(5) not null
	, NUMAR nvarchar2(10) not null
	, DT_EMITERE date 
	, DT_SCADENTA date 
	, SUMA decimal(10, 2) default 0 not null
	, TVA decimal(10, 2) default 0 not null
	, TOTAL decimal(10, 2) default 0 not null
	, DRAFT number(1, 0) default 1 not null 
	, MEMO nvarchar2(500)
	, ID_ANGAJAT number(10,0) not null
	, ID_MONEDA number(10,0) not null
	, constraint PK_FACTURA primary key(ID)
);

drop sequence SEQ_FACTURA;
create sequence SEQ_FACTURA;