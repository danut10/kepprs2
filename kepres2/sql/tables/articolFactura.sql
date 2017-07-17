drop table ARTICOL_FACTURA;

create table ARTICOL_FACTURA
(
	  FACTURA nvarchar2(10) not null 
	, NR_CRT number(2,0) not null
	, UM nvarchar2(15) not null
	, CANT decimal(10, 2) not null
	, PRET_UNITAR decimal(10, 2) not null
	, SUMA decimal(10, 2) not null
	, TVA decimal(10, 2) not null
	, TOTAL decimal(10, 2) not null
	, DESCRIERE nvarchar2(100) 
);

drop sequence SEQ_ARTICOL_FACTURA;
create sequence SEQ_ARTICOL_FACTURA;