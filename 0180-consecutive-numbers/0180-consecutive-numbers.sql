# Write your MySQL query statement below
WITH SequencedLogs AS (
    SELECT 
        num,
        LAG(num, 1) OVER (ORDER BY id) AS prev_num,
        LEAD(num, 1) OVER (ORDER BY id) AS next_num,
        LAG(id, 1) OVER (ORDER BY id) AS prev_id,
        id,
        LEAD(id, 1) OVER (ORDER BY id) AS next_id
    FROM Logs
)
SELECT DISTINCT num AS ConsecutiveNums
FROM SequencedLogs
WHERE num = prev_num 
  AND num = next_num
  AND id = prev_id + 1
  AND next_id = id + 1;