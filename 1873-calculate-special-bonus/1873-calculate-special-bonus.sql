select employee_id , 
if((employee_id%2!=0) and (name not like 'm%'),salary,0) as bonus 
from employees
order by employee_id;