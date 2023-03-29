select id,
case
    when p_id is null then 'Root'
    when p_id in(select id from tree) and id in(select P_id from tree) then 'Inner'
    else 'Leaf'
    end as type
from tree;