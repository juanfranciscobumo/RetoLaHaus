#language: es
#encoding: iso-8859-1
#Author: juanfranciscobumo@gmail.com
@api
Caracter�stica: Buscar usuario
  Yo como usuario de reqres
  Quiero buscar un usuario
  Para consultar si existe en regress

  Antecedentes: Endpoint
    Dado que se conoce el endpoint del servicio

  Esquema del escenario: Buscar usuario
    Cuando se ingrese el c�digo del usuario a consultar '<codigo>'
    Entonces se debe mostrar el usuario <codigo> y la '<respuesta>'
    Ejemplos: Datos de entrada
      | codigo | respuesta   |
      | 2      | OK_CONSULTA |
