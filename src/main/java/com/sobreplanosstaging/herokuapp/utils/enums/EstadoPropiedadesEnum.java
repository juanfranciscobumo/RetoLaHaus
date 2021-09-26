package com.sobreplanosstaging.herokuapp.utils.enums;

public enum EstadoPropiedadesEnum {
    USADO("Usado"),
    NUEVO("Nuevo"),
    FINALIZADO("Finalizado"),
    EN_CONSTRUCCCION("En construcción");
    private String atributo;

    EstadoPropiedadesEnum(String atributo) {
        this.atributo = atributo;
    }

    public String getAtributo() {
        return atributo;
    }
}
