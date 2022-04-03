
create database ViewProducts;

create user demo;

create table products (
   id int not null primary key,
   productCode int,
   procuctName varchar(50),
   productPrice double,
   productAmount int,
   productDescription varchar(50),
   productStatus varchar(50)
);


insert into products value(1,1,'AMO','20000',10,'BOT GIAC MOI',1);
insert into products value(2,2,'ZZZ','10000',22,'BOT MOI',1);
insert into products value(3,3,'XXX','10000',33,'BOT ',1);

select * FROM products;

create unique index products
on products (productCode);

CREATE INDEX composite
ON products (productPrice,procuctName);

EXPLAIN SELECT * FROM products;


CREATE VIEW VIEW_PRODUCT1 AS
select  productCode,procuctName, productPrice,productStatus
from products;



