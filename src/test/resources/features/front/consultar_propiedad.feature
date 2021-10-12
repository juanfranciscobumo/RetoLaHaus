#language: es
#encoding: iso-8859-1
#Author: juanfranciscobumo@gmail.com
@web
Característica: Consultar inmueble
  Yo como usuario de sobreplanos-staging
  Quiero consultar un apartamento
  Para consultar su precio

  Esquema del escenario: Consultar inmueble
    Dado que el usuario se encuentre en sobreplanos-staging
    Cuando ingrese los datos de la propiedad que desee consultar
      | pais   | barrio   | tipoPropiedad   | habitaciones   |
      | <pais> | <barrio> | <tipoPropiedad> | <habitaciones> |
    Cuando filtre por las cualidades de la propiedad
      | pais   | estado   | parqueaderos   | baños   | areaMinima   | areaMaxima   | apartamento   |
      | <pais> | <estado> | <parqueaderos> | <baños> | <areaMinima> | <areaMaxima> | <apartamento> |
    Entonces el usuario vera los datos del inmueble buscado
      | habitaciones   | baños   | parqueaderos   | apartamento   |
      | <habitaciones> | <baños> | <parqueaderos> | <apartamento> |
    Ejemplos: Datos de entrada
      | pais     | barrio   | tipoPropiedad | habitaciones | estado | parqueaderos | baños | areaMinima | areaMaxima | apartamento         |
      | Colombia | Medellín | apartamentos  | 3            | Nuevo  | 1            | 2     | 30         | 110        | Riviera De Bulerías |
     # | Colombia | Bogotá           | casas                 | 3            | Nuevo           | 3            | 4     | 80         | 320        | Camino Del Bosque Casas |
     # | México   | Ciudad de México | departamentos         | 3            | Nuevo           | 1            | 2     | 80         | 120        | Residencial Progreso 88 |
     # | Colombia | Bogotá           | proyectos-de-vivienda | 3            | En construcción | 1            | 2     | 30         | 120        | Roble                   |
