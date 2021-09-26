package com.sobreplanosstaging.herokuapp.utils.enums;

public enum TagsEnum {
    NAME("name"),
    JOB("job"),
    MEXICO("M�xico"),
    CODIGO_RESPUESTA("C�digo de respuesta");
    private String atributo;

    TagsEnum(String atributo) {
        this.atributo = atributo;
    }

    public String getAtributo() {
        return atributo;
    }
}
