-- =========================
-- INSERT INTO departments
-- =========================
INSERT INTO departments (dept_name, location) VALUES
('Computer Science', 'Delhi'),
('Mechanical', 'Mumbai'),
('Electrical', 'Bangalore'),
('Civil', 'Pune');  -- Extra department (no student)


-- =========================
-- INSERT INTO students
-- =========================
INSERT INTO students (name, email, age, gender, dept_id) VALUES
('Chirag', 'chirag@gmail.com', 21, 'Male', 1),
('Rianchal', 'rianchal@gmail.com', 20, 'Male', 1),
('Sumit', 'sumit@gmail.com', 22, 'Male', 2),
('Komal', 'komal@gmail.com', 21, 'Female', 3),
('Sneha', 'sneha@gmail.com', 19, 'Female', NULL);  -- No department


-- =========================
-- INSERT INTO courses
-- =========================
INSERT INTO courses (course_name, credits) VALUES
('Java', 4),
('DBMS', 3),
('Thermodynamics', 5),
('Machine Design', 4); -- Extra course (no enrollment)


-- =========================
-- INSERT INTO enrollments
-- =========================
INSERT INTO enrollments (student_id, course_id, grade) VALUES
(1, 1, 'A'),  -- Chirag → Java
(1, 2, 'B'),  -- Chirag → DBMS
(2, 1, 'A'),  -- Rianchal → Java
(3, 3, 'B');  -- Sumit → Thermodynamics