#language: es
#encoding: iso-8859-1
#Author: juanfranciscobumo@gmail.com
@api
Característica: Actualizar usuario
  Yo como usuario de reqres
  Quiero actualizar un usuario
  Para comprobar la opción de actualización de usuarios

  Antecedentes: Endpoint
    Dado que se conoce el endpoint del servicio

  Esquema del escenario: Actualizar usuario
    Cuando se ingresen los datos del usuario a actualizar
      | name   | job   |
      | <name> | <job> |
    Entonces se debe ver el usuario '<name>' y el job '<job>' con '<respuesta>'
    Ejemplos: Datos de entrada
      | name   | job     | respuesta   |
      | Carlos | Abogado | OK_CONSULTA |