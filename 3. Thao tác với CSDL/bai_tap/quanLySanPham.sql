
insert into customer value ( 1, 'Minh Quan', 10), ( 2, 'Ngoc Oanh', 20), ( 3,  'Hong Ha' , 50);
      
insert into order1 ( oid, cid, odate) value ( 1, 1 , '2008-12-22');
insert into order1 ( oid, cid, odate) value ( 2, 1 , '2006-3-23');
insert into order1 ( oid, cid, odate) value ( 3, 1 , '2006-3-16');
update order1 set cid = 2 where oid = 2;

insert into product value (1, 'MAT GIAT', 3);
insert into product value (2, 'TU LANH', 5);
insert into product value  (3, 'DIEU HOA', 7);
insert into product value (4, 'QUAT', 1);
insert into product value  (5, 'BEP DIEN',2);

insert into oderdetaili value (1,1,3);
insert into oderdetaili value (1,3,7);
insert into oderdetaili value (1,4,2);
insert into oderdetaili value (2,1,1);
insert into oderdetaili value (3,1,8);
insert into oderdetaili value (2,5,4);
insert into oderdetaili value (2,3,3);

/*Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách;
Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
(giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
 */
 select * from oderdetaili;
 select * from customer;
 select * from product;
 select order1.OId, order1.oDate, order1.oTotaLPrice from order1;
 
 select customer.CName, product.pName
 from ((((order1
 inner join customer on order1.cid = customer.cId)
 inner join oderdetaili on order1.oID = oderdetaili.OId)
 inner join product on product.pID = oderdetaili.pID
 ));
 
 select c.CName
 FROM customer c
 where c.Cid not in (select Cid from order1);
 

 
 
 
 
 
 
 
 








