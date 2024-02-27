#language: es
#encoding: iso-8859-1
#Author: juanfranciscobumo@gmail.com
@web
Caracter�stica: Consultar inmueble
  Yo como usuario de sobreplanos-staging
  Quiero consultar un apartamento
  Para consultar su precio

  Esquema del escenario: Consultar inmueble
    Dado que el usuario se encuentre en sobreplanos-staging
    Cuando ingrese los datos de la propiedad que desee consultar
      | barrio   | tipoPropiedad   | habitaciones   |
      | <barrio> | <tipoPropiedad> | <habitaciones> |
    Cuando filtre por las cualidades de la propiedad
      | ba�os   | areaMinima   | areaMaxima   | apartamento   |
      | <ba�os> | <areaMinima> | <areaMaxima> | <apartamento> |
    Entonces el usuario vera los datos del inmueble buscado
      | habitaciones   | ba�os   | apartamento   |
      | <habitaciones> | <ba�os> | <apartamento> |
    Ejemplos: Datos de entrada
      | barrio   | tipoPropiedad | habitaciones | ba�os | areaMinima | areaMaxima | apartamento |
      | Medell�n | apartamentos  | 1            | 1     | 33         | 530        | Ryo 53      |
