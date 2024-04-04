--Ejercicio Complementario
/*
Crear un procedimiento almacenado que calcule y muestre la edad de un empleado (Tabla Employees, campo BirthDate),
puede utilizar la siguiente instrucci�n para calcular la edad:

(CAST(DATEDIFF(dd, BirthDate,GETDATE())/365.25 as int))

Y por medio de una sentencia CASE deber� calcular y mostrar si el empleado esta por retirarse (mayores de 60 y menores o igual a 70 a�os), 
si ya est� jubilado (mayores a 70 a�os) o le falta otros a�os para trabajar (menores o iguales a 60 a�os)

El procedimiento recibe como par�metros el c�digo del empleado (EmployeeID) si el empleado no existe deber� mostrar un mensaje indic�ndolo.
*/

CREATE PROCEDURE sp_Muestra_Edad
AS
	SELECT BirthDate,
	(CAST(DATEDIFF(dd, BirthDate,GETDATE())/365.25 as int))
	AS Cumplea�os
	FROM Employees
	GROUP BY BirthDate
GO

EXEC sp_Muestra_Edad
go

ALTER PROCEDURE sp_Muestra_Edad
/*
*Jubilado >70
*por jubilarse >=60 and <=70 
*/
@CodEmployed INT
AS	
	DECLARE @Cumplea�os INT
	DECLARE @Cantidad_Empleados int
	SELECT	@Cantidad_Empleados= COUNT(EmployeeID) FROM [Employees] where EmployeeID=@CodEmployed
	IF (@Cantidad_Empleados>=1)--evalua que exista
	BEGIN
		SELECT
		CASE 
		WHEN (CAST(DATEDIFF(dd, BirthDate,GETDATE())/365.25 as int)) >=60 AND (CAST(DATEDIFF(dd, BirthDate,GETDATE())/365.25 as int))<70 
		THEN 'El empleado esta proximo a jubilarse entre 60 a 70'
		WHEN (CAST(DATEDIFF(dd, BirthDate,GETDATE())/365.25 as int)) >70
		THEN 'El Empleado ya esta jubilado mayor de 70'
		ELSE 'El empleado aun le falta mucho para jubilarse'
		end as comparison
		FROM Employees
		WHERE EmployeeID=@CodEmployed
		GROUP BY BirthDate
	END
ELSE
	BEGIN
		PRINT 'El empleado no existe'
	END
	
	
go

EXEC sp_Muestra_Edad 8