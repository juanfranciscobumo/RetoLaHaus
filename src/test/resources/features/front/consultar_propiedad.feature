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
      | pais   | barrio   | tipoPropiedad   | habitaciones   |
      | <pais> | <barrio> | <tipoPropiedad> | <habitaciones> |
    Cuando filtre por las cualidades de la propiedad
      | pais   | estado   | parqueaderos   | ba�os   | areaMinima   | areaMaxima   | apartamento   |
      | <pais> | <estado> | <parqueaderos> | <ba�os> | <areaMinima> | <areaMaxima> | <apartamento> |
    Entonces el usuario vera los datos del inmueble buscado
      | habitaciones   | ba�os   | parqueaderos   | apartamento   |
      | <habitaciones> | <ba�os> | <parqueaderos> | <apartamento> |
    Ejemplos: Datos de entrada
      | pais     | barrio   | tipoPropiedad | habitaciones | estado | parqueaderos | ba�os | areaMinima | areaMaxima | apartamento         |
      | Colombia | Medell�n | apartamentos  | 3            | Nuevo  | 1            | 2     | 30         | 110        | Riviera De Buler�as |
     # | Colombia | Bogot�           | casas                 | 3            | Nuevo           | 3            | 4     | 80         | 320        | Camino Del Bosque Casas |
     # | M�xico   | Ciudad de M�xico | departamentos         | 3            | Nuevo           | 1            | 2     | 80         | 120        | Residencial Progreso 88 |
     # | Colombia | Bogot�           | proyectos-de-vivienda | 3            | En construcci�n | 1            | 2     | 30         | 120        | Roble                   |
