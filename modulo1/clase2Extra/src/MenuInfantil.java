public class MenuInfantil extends Menu{
    private int cantidadDeJuguetes;

    public MenuInfantil( double precioBase, int cantidadDeJuguetes ) {
        this.precioBase = precioBase;
        this.cantidadDeJuguetes = cantidadDeJuguetes;
    }

    public int getCantidadDeJuguetes() {
        return cantidadDeJuguetes;
    }

    public void setCantidadDeJuguetes( int cantidadDeJuguetes ) {
        this.cantidadDeJuguetes = cantidadDeJuguetes;
    }

    @Override
    protected void armarMenu() {
        System.out.println("Armando menú infantil con " + this.getCantidadDeJuguetes() + " juguetes...");

    }

    @Override
    public double calcularPrecio() {
        return this.precioBase + this.getCantidadDeJuguetes() * 3;
    }
}
