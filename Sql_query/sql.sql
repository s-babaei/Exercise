-- 1-
select student.id, count(student.id) as courseCount,person_name from student
 inner join st_co onstudent.id=st_co.st_id
group by st_co.st_id
having courseCount>2;
-- 2-
select * from course where not exists(select * from st_co where st_co.co_id=course.id);

