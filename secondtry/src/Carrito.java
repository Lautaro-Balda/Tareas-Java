public class Carrito {
    
    String prodNombre1;
    String prodNombre2;
    String prodNombre3;
    Double precio1;
    Double precio2;
    Double precio3;
    Double precioTotal;

    public Carrito(String nombre1, int precio1, String nombre2, int precio2, String nombre3, int precio3) {

        this.prodNombre1 = nombre1;
        this.prodNombre2 = nombre2;
        this.prodNombre3 = nombre3;
        this.precio1 = (double) precio1;
        this.precio2 = (double) precio2;
        this.precio3 = (double) precio3;
    }


    public Double PrecioTotal() {
        precioTotal = this.precio1 + this.precio2 + this.precio3;
        return precioTotal;
    }

    public String getProdNombre1() {
        return prodNombre1;
    }
    public String getProdNombre2() {
        return prodNombre2;
    }
    public String getProdNombre3() {
        return prodNombre3;
    }

    public Double getPrecio1() {
        return precio1;
    }
    public Double getPrecio2() {
        return precio2;
    }
    public Double getPrecio3() {
        return precio3;
    }
}

