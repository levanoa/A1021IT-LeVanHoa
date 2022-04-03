create database furama;

create user quanlyfurama;

create table vi_tri(
  ma_vi_tri int primary key not null,
  ten_vi_tri varchar(45)
);

create table trin_do(
    ma_trinh_do int primary key not null,
    ten_trinh_do varchar(45)
);

create table bo_phan (
    ma_bo_phan int primary key not null,
    ten_bo_phan varchar(45)
);

create table nhan_vien(
	ma_nhan_vien int primary key not null,
    ho_ten varchar(45),
    ngay_sinh date,
    so_cmnd varchar(45),
    luong double,
    so_dien_thoai varchar(45),
    email varchar(45),
    dia_chi varchar(45),
    ma_vi_tri int,
    ma_trinh_do int,
    ma_bo_phan int,
    foreign key (ma_vi_tri) references vi_tri( ma_vi_tri),
    foreign key (ma_trinh_do) references trinh_do (ma_trinh_do),
    foreign key (ma_bo_phan) references bo_phan (ma_bo_phan)
);
create table loai_khach(
    ma_loai_khach int not null primary key ,
    ten_loai_khach varchar(45)

);
 
create table khach_hang(
	ma_khach_hang int primary key not null,
    ma_loai_khach int,
    ho_ten varchar(45),
    ngay_sinh date,
    gioi_tinh bit(1),
    so_cmnd varchar(45),
    so_dien_thoai varchar(45),
    email varchar(45),
    dia_chi varchar(45),
    foreign key (ma_loai_khach) references loai_khach(ma_loai_khach)
);

create table kieu_thue(
       ma_kieu_thue int not null primary key,
       ten_kieu_thue varchar(45)
);

create table loai_dich_vu(
	ma_loai_dich_vu int not null primary key,
    ten_loai_dich_vu varchar(45)
);

create table dich_vu(
	ma_dich_vu int primary key not null,
    ten_dich_vu varchar(45),
    dien_tich int,
    chi_phi_thue double,
    so_nguoi_toi_da int,
    ma_kieu_thue int,
    ma_loai_dich_vu int,
    tieu_chuan_phong varchar(45),
    mo_ta_tien_nghi_khac varchar(45),
    dien_tich_ho_boi double,
    so_tang int,
    foreign key (ma_kieu_thue) references kieu_thue(ma_kieu_thue),
    foreign key (ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu)
);

create table hop_dong(
  ma_hop_dong int primary key not null,
  ngay_lam_hop_dogn datetime,
  ngay_ket_thuc datetime,
  tien_dat_coc double,
  ma_nhan_vien int,
  ma_khach_hang int,
  ma_dich_vu int,
  foreign key ( ma_nhan_vien) references nhan_vien(ma_nhan_vien),
  foreign key (ma_khach_hang) references khach_hang(ma_khach_hang),
  foreign key ( ma_dich_vu) references dich_vu (ma_dich_vu)
);

create table dich_vu_di_kem(
	ma_dich_vu_di_kem int primary key not null,
    ten_dich_vu_di_kem varchar(45),
    gia double,
    don_vi varchar(10),
    trang_thai varchar(45)
);

create table hop_dong_chi_tiet(
	ma_hop_dong_chi_tien int primary key not null,
    ma_hop_dong int,
    ma_dich_vu_di_kem int,
    so_luong int,
    foreign key( ma_hop_dong) references hop_dong(ma_hop_dong),
    foreign key (ma_dich_vu_di_kem) references dich_vu_di_kem (ma_dich_vu_di_kem)

);

insert into vi_tri value(1,'LE TAN');
insert into vi_tri value(2,'PHUC VU');
insert into vi_tri value(3,'CHUYEN VIEN');
insert into vi_tri value(4,'GIAM SAT');
insert into vi_tri value(5,'QUAN LY');
insert into vi_tri value(6,'GIAM DOC');


insert INTO trinh_do value(1,'TRUNG CAP');
insert INTO trinh_do value(2,'CAO ĐẲNG');
insert INTO trinh_do value(3,'ĐẠI HỌC');
insert INTO trinh_do value(4,'SAU ĐẠI HỌC');


insert INTO bo_phan value(1,'Sale');
insert INTO bo_phan value(2,'HANH CHINH');
insert INTO bo_phan value(3,'MAKETING');
insert INTO bo_phan value(4,'PHUC VU');
insert INTO bo_phan value(5,'QUAN LY');


