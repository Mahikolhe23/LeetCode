# select v.customer_id as customer_id,count( t.visit_id) as count_no_trans
# from visits v join  transactions t
# on v.visit_id=t.visit_id
# where v.visit_id !=t.visit_id;
select customer_id,count(customer_id) as count_no_trans from visits 
where visit_id not in (select visit_id from transactions)
group by customer_id;