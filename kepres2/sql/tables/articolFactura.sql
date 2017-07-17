drop table ARTICOLFACTURA;

create table ARTICOLFACTURA
(
	  Factura nvarchar2(10) not null 
	, nrCrt number(10) not null
	, UM nvarchar2(25) not null
	, Cantitate decimal(10, 2) not null
	, Pret_Unitar decimal(10, 2) not null
	, Suma decimal(10, 2) not null
	, Tva decimal(10, 2) not null
	, Total decimal(10, 2) not null
	, Descriere nvarchar2(500) 
);

drop sequence SEQ_ARTICOLFACTURA;
create sequence SEQ_ARTICOLFACTURA;