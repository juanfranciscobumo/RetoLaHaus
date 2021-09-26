package com.sobreplanosstaging.herokuapp.models.front;

import com.fasterxml.jackson.annotation.JsonAlias;

public class FiltrosModel extends BusquedaModel {

    private String estado;
    private String precioDesde;
    private String precioHasta;
    private String parqueaderos;
    @JsonAlias("baños")
    private String bannos;
    private String areaMinima;
    private String areaMaxima;
    private String precio;

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
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

    public String getPrecioDesde() {
        return precioDesde;
    }

    public void setPrecioDesde(String precioDesde) {
        this.precioDesde = precioDesde;
    }

    public String getPrecioHasta() {
        return precioHasta;
    }

    public void setPrecioHasta(String precioHasta) {
        this.precioHasta = precioHasta;
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