insert INTO nhan_vien VALUE(1, 'LE A', '1992-10-20','230918212',5000000,'0909556556', 'A@GMAIL.COM','DA NANG', 3,1,2);
insert INTO nhan_vien VALUE(2, 'LE B', '1995-10-20','230919181',12000000,'0909556556', 'B@GMAIL.COM','GIA LAI', 3,3,2);
insert INTO nhan_vien VALUE(3, 'LE C', '1991-10-20','230918212',13000000,'0909556556', 'C@GMAIL.COM','QUAN TRI', 3,4,2);
insert INTO nhan_vien VALUE(4, 'LE D', '1995-10-20','239188212',4000000,'0909556556', 'D@GMAIL.COM','HUE', 4,3,5);
insert INTO nhan_vien VALUE(5, 'LE E', '1996-10-20','230918212',22000000,'0909556556', 'E@GMAIL.COM','GIA LAI', 4,2,5);
insert INTO nhan_vien VALUE(6, 'NGUYEN THI DUNG', '1998-10-20','230991812',5000000,'0909556556', 'H@GMAIL.COM','DA NANG', 1,2,4);
insert INTO nhan_vien VALUE(7, 'LE G', '1982-10-20','230918212',6000000,'0909556556', 'G@GMAIL.COM','NINH BINH', 2,1,4);
insert INTO nhan_vien VALUE(8, 'LE H', '1952-10-20','230918212',8000000,'0909556556', 'I@GMAIL.COM','HA NOI', 5,4,5);
insert INTO nhan_vien VALUE(9, 'LE I', '1962-10-20','239188212',7000000,'0909556556', 'K@GMAIL.COM','DA NANG', 6,4,5);
insert INTO nhan_vien VALUE(10, 'VO VAN NAM', '1998-10-20','230991812',5000000,'0909556556', 'H@GMAIL.COM','DA NANG', 1,2,1);
insert INTO nhan_vien VALUE(11, 'LE VAN DUONG', '1998-10-20','230991812',5000000,'0909556556', 'H@GMAIL.COM','DA NANG', 1,4,1);


insert INTO loai_khach value(1,'Diamond');
insert INTO loai_khach value(2,'Platinium');
insert INTO loai_khach value(3,'Gold');
insert INTO loai_khach value(4,'Silver');
insert INTO loai_khach value(5,'Member');


insert INTO khach_hang VALUE(1,1, 'Nguyen van A', '1992-10-20',1,'230918212','0909556556', 'A@GMAIL.COM','DA NANG');
insert INTO khach_hang VALUE(2,2, 'Nguyen van B', '1995-10-20',1,'230919181','0909556556', 'B@GMAIL.COM','GIA LAI');
insert INTO khach_hang VALUE(3,3, 'Nguyen van C', '1991-10-20',1,'230918212','0909556556', 'C@GMAIL.COM','QUAN TRI');
insert INTO khach_hang VALUE(4,4, 'Nguyen van D', '1995-10-20',1,'239188212','0909556556', 'D@GMAIL.COM','HUE');
insert INTO khach_hang VALUE(5,5, 'Nguyen van E', '1996-10-20',1,'230918212','0909556556', 'E@GMAIL.COM','GIA LAI');
insert INTO khach_hang VALUE(6,1, 'Nguyen van F', '1998-10-20',1,'230991812','0909556556', 'H@GMAIL.COM','DA NANG');
insert INTO khach_hang VALUE(7,3, 'Nguyen van G', '1982-10-20',1,'230918212','0909556556', 'G@GMAIL.COM','NINH BINH');
insert INTO khach_hang VALUE(8,5, 'Nguyen van H', '1952-10-20',1,'230918212','0909556556', 'I@GMAIL.COM','HA NOI');
insert INTO khach_hang VALUE(9,2, 'Nguyen van I', '1962-10-20',1,'239188212','0909556556', 'K@GMAIL.COM','DA NANG');


insert into kieu_thue value (1,'VILLAkieu_thue');
insert into kieu_thue VALUE (2,'HOUSE');
insert into kieu_thue VALUE (3,'PHONG');

insert INTO loai_dich_vu VALUE(1, ' VILLA');
insert INTO loai_dich_vu VALUE(2, ' HOUSE');
insert INTO loai_dich_vu VALUE(3, ' ROOM');


insert INTO dich_vu VALUE(1,'THUE VILLA', 50, 2000000, 4, 1, 1, '3 SAO', ' VIEW THANH PHO', 30, 3);
insert INTO dich_vu VALUE(2,'THUE HOUSE', 40, 1500000, 3, 2, 5, '2 SAO', ' VIEW BIEN', 30, 2);
insert INTO dich_vu VALUE(3,'THUE ROOM', 30, 100000, 2, 3, 2, '1 SAO', ' NO VIEW', 20, 1);


insert into hop_dong value(1,'2022-2-12','2022-2-28',2000000,10,1,1);
insert into hop_dong value(2,'2022-3-5','2022-3-20',4400000,11,2,2);


insert INTO dich_vu_di_kem VALUE(1, ' MASSAGE', 500000,'XXX','OPEN');
insert INTO dich_vu_di_kem VALUE(2, ' KARAOKE', 300000,'YYY','CLOSE');
insert INTO dich_vu_di_kem VALUE(3, ' THỨC ĂN', 200000,'ZZZ','OPEN');
insert INTO dich_vu_di_kem VALUE(4, ' NƯỚC UỐNG',150000,'GGG','OPEN');
insert INTO dich_vu_di_kem VALUE(5, ' THUE XE',300000,'HHH','OPEN');

insert into hop_dong_chi_tiet value(1,1,1,10);
insert into hop_dong_chi_tiet value(2,1,4,20);

