-- 1. Single Row Subquery : Returns only one value.
-- Find students older than the average age.
SELECT name, age FROM students 
WHERE age > (SELECT AVG(age) FROM students); -- Inner query runs first → returns average age Outer query compares age.

-- Multi-Row Subquery (IN) : Returns multiple values.
-- Find students in departments 1, 2, or 3.
SELECT name, dept_id FROM students
WHERE dept_id IN (1, 2, 3); -- Returns students whose dept_id is either 1, 2, or 3.

-- Using ANY / ALL

-- Age greater than at least one female student.(ANY)
SELECT name, age FROM students
WHERE age > ANY (SELECT age FROM students WHERE gender = 'Female'); 

-- Age greater than every Male students.(ALL)
SELECT name, age FROM students
WHERE age > ALL (SELECT age FROM students WHERE gender = 'Female'); 

-- Subquery in SELECT
SELECT name,
    (SELECT COUNT(*) 
     FROM enrollments e 
     WHERE e.student_id = s.student_id) AS total_courses
FROM students s; -- For each student, counts the number of courses they are enrolled in.

-- Subquery in FROM
SELECT temp.student_id, temp.total_courses
FROM (
    SELECT student_id, COUNT(*) AS total_courses
    FROM enrollments
    GROUP BY student_id
) temp
WHERE temp.total_courses > 1;