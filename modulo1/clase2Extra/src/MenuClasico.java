public class MenuClasico extends Menu{

    public MenuClasico(double precioBase) {
        this.precioBase = precioBase;
    }
    @Override
    protected void armarMenu() {
        System.out.println("Armando menú clásico...");
    }

    @Override
    public double calcularPrecio() {
        return  this.precioBase;
    }
}
