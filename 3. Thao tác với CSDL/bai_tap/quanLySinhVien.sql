insert INTO quanlysinhvien.class
VALUES (1, 'A1', '2008-12-20', 1);
INSERT INTO quanlysinhvien.Class
VALUES (2, 'A2', '2008-12-22', 1);
INSERT INTO quanlysinhvien.Class
VALUES (3, 'B3', current_date, 0);

select * from quanlysinhvien.student;

INSERT INTO quanlysinhvien.student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO quanlysinhvien.Student (StudentName, Address, Status, ClassId)
VALUES ('Hoa', 'Hai phong', 1, 1);
INSERT INTO quanlysinhvien.Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);


INSERT INTO quanlysinhvien.subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
INSERT INTO quanlysinhvien.mark
VALUES (1, 1, 1, 8, 1);

       
alter table quanlysinhvien.mark 
modify column mark int;
select * from quanlysinhvien.mark;

INSERT INTO quanlysinhvien.mark (SubId, StudentId, Mark, ExamTimes)
values(1, 2, 10, 2);
select *from student;
select * from class;
select * from subject;
select * from mark;

/*Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’*/

select * from student where StudentName like 'h%';

/*Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12*/
select * from class where month(startDate) = 12;

/*Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.*/

select * from subject where Credit >=3 and Credit <=5;

/*Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.*/

update student
set ClassId = 2 
where StudentName = 'Hung' ;

/*Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.*/
select student.StudentName, subject.SubName, mark.mark
FROM((mark 
inner join subject on mark.SubId = subject.SubId)
inner join student on student.StudentID = mark.StudentId)
order by mark.mark ;











