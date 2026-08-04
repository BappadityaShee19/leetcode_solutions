# Write your MySQL query statement below
SELECT name
FROM SalesPerson 
Where sales_id NOT IN (
    SELECT O.sales_id
    FROM Orders O
    join Company C ON O.com_id = C.com_id
    Where C.name = 'RED'
);