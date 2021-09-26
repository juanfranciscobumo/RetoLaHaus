package com.sobreplanosstaging.herokuapp.exceptions;

@SuppressWarnings("serial")
public class Exceptions extends AssertionError {
    public static final String CODIGO_USUARIO = "Se present� un error con el c�digo del usuario";
    public static final String CODIGO_DE_RESPUESTA = "El c�digo de respuesta es diferente al esperado";
    public static final String HABITACIONES = "Se present� un error con el campo habitaciones";
    public static final String PARQUEADEROS = "Se present� un error con el campo parqueaderos";
    public static final String PRECIO = "Se present� un error con el campo precio total del inmueble";
    public static final String CREACION_DE_USUARIO = "Error al comparar la creaci�n del usuario";
    public Exceptions(String message, Throwable cause) {
        super(message, cause);

    }
}
