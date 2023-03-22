# Write your MySQL query statement below
select name Employee   from employee e where salary>
(select salary from employee m where e.managerid=m.id);