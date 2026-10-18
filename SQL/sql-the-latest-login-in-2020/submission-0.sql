-- Write your query below

SELECT user_id, MAX(time_stamp) as "last_stamp" FROM logins WHERE extract(year from time_stamp::timestamp) = '2020' GROUP BY user_id