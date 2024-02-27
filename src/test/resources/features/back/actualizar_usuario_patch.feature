#language: es
#encoding: iso-8859-1
#Author: juanfranciscobumo@gmail.com
@api
Caracter�stica: Actualizar usuario patch
  Yo como usuario de reqres
  Quiero actualizar un usuario
  Para comprobar la opci�n de actualizaci�n de usuarios

  Antecedentes: Endpoint
    Dado que se conoce el endpoint del servicio

  Esquema del escenario: Actualizar usuario
    Cuando se ingresen los datos del usuario a actualizar con patch
      | name   | job   | id   |
      | <name> | <job> | <id> |
    Entonces se debe ver el usuario '<name>' y el job '<job>' con '<respuesta>'
    Ejemplos: Datos de entrada
      | name   | job     | id | respuesta   |
      | Carlos | Abogado | 1  | OK_CONSULTA |