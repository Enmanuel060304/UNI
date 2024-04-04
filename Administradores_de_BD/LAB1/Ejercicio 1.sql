CREATE PROCEDURE sp_Insertar_CategoriasSuCarnet
@ID INT,
@NombreCategoria VARCHAR(15)
AS
IF(SELECT COUNT(*) FROM Categories
	WHERE CategoryID=@ID OR CategoryName=@NombreCategoria)=0
	INSERT INTO Categories(CategoryName)
	VALUES (@NombreCategoria)
ELSE
PRINT 'Error la categoría ya existe'

EXEC sp_Insertar_CategoriasSuCarnet 1, 'Alimentos'
EXEC sp_Insertar_CategoriasSuCarnet 9, 'Alimentos'
EXEC sp_Insertar_CategoriasSuCarnet 10, 'Alimentos'

SELECT * FROM Categories

