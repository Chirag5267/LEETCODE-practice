# Write your MySQL query statement below

select e.Name as employee
from Employee e
where e.Salary > ( 
    select salary 
    from Employee
    where Id=e.ManagerId
);

