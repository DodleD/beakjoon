-- 코드를 입력하세요
SELECT SUBSTR(DATETIME,12, 2) AS A, COUNT(*)
FROM ANIMAL_OUTS
GROUP BY 1
HAVING A BETWEEN 9 AND 19
ORDER BY 1