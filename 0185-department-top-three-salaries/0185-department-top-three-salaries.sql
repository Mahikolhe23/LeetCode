select d.name  Department ,e.name Employee ,e.salary Salary
from employee e join department d on e.departmentid=d.id
where 3 > 
        (select count(distinct e2.salary) 
            from employee e2 
            where e2.salary>e.salary 
            and e2.departmentid=e.departmentid
        );