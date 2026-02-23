-- Add column
ALTER TABLE students ADD phone VARCHAR(15);

-- Modify column
ALTER TABLE students MODIFY phone VARCHAR(20);

-- Rename column
ALTER TABLE students RENAME COLUMN phone TO mobile_number;

-- Drop column
ALTER TABLE students DROP COLUMN mobile_number;

-- Add constraint
ALTER TABLE students ADD CONSTRAINT unique_email UNIQUE(email);

-- Drop constraint
ALTER TABLE students DROP INDEX unique_email;