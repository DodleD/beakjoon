-- 코드를 입력하세요
SELECT LEFT(PRODUCT_CODE,2) AS CATEGORY , COUNT(*) PRODUCTS
FROM PRODUCT
GROUP BY 1
ORDER BY 1