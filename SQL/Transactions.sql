-- A transaction is a group of SQL statements executed as a single unit.
-- A transaction must be either fully completed or fully failed. It cannot be left in an intermediate state.

-- ACID Properties
-- Atomicity → All or nothing
-- Consistency → Valid state before & after
-- Isolation → Transactions don't interfere
-- Durability → Once committed, data stays

SELECT * FROM departments; -- Before transaction

-- Start a transaction
BEGIN TRANSACTION;
-- Perform multiple SQL operations
UPDATE students
SET age = age - 1
WHERE student_id = 2;



-- If all operations succeed, commit the transaction
COMMIT;

-- if something goes wrong, roll back the transaction to undo changes.
ROLLBACK;