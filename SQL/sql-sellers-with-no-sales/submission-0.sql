-- Write your query below

WITH ctx_seller AS (
    SELECT o.seller_id FROM orders o WHERE EXTRACT(YEAR FROM sale_date) = 2020
)
SELECT s.seller_name FROM seller s LEFT JOIN ctx_seller ct ON s.seller_id = ct.seller_id WHERE ct.seller_id IS NULL ORDER BY s.seller_name