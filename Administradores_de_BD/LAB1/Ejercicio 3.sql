CREATE PROCEDURE PROCE_TotalSuCarnet
AS
	SELECT OrderID,
	SUM(CONVERT (money, (UnitPrice*Quantity*(1-Discount)/100))*100)
	AS Total
	FROM [Order Details]
	GROUP BY OrderID
GO

EXEC PROCE_TotalSuCarnet

ALTER PROCEDURE PROCE_TotalSuCarnet
@Cod_orden INT
AS
	SELECT OrderID,
	SUM(CONVERT (MONEY,(UnitPrice*Quantity*(1-Discount)/100))*100)
AS Total
FROM [Order Details]
WHERE OrderID=@Cod_orden
GROUP BY OrderID
Go

EXEC PROCE_TotalSuCarnet 10248
EXEC PROCE_TotalSuCarnet 10242

ALTER PROCEDURE PROCE_TotalSuCarnet 
@Cod_orden int
AS
DECLARE @total INT --Declaracion de variables locales
SELECT @total=COUNT(orderid) FROM [Order Details] WHERE OrderID=@Cod_orden 
IF (@total>=1) --Evalua condicion
	BEGIN
		SELECT OD.OrderID,
		SUM(CONVERT (money,(OD.UnitPrice*Quantity*(1-Discount)/100))*100) as Total FROM [Order Details] OD
		WHERE OrderID=@Cod_orden GROUP BY OD.OrderID
		END 
ELSE
	BEGIN
		PRINT 'La orden no existe y el código es: ' +CONVERT(varchar(10),@Cod_orden)
	END
GO

EXEC PROCE_TotalSuCarnet 10248
EXEC PROCE_TotalSuCarnet 10242

