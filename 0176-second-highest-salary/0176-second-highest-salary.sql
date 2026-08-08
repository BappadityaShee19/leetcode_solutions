# Write your MySQL query statement below
select max(salary) as secondHighestSalary
from Employee
where salary < (
    SELECT MAX(salary)
    from Employee
);

