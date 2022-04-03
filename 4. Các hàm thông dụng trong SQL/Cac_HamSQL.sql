
select * from subject
where credit = (select max(credit) from subject);

select s.SubName, s.SubId, m.mark
from subject s join mark m on s.subid = m.subid
where mark = (select max(mark) from mark);

select S.StudentId, S.StudentName, AVG(Mark) as 'Diem Trung Binh'
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName
order by avg(mark) desc;





