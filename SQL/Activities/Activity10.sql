REM   Script: Activity10
REM   Solution for Act10

select * from orders;

create table orders(  
    order_no int primary key, purchase_amount float, order_date date,  
    customer_id int, salesman_id int);

INSERT ALL  
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)   
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)  
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)  
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)  
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)  
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)  
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)  
SELECT 1 FROM DUAL;

SELECT SUM(purchase_amount) totalamount FROM orders;

SELECT AVG(purchase_amount) avgamount FROM orders;

SELECT MAX(purchase_amount) maxamount FROM orders;

SELECT MIN(purchase_amount) minamount FROM orders;

SELECT COUNT(salesman_id) cnt FROM orders GROUP BY salesman_id;

SELECT SUM(purchase_amount) totalamount FROM orders;

SELECT AVG(purchase_amount) avgamount FROM orders;

SELECT MAX(purchase_amount) maxamount FROM orders;

SELECT MIN(purchase_amount) minamount FROM orders;

SELECT COUNT(salesman_id) cnt FROM orders;

SELECT SUM(purchase_amount) totalamount FROM orders;

SELECT AVG(purchase_amount) avgamount FROM orders;

SELECT MAX(purchase_amount) maxamount FROM orders;

SELECT MIN(purchase_amount) minamount FROM orders;

SELECT COUNT(DISTINCT(salesman_id)) cnt FROM orders;

SELECT customer_id, MAX(purchase_amount) highest_amount FROM orders GROUP BY customer_id;

SELECT salesman_id, MAX(purchase_amount) highest_amount FROM orders WHERE order_date = '2012/08/17' GROUP BY salesman_id;

SELECT salesman_id, MAX(purchase_amount) highest_amount FROM orders WHERE order_date = TO_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id;

SELECT salesman_id, oredr_date, MAX(purchase_amount) highest_amount FROM orders WHERE order_date = TO_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id;

SELECT salesman_id, order_date, MAX(purchase_amount) highest_amount FROM orders WHERE order_date = TO_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id;

SELECT salesman_id, order_date, MAX(purchase_amount) highest_amount FROM orders WHERE order_date = TO_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

SELECT customer_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders 
GROUP BY customer_id, order_date HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

SELECT customer_id, order_date, MAX(purchase_amount) Max_Amount FROM orders GROUP BY customer_id, order_date HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001);

INSERT ALL 
    INTO VALUES(3007, 'Brad Davis', 'New York', 200, 5001);

    INTO VALUES(3005, 'Graham Zusi', 'California', 200, 5002); 


    INTO VALUES(3008, 'Julian Green', 'London', 300, 5002); 


    INTO VALUES(3004, 'Fabian Johnson', 'Paris', 300, 5006); 


    INTO VALUES(3009, 'Geoff Cameron', 'Berlin', 100, 5003); 


    INTO VALUES(3003, 'Jozy Altidor', 'Moscow', 200, 5007); 


    INTO VALUES(3001, 'Brad Guzan', 'London', 300, 5005); 


SELECT 1 FROM DUAL;

INSERT ALL 
    INTO customers VALUES(3007, 'Brad Davis', 'New York', 200, 5001);

    INTO customers VALUES(3005, 'Graham Zusi', 'California', 200, 5002); 


    INTO customers VALUES(3008, 'Julian Green', 'London', 300, 5002); 


    INTO customers VALUES(3004, 'Fabian Johnson', 'Paris', 300, 5006); 


    INTO customers VALUES(3009, 'Geoff Cameron', 'Berlin', 100, 5003); 


    INTO customers VALUES(3003, 'Jozy Altidor', 'Moscow', 200, 5007); 


    INTO customers VALUES(3001, 'Brad Guzan', 'London', 300, 5005); 


SELECT 1 FROM DUAL;

