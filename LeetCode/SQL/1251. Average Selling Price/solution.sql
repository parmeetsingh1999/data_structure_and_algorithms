SELECT p.product_id,
CASE
WHEN sum(us.units) > 0 THEN ROUND(SUM(us.units * p.price) / SUM(us.units), 2)
ELSE 0
END AS average_price
FROM Prices p LEFT JOIN UnitsSold us ON p.product_id = us.product_id AND us.purchase_date BETWEEN p.start_date AND p.end_date GROUP BY p.product_id
