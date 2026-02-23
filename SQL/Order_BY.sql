-- ORDER BY clause is used to sort the result set in ascending or descending order based on one or more columns.

-- Students ko name ke according ascending order me
SELECT * FROM students ORDER BY name ASC;

-- Students ko age ke according descending order me
SELECT * FROM students ORDER BY name DESC;

-- Multiple columns ke basis pe sorting (First by dept_id ascending, then by age descending)
SELECT name,dept_id,age FROM students ORDER BY dept_id ASC, age DESC;

-- ORDER BY with Aggregate Functions (Department wise student count sorted)
SELECT dept_id, COUNT(*) AS total_students
FROM students GROUP BY dept_id
ORDER BY total_students DESC;

-- ORDER BY with LIMIT (Top 2 youngest students)
SELECT name, age FROM students
ORDER BY age ASC LIMIT 2;