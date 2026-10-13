-- Write your query below

WITH sales AS (SELECT o.sales_id FROM orders o JOIN company c ON o.com_id = c.com_id WHERE c.name = 'CRIMSON')
SELECT sp.name FROM sales_person sp LEFT JOIN sales s ON s.sales_id = sp.sales_id WHERE s.sales_id IS NULL