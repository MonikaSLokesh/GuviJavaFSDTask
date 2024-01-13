CREATE DATABASE employee;
USE employee;
CREATE TABLE  employee_details (
    empno INT PRIMARY KEY,
    ename VARCHAR(255),
    job VARCHAR(255),
    mgr INT,
    hiredate DATE,
    sal DECIMAL(10, 2),
    comm DECIMAL(10, 2),
    deptno INT
);
-- Insert all employee details
INSERT INTO employee_details (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES 
    (8369, 'SMITH', 'CLERK', 8902, '1990-12-18', 800.00, NULL, 20),
    (8499, 'ANYA', 'SALESMAN', 8698, '1991-02-20', 1600.00, 300.00, 30),
    (8521, 'SETH', 'SALESMAN', 8698, '1991-02-22', 1250.00, 500.00, 30),
    (8566, 'MAHADEVAN', 'MANAGER', 8839, '1991-04-02', 2985.00, NULL, 20),
    (8654, 'MOMIN', 'SALESMAN', 8698, '1991-09-28', 1250.00, 1400.00, 30),
    (8698, 'BINA', 'MANAGER', 8839, '1991-05-01', 2850.00, NULL, 30),
    (8882, 'SHIVANSH', 'MANAGER', 8839, '1991-06-09', 2450.00, NULL, 10),
    (8888, 'SCOTT', 'ANALYST', 8566, '1992-12-09', 3000.00, NULL, 20),
    (8839, 'AMIR', 'PRESIDENT', NULL, '1991-11-18', 5000.00, NULL, 10),
    (8844, 'KULDEEP', 'SALESMAN', 8698, '1991-09-08', 1500.00, 0.00, 30);
    SELECT * FROM employee_details;
    
    -- Question 1
    -- A. Write a query to display EName and Sal of employees whose salary is greater than or equal to 2200?
SELECT EName, Sal
FROM employee_details
WHERE Sal >= 2200;

-- B. Write a query to display details ofemployees who are not getting commission?
SELECT *
FROM employee_details
WHERE Comm IS NULL;

-- C. Write a query to display employee name and salary of those employees who don't have their salary in the range of2500 to 4000?
SELECT EName, Sal
FROM employee_details
WHERE Sal < 2500 OR Sal > 4000;


-- D. Write a query to display the name, job title and salary of employees who don't have a manager?
SELECT EName, Job, Sal
FROM employee_details
WHERE mgr IS NULL;

-- E. Write a query to display the name of an employee[whose name contains "A" as third alphabet?
SELECT EName
FROM employee_details
WHERE SUBSTRING(EName, 3, 1) = 'A';

-- F. Write a query to display the name of an employee whose name contains "T" as the last alphabet?
SELECT EName
FROM employee_details
WHERE SUBSTRING(EName, -1, 1) = 'T';





