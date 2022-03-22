create database QuanlyBanHang1;

create user banhang;

create table QuanlyBanHang1.Customer(
    cId int not null primary key,
    CName varchar(50),
    cAge int not null
);
create table QuanlyBanHang1.Order1(
   OId int not null primary key,
   cId int not null,
   oDate DateTime not null,
   oTotaLPrice int,
   foreign key(cId) references quanlybanhang1.customer(cID)
);
create table QuanlyBanHang1.OderDetailI(
    oID int not null,
    pID int not null,
    odQTY  varchar(40),
    foreign key (oID) references quanlybanhang1.order1(OId),
    foreign key (pID) references quanlybanhang1.Product(pID)
);

create table QuanlyBanHang1.Product(
	pID int not null primary key auto_increment,
    pName varchar(40),
    pPrice int not null
);







