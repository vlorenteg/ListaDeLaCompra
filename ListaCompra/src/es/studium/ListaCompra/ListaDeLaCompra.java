package es.studium.ListaCompra;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListaDeLaCompra implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//Atributos declarados privados
	private String nombreLista;
    private List<ArticuloAComprar> articulos;

    //Constructor por defecto
    public ListaDeLaCompra() {
        this.articulos = new ArrayList<>();
    }
    //Costructor que recibe nombre de la lista
    public ListaDeLaCompra(String nombreLista) {
        this.nombreLista = nombreLista;
        this.articulos = new ArrayList<>();
    }
    //Obtiene el nomobre de la lista
    public String getNombreLista() {
        return nombreLista;
    }
    //Asigna el nombre de la lista
    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }
    //Método permite agregar nuevos artículos a la lista
    public void agregarProductoAComprar(ArticuloAComprar articulo) {
        articulos.add(articulo);
    }
    //Elimina artículos
    public void eliminarArticulo(String descripcionArticulo) {
        if (descripcionArticulo == null || descripcionArticulo.trim().isEmpty()) {
            System.out.println("La descripción del artículo está vacía. No se eliminará ningún artículo.");
            return;
        }
        articulos.removeIf(articulo -> articulo.getDescripcion().equalsIgnoreCase(descripcionArticulo));
    }
    //Devuelve la lista con los artículos
    public List<ArticuloAComprar> getArticulos() {
        return articulos;
    }

    //Método para guardar la lista en archivo de texto
    public void guardarEnArchivoTexto() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreLista + ".txt"))) {
            for (ArticuloAComprar articulo : articulos) {
                writer.println(articulo);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar en archivo de texto: " + e.getMessage());
        }
    }

}
