package com.sobreplanosstaging.herokuapp.builders;

import com.sobreplanosstaging.herokuapp.interfaces.BusquedaInterface;
import com.sobreplanosstaging.herokuapp.models.front.BusquedaModel;

public class BusquedaBuilder implements BusquedaInterface {
    private String pais;
    private String ciudad;
    private String barrio;
    private String tipo_propiedad;
    private String habitaciones;
    private BusquedaModel busqueda = new BusquedaModel();

    public BusquedaBuilder(String pais) {
        this.pais = pais;
    }

    public static BusquedaBuilder pais(String pais) {
        return new BusquedaBuilder(pais);
    }

    public BusquedaBuilder tipoDePropiedad(String tipo_propiedad) {
        this.tipo_propiedad = tipo_propiedad;
        return this;
    }

    public BusquedaBuilder ciudad(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    public BusquedaBuilder barrio(String barrio) {
        this.barrio = barrio;
        return this;
    }

    public BusquedaModel habitaciones(String habitaciones) {
        this.habitaciones = habitaciones;
        return this.build();
    }

    @Override
    public BusquedaModel build() {
        busqueda.setPais(this.pais);
        busqueda.setTipo_propiedad(this.tipo_propiedad);
        busqueda.setHabitaciones(this.habitaciones);
        busqueda.setBarrio(this.barrio);
        busqueda.setCiudad(this.ciudad);
        return busqueda;
    }
}
