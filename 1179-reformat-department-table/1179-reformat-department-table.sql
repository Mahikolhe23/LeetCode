select id,
        sum(if(month='jan',revenue,null)) as jan_revenue,
        sum(if(month='feb',revenue,null)) as feb_revenue,
        sum(if(month='mar',revenue,null)) as mar_revenue,
        sum(if(month='apr',revenue,null)) as apr_revenue,
        sum(if(month='may',revenue,null)) as may_revenue,
        sum(if(month='jun',revenue,null)) as jun_revenue,
        sum(if(month='jul',revenue,null)) as jul_revenue,
        sum(if(month='aug',revenue,null)) as aug_revenue,
        sum(if(month='sep',revenue,null)) as sep_revenue,
        sum(if(month='oct',revenue,null)) as oct_revenue,
        sum(if(month='nov',revenue,null)) as nov_revenue,
        sum(if(month='dec',revenue,null)) as dec_revenue
from Department
group by id;