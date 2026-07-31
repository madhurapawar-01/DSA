# Write your MySQL query statement below
#Madhura Pawar
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;