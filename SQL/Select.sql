-- 1. Basic SELECT statements
-- =========================

-- All columns
SELECT * FROM students;

-- Specific columns
SELECT name, age FROM students;

-- Rename column using alias
SELECT name AS student_name, age AS student_age FROM students;



-- 2. Filtering data with WHERE clause
-- ===================================
-- Age greater than 20
SELECT * FROM students WHERE age > 20;

-- Female students
SELECT * FROM students WHERE gender = 'Female';

-- Students from dept_id = 1
SELECT * FROM students WHERE dept_id = 1;

-- Multiple conditions (AND)
SELECT * FROM students WHERE age > 19 AND gender = 'Male';

-- OR condition
SELECT * FROM students WHERE dept_id = 1 OR dept_id = 2;

-- NOT condition
SELECT * FROM students WHERE NOT gender = 'Male';


-- 3. Between, IN, LIKE  operators
--================================

-- Age between 20 and 22
SELECT * FROM students WHERE age BETWEEN 20 AND 22;

-- Students from specific departments
SELECT * FROM students WHERE dept_id IN (1,2);

-- Name starts with 'S'
SELECT * FROM students WHERE name LIKE 'S%';

-- Name ends with 'a'
SELECT * FROM students WHERE name LIKE '%a';

-- Name contains 'ir'
SELECT * FROM students WHERE name LIKE '%ir%';


-- 4. Sorting results with ORDER BY
-- ================================
-- Ascending order
SELECT * FROM students
ORDER BY age ASC;

-- Descending order
SELECT * FROM students
ORDER BY age DESC;

-- Order by multiple columns
SELECT * FROM students 
ORDER BY dept_id ASC, age DESC;

-- 5. Distinct values
-- ==================
-- Distinct departments gives unique dept_id values
SELECT DISTINCT dept_id FROM students;
-- Distinct ages
SELECT DISTINCT age FROM students;

-- 6. Limiting results
-- =================
-- First 2 students
SELECT * FROM students LIMIT 2;

-- Skip 1, then show next 2 students
SELECT * FROM students LIMIT 1,2;

-- 
