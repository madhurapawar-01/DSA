# Write your MySQL query statement below
select u.name as name,COALESCE(SUM(r.distance), 0) as travelled_distance 
from Users u
 left join Rides r
on u.id =r.user_id
GROUP BY u.id, u.name
ORDER BY travelled_distance DESC, name ASC;
