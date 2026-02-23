-- show databases;


-- create database and use it--
-- CREATE DATABASE idc IF NOT EXISTS;
-- USE idc;

show tables;


-- ================================
-- TABLE 1 : DEPARTMENTS
-- ================================

-- CREATE TABLE departments (

--     -- INT → Integer data type
--     -- PRIMARY KEY → Uniquely identifies each row
--     -- AUTO_INCREMENT → Automatically increases value by 1 for each new record
--     dept_id INT PRIMARY KEY AUTO_INCREMENT,

--     -- VARCHAR(100) → Variable length string (max 100 characters)
--     -- NOT NULL → Value cannot be empty
--     -- UNIQUE → No duplicate values allowed
--     dept_name VARCHAR(100) NOT NULL UNIQUE,

--     -- DEFAULT → Assigns default value if no value is provided
--     location VARCHAR(100) DEFAULT 'India'
-- );


-- ================================
-- TABLE 2 : STUDENTS
-- ================================

CREATE TABLE students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,

    name VARCHAR(100) NOT NULL, 
    email VARCHAR(100) UNIQUE, -- UNIQUE → No two students can have same email
    age INT CHECK (age >= 17), -- CHECK → Adds condition on column (age must be >= 17)
    gender ENUM('Male','Female','Other'),  -- ENUM → Allows only specific predefined values
    admission_date DATE DEFAULT (CURRENT_DATE),  -- DEFAULT CURRENT_DATE → Automatically stores today's date and must be written with parentheses.
 
    dept_id INT,  -- Foreign Key column

    CONSTRAINT fk_dept  -- CONSTRAINT → Used to give a name to the constraint
        FOREIGN KEY (dept_id)   -- FOREIGN KEY → Creates relationship between tables
        REFERENCES departments(dept_id)  -- REFERENCES → Points to primary key of parent table

        -- ON DELETE SET NULL → If department is deleted,
        -- student's dept_id becomes NULL instead of deleting student
        ON DELETE SET NULL
        -- ON UPDATE CASCADE → If dept_id changes in parent table,
        -- it automatically updates in student table
        ON UPDATE CASCADE
);


-- ================================
-- TABLE 3 : COURSES
-- ================================

CREATE TABLE courses (
    course_id INT PRIMARY KEY AUTO_INCREMENT,
    course_name VARCHAR(100) NOT NULL,
    credits INT CHECK (credits BETWEEN 1 AND 6)     -- CHECK → Credits must be between 1 and 6
);


-- ================================
-- TABLE 4 : ENROLLMENTS
-- ================================

-- This is a JUNCTION TABLE
-- It resolves Many-to-Many relationship between students and courses

CREATE TABLE enrollments (
    enrollment_id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT, -- F.K. to students(student_id)
    course_id INT,  -- F.K. to courses(course_id)
    grade VARCHAR(2),

    enrollment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- DEFAULT CURRENT_TIMESTAMP → Automatically stores current date & time
    FOREIGN KEY (student_id) 
        REFERENCES students(student_id)

        -- ON DELETE CASCADE → If student is deleted,
        -- automatically delete related enrollment records
        ON DELETE CASCADE,

    FOREIGN KEY (course_id) 
        REFERENCES courses(course_id)
);