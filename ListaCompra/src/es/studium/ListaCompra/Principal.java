package es.studium.ListaCompra;

public class Principal {
    public static void main(String[] args) {
        //Crea una lista de la compra
        ListaDeLaCompra lista = new ListaDeLaCompra("Mercadona.txt");

        //Agrega artículos a la lista
        lista.agregarProductoAComprar(new ArticuloAComprar("Paquete de arroz", 3, "Kg"));
        lista.agregarProductoAComprar(new ArticuloAComprar("Leche", 2, "L"));
        lista.agregarProductoAComprar(new ArticuloAComprar("Pan", 1, "U"));

        //Muestra la lista antes de eliminar un artículo
        System.out.println("Lista de la compra:");
        for (ArticuloAComprar articulo : lista.getArticulos()) {
            System.out.println(articulo);
        }

        //Elimina un artículo de la lista
        lista.eliminarArticulo("");

        //Muestra la lista después de editar la lista, si eliminas uno se bora de la lista si no, la lista sigue igual
        System.out.println("\nLista de la compra después de editar:");
        for (ArticuloAComprar articulo : lista.getArticulos()) {
            System.out.println(articulo);
        }

        //Guarda la lista en archivo de texto
        lista.guardarEnArchivoTexto();
        
    }
}

