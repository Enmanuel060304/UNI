CREATE DATABASE Bodega
GO

USE Bodega
GO

CREATE TABLE PRODUCTO
(
idprod char(7) PRIMARY KEY,
descripcion varchar(25),
existencias int, -- cantidad de producto existente
precio decimal(10,2) not null, -- precio costo
preciov decimal(10,2) not null, --precio venta
ganancia as preciov - precio, --campo calculado para calcular ganancia
CHECK(preciov>precio) --precio venta tiene que ser mayor al precio de compra
)
GO

CREATE TABLE PEDIDO
(
idpedido char(7),
idprod char(7),
cantidad int --cantidad de unidades vendidad del producto en el pedido
FOREIGN KEY(idprod) REFERENCES PRODUCTO(idprod)
)


/*
1.	Crear un procedimiento almacenado que ingrese los valores en la tabla PRODUCTOS, 
y deberá verificar que el código y nombre del producto no exista para poder insertarlo, 
en caso que el código o el nombre del producto ya exista enviar un mensaje que diga “ESTE PRODUCTO YA HA SIDO INGRESADO”.
*/

CREATE PROCEDURE sp_Ingresa_Valores
@ID char(7),
@Descrip varchar(25),
@existencias int, -- cantidad de producto existente
@precio decimal(10,2), -- precio costo
@preciov decimal(10,2)
AS

If (
	SELECT COUNT(*)
	FROM PRODUCTO
	WHERE idprod=@ID)=0
	INSERT INTO PRODUCTO(idprod,descripcion,existencias,precio, preciov)
	VALUES (@ID,@Descrip,@existencias,@precio,@preciov)
	else
	PRINT 'El PRODUCTO YA EXISTE'

GO

exec sp_Ingresa_Valores hola2, podrido,50,25.2,30.5

select * from PRODUCTO

/*
2.	Crear un procedimiento almacenado que permita realizar un pedido EN LA TABLA PEDIDO, 
este procedimiento deberá verificar si el código del producto ingresado existe en la tabla PRODUCTO en caso de que no se encuentre 
deberá mostrar un mensaje así como se muestra a continuación “ESTE PRODUCTO NO EXISTE “, además si la cantidad a pedir del producto 
es mayor a la existencia del producto deberá mostrar un mensaje que diga “EXISTENCIA DEL PRODUCTO INSUFICIENTE”.
En caso que la cantidad a pedir sea menor o igual deberá modificar (o actualizar) el valor de la existencia del producto.

*/

CREATE PROCEDURE sp_realiza_pedido
@idpedido char(7),
@idprod char(7),
@cantidad int
AS
    --verificar si el producto existe
    IF (
        SELECT COUNT(*)
        FROM PRODUCTO
        WHERE idprod=@idprod)=0
        PRINT 'ESTE PRODUCTO NO EXISTE'
    ELSE
        --verificar si la cantidad a pedir es mayor a la existencia
        IF (
            SELECT existencias
            FROM PRODUCTO
            WHERE idprod=@idprod)<@cantidad
            PRINT 'EXISTENCIA DEL PRODUCTO INSUFICIENTE'
        ELSE
            --actualizar la existencia del producto
            UPDATE PRODUCTO
            SET existencias=existencias-@cantidad
            WHERE idprod=@idprod
            --insertar el pedido
            INSERT INTO PEDIDO(idpedido,idprod,cantidad)
            VALUES (@idpedido,@idprod,@cantidad)

GO

ALTER PROCEDURE sp_realiza_pedido
@idpedido char(7),
@idprod char(7),
@cantidad int
    AS
    --verificar si el producto existe
    IF (
        SELECT COUNT(*)
        FROM PRODUCTO
        WHERE idprod=@idprod)=0
        BEGIN
        PRINT 'ESTE PRODUCTO NO EXISTE'
        RETURN
        END
    ELSE
        --verificar si la cantidad a pedir es mayor a la existencia
        IF (
            SELECT existencias
            FROM PRODUCTO
            WHERE idprod=@idprod)<@cantidad
            PRINT 'EXISTENCIA DEL PRODUCTO INSUFICIENTE'
        ELSE
            --actualizar la existencia del producto
            UPDATE PRODUCTO
            SET existencias=existencias-@cantidad
            WHERE idprod=@idprod
            --insertar el pedido
            INSERT INTO PEDIDO(idpedido,idprod,cantidad)
            VALUES (@idpedido,@idprod,@cantidad)

EXEC sp_realiza_pedido 1, hola2, 30