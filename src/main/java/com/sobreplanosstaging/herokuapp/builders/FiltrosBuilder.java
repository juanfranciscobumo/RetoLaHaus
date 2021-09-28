package com.sobreplanosstaging.herokuapp.builders;

import com.sobreplanosstaging.herokuapp.interfaces.FiltrosInterface;
import com.sobreplanosstaging.herokuapp.models.front.FiltrosModel;

public class FiltrosBuilder implements FiltrosInterface {
    private String estado;
    private String parqueaderos;
    private String bannos;
    private String areaMinima;
    private String areaMaxima;
    private String apartamento;
    private String pais;
    private FiltrosModel filtros = new FiltrosModel();

    public FiltrosBuilder(String estado) {
        this.estado = estado;
    }

    public static FiltrosBuilder estadoDeLaPropiedad(String estado) {
        return new FiltrosBuilder(estado);
    }

    public FiltrosBuilder pais(String pais) {
        this.pais = pais;
        return this;
    }

    public FiltrosBuilder apartamento(String apartamento) {
        this.apartamento = apartamento;
        return this;
    }

    public FiltrosBuilder areaMinima(String areaMinima) {
        this.areaMinima = areaMinima;
        return this;
    }

    public FiltrosBuilder areaMaxima(String areaMaxima) {
        this.areaMaxima = areaMaxima;
        return this;
    }

    public FiltrosBuilder parqueaderos(String parqueaderos) {
        this.parqueaderos = parqueaderos;
        return this;
    }

    public FiltrosModel bannos(String bannos) {
        this.bannos = bannos;
        return this.build();
    }

    @Override
    public FiltrosModel build() {
        filtros.setBannos(this.bannos);
        filtros.setEstado(this.estado);
        filtros.setParqueaderos(this.parqueaderos);
        filtros.setAreaMaxima(this.areaMaxima);
        filtros.setAreaMinima(this.areaMinima);
        filtros.setApartamento(this.apartamento);
        filtros.setPais(this.pais);
        return filtros;
    }
}
