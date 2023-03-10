public class App {
    public static void main(String[] args) throws Exception {
    
        
        Carrito miCarrito = new Carrito("Jabón en polvo", 40, "Esponjas", 10, "Chocolates", 100);

        

        String[] misProductos = {miCarrito.getProdNombre1(),miCarrito.getProdNombre2(),miCarrito.getProdNombre3()};
        Double[] precioDeMisProductos = {miCarrito.getPrecio1(),miCarrito.getPrecio2(),miCarrito.getPrecio3()};


        System.out.println(miCarrito.PrecioTotal());
    }
}
