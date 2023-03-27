select  distinct l1.num as ConsecutiveNums 
from logs l1 
join logs l2 on l2.id=l1.id+1 and l2.num=l1.num 
join logs l3 on l3.id=l1.id+2 and l3.num=l1.num;