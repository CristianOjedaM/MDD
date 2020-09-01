-- 
-- Uncomment me if you want :)
-- CREATE DATABASE ElectivaDesarrollo;

CREATE TABLE RegistroMiembros
(
    numeroMiembro Integer NOT NULL,
    cantidadPagar Integer NOT NULL
);

CREATE TABLE Carta
(
    numeroCorreo Integer NOT NULL,
    fecha date NOT NULL,
    nuevoMiembro Boolean NOT NULL,
    justificacionRechazo invalid NOT NULL
);

CREATE TABLE TarjetaMembresia
(
    numeroMembresia Integer NOT NULL,
    fechaInicio date NOT NULL,
    nombre String NOT NULL,
    fechaNacimiento date NOT NULL
);

CREATE TABLE Factura
(

);

CREATE TABLE Secretaria
(

);

CREATE TABLE Administrador
(

);

CREATE TABLE Miembro
(

);

CREATE TABLE LibroCartas
(

);

CREATE TABLE ClubVolley
(

);

CREATE TABLE Persona
(
    nombre String NOT NULL,
    apellido String NOT NULL,
    fechaNacimiento date NOT NULL,
    sexo String NOT NULL,
    numeroTelefono Integer NOT NULL,
    direccion String NOT NULL
);

