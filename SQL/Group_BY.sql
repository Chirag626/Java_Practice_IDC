-- Count students per department (Group by with Aggregate Function)
SELECT dept_id, COUNT(*) AS total_students FROM students
GROUP BY dept_id;

-- Average age per department (
SELECT dept_id, AVG(age) AS avg_age FROM students
GROUP BY dept_id;

-- Minimum & Maximum age per department
SELECT dept_id, MIN(age) AS youngest,MAX(age) AS oldest
FROM students GROUP BY dept_id;

-- Gender wise student count
SELECT gender, COUNT(*) AS total_students
FROM students GROUP BY gender;



-- Departments having more than 1 student.(Group by with having clause)
SELECT dept_id, COUNT(*) AS total_students FROM students
GROUP BY dept_id
HAVING COUNT(*) > 1;

-- Count only students older than 18 per department (Group by with WHERE clause)
SELECT dept_id, COUNT(*) AS total_students FROM students
WHERE age > 18 GROUP BY dept_id;


-- Count students per students per course (GROUP BY with Multiple Columns)
SELECT student_id, course_id, COUNT(*) AS total
FROM enrollments GROUP BY student_id, course_id;

