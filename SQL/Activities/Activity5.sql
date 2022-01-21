REM   Script: Activity5
REM   Solution for Act5


UPDATE sales_man SET grade = 200 WHERE salesman_city = 'Rome';
UPDATE sales_man SET grade = 300 WHERE salesman_name = 'James Hong';
UPDATE sales_man SET salesman_name = 'Pierre' WHERE salesman_name LIKE 'Makty%';
SELECT * FROM sales_man;

