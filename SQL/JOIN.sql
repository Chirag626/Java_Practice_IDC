-- JOIN is used to combine rows from two or more tables based on a related column.

-- In My schema:
-- students.dept_id → departments.dept_id
-- enrollments.student_id → students.student_id
-- enrollments.course_id → courses.course_id

-- Q: Why do we use JOIN?
-- Because relational databases store data in separate tables (normalization).JOIN helps retrieve combined data logically.


-- 1. INNER JOIN (Default JOIN) : Returns only matching records from both tables.

-- Students with their department.
SELECT s.name, d.dept_name
FROM students s INNER JOIN departments d
ON s.dept_id = d.dept_id; -- If a student does not have a department (NULL), that student will NOT appear.

-- 2. LEFT JOIN : Returns all records from left table and matching records from right table and If no match exists → NULL values are returned for right table columns.

-- All students with their department (if any).
SELECT s.name, d.dept_name
FROM students s LEFT JOIN departments d
ON s.dept_id = d.dept_id;


-- 3. RIGHT JOIN : Returns all records from right table and matching records from left table and If no match exists → NULL values are returned for left table columns.
-- All departments with students (if any).
SELECT s.name, d.dept_name
FROM students s
RIGHT JOIN departments d
    ON s.dept_id = d.dept_id;

-- FULL OUTER JOIN : Returns all records from both tables.MySQL does not support FULL OUTER JOIN directly.We simulate it using UNION/UNION ALL.
-- All students with their department (if any) + All departments with students (if any)     
SELECT s.name, d.dept_name
FROM students s LEFT JOIN departments d
ON s.dept_id = d.dept_id

UNION 

SELECT s.name, d.dept_name
FROM students s RIGHT JOIN departments d
ON s.dept_id = d.dept_id
WHERE s.name IS NULL; -- To avoid duplicates of matching records

-- 4. CROSS JOIN : Returns Cartesian Product of both tables (Every row of first table combined with every row of second table). It does not require ON condition.
-- All possible combinations of students and departments.
SELECT s.name, d.dept_name FROM students s CROSS JOIN departments d; -- If there are 4 students and 4 courses → 16 rows.

-- 5. SELF JOIN : Joining a table with itself. We use table aliases to differentiate between the two instances of the same table.
SELECT s1.name AS student1, s2.name AS student2 
FROM students s1
JOIN students s2
    ON s1.dept_id = s2.dept_id
    AND s1.student_id <> s2.student_id; -- List pairs of students in the same department (excluding pairing a student with themselves)

-- 6. Multiple JOINs : We can join more than two tables in a single query.
SELECT s.name, d.dept_name, c.course_name
FROM students s
JOIN departments d
    ON s.dept_id = d.dept_id
JOIN enrollments e
    ON s.student_id = e.student_id
JOIN courses c
    ON e.course_id = c.course_id;


-- Execution Order of JOINs: Although SQL is written starting with SELECT, internally it executes in this order: FROM → JOIN → ON → WHERE → GROUP BY → HAVING → SELECT → ORDER BY → LIMIT.

-- Students who are older than 18, count their courses, show only students having more than 1 course, and sort by highest course count."
SELECT s.name, COUNT(e.course_id) AS total_courses
FROM students s
JOIN enrollments e 
    ON s.student_id = e.student_id
WHERE s.age > 18
GROUP BY s.name
HAVING COUNT(e.course_id) > 1
ORDER BY total_courses DESC
LIMIT 3; -- Top 3 students with most courses among those older than 18.