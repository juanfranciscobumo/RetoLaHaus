package com.sobreplanosstaging.herokuapp.models.front;

import com.fasterxml.jackson.annotation.JsonAlias;

public class FiltrosModel extends BusquedaModel {

    private String estado;
    private String parqueaderos;
    @JsonAlias("baños")
    private String bannos;
    private String areaMinima;
    private String areaMaxima;
    private String apartamento;

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public String getAreaMinima() {
        return areaMinima;
    }

    public void setAreaMinima(String areaMinima) {
        this.areaMinima = areaMinima;
    }

    public String getAreaMaxima() {
        return areaMaxima;
    }

    public void setAreaMaxima(String areaMaxima) {
        this.areaMaxima = areaMaxima;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getParqueaderos() {
        return parqueaderos;
    }

    public void setParqueaderos(String parqueaderos) {
        this.parqueaderos = parqueaderos;
    }

    public String getBannos() {
        return bannos;
    }

    public void setBannos(String bannos) {
        this.bannos = bannos;
    }
}
