use aliens;
show tables;
select * from student;
-- insert into student values(13,'belvet');

-- ORDER BY on multiple conditions
select Sname from student order by right(Sname,3) asc,Sname asc;