INSERT ALL 
    INTO customers VALUES(3007, 'Brad Davis', 'New York', 200, 5001) 
    INTO customers VALUES(3005, 'Graham Zusi', 'California', 200, 5002) 
    INTO customers VALUES(3008, 'Julian Green', 'London', 300, 5002) 
    INTO customers VALUES(3004, 'Fabian Johnson', 'Paris', 300, 5006) 
    INTO customers VALUES(3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
    INTO customers VALUES(3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
    INTO customers VALUES(3001, 'Brad Guzan', 'London', 300, 5005) 
SELECT 1 FROM DUAL;

SELECT * FROM customers;

CREATE TABLE sales_man (  
    salesman_id int,  
    salesman_name varchar2(32),  
    salesman_city varchar2(32),  
    commission int  
);

INSERT into sales_man values (5001, 'James Hong', 'New York', 15);

INSERT into sales_man values (5002, 'Nail Knite', 'Paris', 13);

INSERT into sales_man values (5003, 'Pit Alex', 'Rome', 12);

INSERT into sales_man values (5004, 'Jules Namis', 'Hawaii', 18);

INSERT into sales_man values (5005, 'Hulos Rime', 'London', 20);

INSERT into sales_man values (5006, 'Makty Hame', 'Cape Town', 22);

SELECT * FROM customers;

SELECT * FROM orders;

SELECT * FROM sales_man;

SELECT o.order_no, o.purchase_amount, o.order_date FROM orders o JOIN customers c on c.customer_id = o.customer_id WHERE o.customer_id = 3007;

SELECT * FROM customers;

SELECT * FROM orders;

SELECT * FROM sales_man;

SELECT o.order_no, o.purchase_amount, o.order_date, s.salesman_city FROM order o JOIN sales_man s ON o.salesman_id = s.salesman_id WHERE s.salesman_city = 'New York';

SELECT o.order_no, o.purchase_amount, o.order_date, s.salesman_city FROM orders o JOIN sales_man s ON o.salesman_id = s.salesman_id WHERE s.salesman_city = 'New York';

SELECT * FROM customers;

SELECT * FROM orders;

SELECT * FROM sales_man;

ALTER TABLE sales_man  
ADD grade int;

UPDATE sales_man SET grade = 100;

SELECT * FROM sales_man;

UPDATE sales_man SET grade = 200 WHERE salesman_city = 'Rome';

UPDATE sales_man SET grade = 300 WHERE salesman_name = 'James Hong';

SELECT * FROM customers;

SELECT * FROM orders;

SELECT * FROM sales_man;

UPDATE sales_man SET grade = 400 WHERE salesman_name = 'Makty Hame';

SELECT * FROM sales_man;

UPDATE sales_man SET grade = 500 WHERE salesman_name = 'Hulos Rime';

SELECT * FROM sales_man;

SELECT * FROM customers;

SELECT * FROM orders;

SELECT * FROM sales_man;

SELECT COUNT(*) FROM customers WHERE grade >= (SELECT AVG(grade) FROM sames_man WHERE salesman_city = 'New York');

SELECT COUNT(*) FROM customers WHERE grade >= (SELECT AVG(grade) FROM sales_man WHERE salesman_city = 'New York');

SELECT * FROM orders WHERE salesman_id in (SELECT salesman_id FROM customers WHERE customer_id = 3007);

SELECT * FROM orders WHERE salesman_id in (SELECT DISTINCT salesman_id FROM customers WHERE customer_id = 3007);

SELECT * FROM orders WHERE salesman_id in (SELECT DISTINCT salesman_id FROM orders WHERE customer_id = 3007);

SELECT * FROM orders WHERE salesman_id in (SELECT DISTINCT salesman_id FROM orders WHERE customer_id = 3007);

SELECT * FROM orders WHERE salesman_id in (SELECT salesman_id FROM sales_man WHERE salesman_city = 'New York');

SELECT * FROM orders WHERE salesman_id in (SELECT salesman_id FROM sales_man WHERE salesman_city = 'New York');

SELECT * FROM sales_man;

SELECT * FROM orders WHERE salesman_id in (SELECT salesman_id FROM sales_man WHERE commission = MAX(commission));

SELECT * FROM orders WHERE commission in (SELECT Max(commission) from sales_man);

SELECT * FROM sales_man;

SELECT Max(COMMISSION) from sales_man;

SELECT * FROM orders;

SELECT * FROM orders;

SELECT * FROM sales_man;

SELECT * FROM orders WHERE salesman_id in (SELECT salesman_id FROM sales_man WHERE commission in (SELECT MAx(commission) from sales_man));

SELECT * FROM sales_man;

SELECT * FROM orders WHERE salesman_id in (SELECT salesman_id FROM sales_man WHERE commission in (SELECT MAx(commission) from sales_man));

