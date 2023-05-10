abstract class Menu {
    protected double precioBase;

    // Template method
    public final void prepararMenu() {
        armarMenu();
        double precioFinal = calcularPrecio();
        System.out.println("El precio final del menú es: " + precioFinal);
    }


    protected abstract void armarMenu();

    protected abstract double calcularPrecio();
}