/*2. Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.*/
select * FROM nhan_vien
where (ho_ten like 'h%' or ho_ten LIKE 't%' or ho_ten LIKE 'k%') AND length(ho_ten) <= 15;

/*3. Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.*/

select * from khach_hang
where ((year(curdate()) - year(ngay_sinh)) between 18 and 50) and ( dia_chi = 'Đà Nẵng' or dia_chi = 'Quảng Trị');

/* 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien
 (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) 
cho tất cả các khách hàng đã từng đặt phòng. (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra). */

select k.ma_khach_hang, k.ho_ten, h.ma_hop_dong,h.ngay_lam_hop_dong,h.ngay_ket_thuc, d.ten_dich_vu
from ((hop_dong h 
inner join khach_hang k on h.ma_khach_hang = k.ma_khach_hang)
inner join dich_vu d on d.ma_dich_vu = h.ma_dich_vu);

/*6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue,
 ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được khách 
 hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3). */
 
 select d.ma_dich_vu, d.ten_dich_vu, d.dien_tich, d.chi_phi_thue, l.ten_loai_dich_vu, h.ngay_lam_hop_dong
 from dich_vu d
 inner join  loai_dich_vu l  on  d.ma_loai_dich_vu = l.ma_loai_dich_vu
 inner join hop_dong h on h.ma_dich_vu = d.ma_dich_vu
 where (month(ngay_lam_hop_dong) not between 1 and 3) and (year(ngay_lam_hop_dong) <> 2021);


/*7. Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ
 đã từng được khách hàng đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021 */
 
 select d.ma_dich_vu, d.ten_dich_vu, d.dien_tich, d.so_nguoi_toi_da, d.chi_phi_thue, l.ten_loai_dich_vu, h.ngay_lam_hop_dong
 from dich_vu d
 inner join  loai_dich_vu l  on  d.ma_loai_dich_vu = l.ma_loai_dich_vu
 inner join hop_dong h on h.ma_dich_vu = d.ma_dich_vu
 where (year(ngay_lam_hop_dong) = 2020) and (year(ngay_lam_hop_dong) <> 2022);

 /* 8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau. */
 
 select distinct ho_ten  from khach_hang;
 
 
 /* 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng */
 
 select month(ngay_lam_hop_dong) as 'THANG' , count(ma_khach_hang) as 'SO LUONG DAT PHONG'
 from hop_dong
 group by month (ngay_lam_hop_dong);
 
 
 /* 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. 
 Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem 
 (được tính dựa trên việc sum so_luong ở dich_vu_di_kem). */
 
 
 
 
 
 /*11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”. */
 
 select  d.ma_dich_vu_di_kem, d.ten_dich_vu_di_kem
 from dich_vu_di_kem d
 inner join hop_dong_chi_tiet h1 on d.ma_dich_vu_di_kem = d.ma_dich_vu_di_kem
 inner join hop_dong h on h.ma_hop_dong = h1.ma_hop_dong
 inner join khach_hang k on k.ma_khach_hang = h.ma_khach_hang
 inner join loai_khach l on l.ma_loai_khach = k.ma_loai_khach
 where ten_loai_khach = 'Diamond' and k.dia_chi in ("quảng ngãi", "vinh")
 group by ma_dich_vu_di_kem;
 
 
 /*12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem 
 (được tính dựa trên việc sum so_luong ở dich_vu_di_kem),
 tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối 
 năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021. */
 
 select h.ma_hop_dong, n.ho_ten as 'họ tên nhân viên' , k.ho_ten as 'họ tên khách hàng', k.so_dien_thoai as 'sdt khách hàng', d.ten_dich_vu,
 sum(hdct.ma_dich_vu_di_kem) as 'số lượng dịch vụ'
 from  hop_dong h 
 inner join nhan_vien n on n.ma_nhan_vien = h.ma_nhan_vien
 inner join khach_hang k on k.ma_khach_hang = h.ma_khach_hang
 inner join dich_vu d on d.ma_dich_vu = h.ma_dich_vu
 inner join hop_dong_chi_tiet hdct on hdct.ma_hop_dong = h.ma_hop_dong
 
 where h.ngay_lam_hop_dong between '2021-1-1' and '2021-6-31'
 and not exists(select h.ma_hop_dong where h.ngay_lam_hop_dong between '2020-10-1' and '2020-12-31');
 
 
/*Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
(Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau). */

select dv.ten_dich_vu_di_kem, dv.gia, dv.don_vi,dv.trang_thai;

 
 
/* Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
 Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem). */
 
 select h.ma_hop_dong, dv.ten_dich_vu, dvdk.ten_dich_vu_di_kem,count(dvdk.ma_dich_vu_di_kem) as 'số lần sử dụng'
 from hop_dong h 
 inner join dich_vu dv on dv.ma_dich_vu = h.ma_dich_vu
 inner join hop_dong_chi_tiet h1 on h1.ma_hop_dong = h.ma_hop_dong
 inner join dich_vu_di_kem dvdk on dvdk.ma_dich_vu_di_kem = h1.ma_dich_vu_di_kem
 
 
 
 
 
 
 







































