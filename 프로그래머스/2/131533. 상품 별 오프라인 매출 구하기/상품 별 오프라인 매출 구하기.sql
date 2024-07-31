-- 코드를 입력하세요
SELECT PRODUCT_CODE, SUM(PRICE * SALES_AMOUNT)
FROM PRODUCT AS A
JOIN OFFLINE_SALE AS B ON (A.PRODUCT_ID = B.PRODUCT_ID)
GROUP BY 1
ORDER BY 2 DESC , 1