package es.studium.ListaCompra;

import java.io.Serializable;

public class ArticuloAComprar implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//Atributos privados declarados
    private String descripcion;
    private double cantidad;
    private String unidad;

    //Constructor por parámetros
    public ArticuloAComprar(String descripcion, double cantidad, String unidad) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    //Métodos getter y setter
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    //Representa el objeto como cadena para mostrarlo
    @Override
    public String toString() {
        return "ArticuloAComprar{" + "descripcion='" + descripcion + '\'' + ","
        		+ " cantidad=" + cantidad + ", unidad='" + unidad + '\'' +'}';
    }
}

