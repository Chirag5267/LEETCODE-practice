# Write your MySQL query statement below

select e.Name as employee
from Employee e
where e.ManagerId IS NOT NULL
and e.Salary > ( 
    select salary 
    from Employee
    where Id=e.ManagerId
);

