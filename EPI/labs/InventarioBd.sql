CREATE DATABASE Inventario;
USE Inventario;

CREATE TABLE Roles
(
    idRol char(30) PRIMARY KEY,
);

CREATE TABLE Empleados
(
    idEmpleado INT PRIMARY KEY,
    nombre     VARCHAR(100) NOT NULL,
    apellido   VARCHAR(100) NOT NULL,
    telefono   VARCHAR(15)  NOT NULL,
    direccion  VARCHAR(100) NOT NULL,
    idRol      char(30)     NOT NULL,
    FOREIGN KEY (idRol) REFERENCES Roles (idRol)
);

CREATE TABLE Clientes
(
    idCliente INT PRIMARY KEY,
    nombre    VARCHAR(100) NOT NULL,
    apellido  VARCHAR(100) NOT NULL,
    telefono  VARCHAR(15)  NOT NULL,
    direccion VARCHAR(100) NOT NULL
);


CREATE TABLE Productos
(
    idProducto  INT PRIMARY KEY,
    nombre      VARCHAR(100)   NOT NULL,
    descripcion VARCHAR(100)   NOT NULL,
    precio      DECIMAL(10, 2) NOT NULL
);

CREATE TABLE Proveedores
(
    idProveedor INT PRIMARY KEY,
    nombre      VARCHAR(100) NOT NULL,
    telefono    VARCHAR(15)  NOT NULL,
    direccion   VARCHAR(100) NOT NULL
);

CREATE TABLE Ventas
(
    idVenta    INT PRIMARY KEY,
    idCliente  INT            NOT NULL,
    idEmpleado INT            NOT NULL,
    fecha      DATE           NOT NULL,
    total      DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (idCliente) REFERENCES Clientes (idCliente),
    FOREIGN KEY (idEmpleado) REFERENCES Empleados (idEmpleado)
);

CREATE TABLE Compras
(
    idCompra    INT PRIMARY KEY,
    idProveedor INT            NOT NULL,
    idEmpleado  INT            NOT NULL,
    fecha       DATE           NOT NULL,
    total       DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (idProveedor) REFERENCES Proveedores (idProveedor),
    FOREIGN KEY (idEmpleado) REFERENCES Empleados (idEmpleado)
);

CREATE TABLE DetalleVenta
(
    idVenta    INT            NOT NULL,
    idProducto INT            NOT NULL,
    cantidad   INT            NOT NULL,
    precio     DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (idVenta) REFERENCES Ventas (idVenta),
    FOREIGN KEY (idProducto) REFERENCES Productos (idProducto)
);



CREATE TABLE DetalleCompra
(
    idCompra   INT            NOT NULL,
    idProducto INT            NOT NULL,
    cantidad   INT            NOT NULL,
    precio     DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (idCompra) REFERENCES Compras (idCompra),
    FOREIGN KEY (idProducto) REFERENCES Productos (idProducto)
);

CREATE TABLE Sucursales
(
    idSucursal INT PRIMARY KEY,
    nombre     VARCHAR(100) NOT NULL,
    telefono   VARCHAR(15)  NOT NULL,
    direccion  VARCHAR(100) NOT NULL,
    idEmpleado INT          NOT NULL,
    FOREIGN KEY (idEmpleado) REFERENCES Empleados (idEmpleado)

);

CREATE TABLE Pedidos
(
    idPedido   INT PRIMARY KEY,
    idSucursal INT            NOT NULL,
    idEmpleado INT            NOT NULL,
    fecha      DATE           NOT NULL,
    total      DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (idSucursal) REFERENCES Sucursales (idSucursal),
    FOREIGN KEY (idEmpleado) REFERENCES Empleados (idEmpleado)
);

CREATE TABLE DetallePedido
(
    idPedido   INT            NOT NULL,
    idProducto INT            NOT NULL,
    cantidad   INT            NOT NULL,
    precio     DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (idPedido) REFERENCES Pedidos (idPedido),
    FOREIGN KEY (idProducto) REFERENCES Productos (idProducto)
);
