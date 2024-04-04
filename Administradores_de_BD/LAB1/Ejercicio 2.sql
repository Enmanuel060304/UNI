CREATE PROCEDURE sp_Hay_ClientesSuCarnet
@ciudad varchar(15)
AS
SELECT 
CASE (SELECT COUNT(*) FROM Customer WHERE City=@ciudad)
    WHEN 0 THEN 'No hay Clientes en la ciudad de ' + @ciudad
ELSE 'Hay clientes en la ciudad de ' + @ciudad
END 

EXEC sp_Hay_ClientesSuCarnet 'Barcelona'
EXEC sp_Hay_ClientesSuCarnet 'New York'