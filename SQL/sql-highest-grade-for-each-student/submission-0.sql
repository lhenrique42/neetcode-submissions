-- Write your query below

WITH RankedCoursers AS (
    SELECT student_id, exam_id, score, RANK() OVER (
        PARTITION BY student_id
        ORDER BY score DESC, exam_id ASC
    ) AS rk FROM exam_results
)
SELECT student_id, exam_id, score FROM RankedCoursers WHERE rk = 1 ORDER BY student_id ASC