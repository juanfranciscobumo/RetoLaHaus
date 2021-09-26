#language: es
#encoding: iso-8859-1
#Author: juanfranciscobumo@gmail.com
@web
Caracter�stica: Consultar propiedad
  Yo como usuario de sobreplanos-staging
  Quiero consultar un apartamento
  Para consultar su precio

  Esquema del escenario: Consultar propiedad
    Dado que el usuario se encuentre en sobreplanos-staging
    Cuando ingrese los datos de la propiedad que desee consultar
      | pais   | ciudad   | barrio   | tipo_propiedad   | habitaciones   |
      | <pais> | <ciudad> | <barrio> | <tipo_propiedad> | <habitaciones> |
    Cuando filtre por las cualidades de la propiedad
      | pais   | estado   | precioDesde   | precioHasta   | parqueaderos   | ba�os   | areaMinima   | areaMaxima   | precio   |
      | <pais> | <estado> | <precioDesde> | <precioHasta> | <parqueaderos> | <ba�os> | <areaMinima> | <areaMaxima> | <precio> |
    Entonces el usuario vera los datos del inmueble buscado
      | habitaciones   | ba�os   | parqueaderos   | precio   |
      | <habitaciones> | <ba�os> | <parqueaderos> | <precio> |
    Ejemplos: Datos de entrada
      | pais     | ciudad           | barrio     | tipo_propiedad | habitaciones | estado | precioDesde | precioHasta | parqueaderos | ba�os | areaMinima | areaMaxima | precio |
      | Colombia | Medell�n         | Medell�n   | apartamentos   | 3            | Nuevo  | 100000000   | 500000000   | 1            | 2     | 70         | 110        | 463    |
      | Colombia | Bogot�           | Bogot�     | casas          | 3            | Usado  | 200000000   | 600000000   | 1            | 2     | 30         | 200        | 285    |
      | M�xico   | Ciudad de M�xico | Xochimilco | casas          | 3            | Usado  | 1000000     | 9000000     | 2            | 2     | 110        | 370        | 8.42   |