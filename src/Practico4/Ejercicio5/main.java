package Practico4.Ejercicio5;

public class main {
    public static void main(String[] args) {
        Avicola polloLosPinos = new Avicola();
        Producto huevoBlanco = new Producto("05/05/2021",1235,"05/04/2020","Granja Alkarrekin");
        Producto huevoColor = new Producto("04/04/2021",1236,"05/04/2020","Granja Alkarrekin");
        Producto huevoCodorniz = new Producto("03/03/2021",1237,"05/04/2020","Granja Alkarrekin");
        Producto polloFresco = new ProductoRefrigerado("10/03/2021",4441,"08/04/2020","Granja Los pinos", "51", -4);
        Producto milanesaPollo = new ProductoRefrigerado("21/03/2022",4442,"08/04/2020","Granja Los pinos","52", -4);
        Producto milanesaCerdo = new ProductoRefrigerado("23/03/2022",4443,"08/04/2020","Cagnoli","231", -4);
        Producto milanesaTernera = new ProductoRefrigerado("15/03/2021",4444,"08/04/2020","Cagnoli","5121", -4);
        Producto hamburguesa = new ProductoCongeladoPorNitrogeno("15/03/2021",4444,"08/04/2020","MCCain","123", -25, "Nitrogeno", 7.55);
        Producto papasFritas = new ProductoCongeladoPorAgua("15/03/2021",4444,"08/04/2020","MCCain","545", -35, 14566, 155000);
        Producto arvejas = new ProductoCongeladoPorAire("15/03/2021",4444,"08/04/2020","Cagnoli","871", -24, 15,28, 35, 40);

        polloLosPinos.agregarProducto(huevoBlanco);
        polloLosPinos.agregarProducto(huevoColor);
        polloLosPinos.agregarProducto(huevoCodorniz);
        polloLosPinos.agregarProducto(polloFresco);
        polloLosPinos.agregarProducto(milanesaPollo);
        polloLosPinos.agregarProducto(milanesaCerdo);
        polloLosPinos.agregarProducto(milanesaTernera);
        polloLosPinos.agregarProducto(hamburguesa);
        polloLosPinos.agregarProducto(papasFritas);
        polloLosPinos.agregarProducto(arvejas);



        System.out.println(polloLosPinos.toString());
    }
}
