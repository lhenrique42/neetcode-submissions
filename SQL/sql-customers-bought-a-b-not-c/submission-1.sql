-- Write your query below

WITH c_sells AS (
    SELECT c.customer_id, c.customer_name FROM customers c LEFT JOIN orders o ON c.customer_id = o.customer_id WHERE o.product_name = 'C'
),
b_sells AS (
    SELECT c.customer_id, c.customer_name FROM customers c JOIN orders o ON c.customer_id = o.customer_id WHERE o.product_name = 'B'
),
a_sells AS (
    SELECT c.customer_id, c.customer_name FROM customers c JOIN orders o ON c.customer_id = o.customer_id WHERE o.product_name = 'A'
)

SELECT a.customer_id, a.customer_name from a_sells a JOIN b_sells b ON b.customer_id = a.customer_id LEFT JOIN c_sells c ON c.customer_id = a.customer_id WHERE c.customer_id IS NULL GROUP BY a.customer_id, a.customer_name ORDER BY a.customer_name