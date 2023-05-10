class MenuVegetariano extends Menu {
    private int cantidadDeSalsa;
    private int cantidadDeEspecias;

    public MenuVegetariano(double preciobase, int cantidadDeSalsa, int cantidadDeEspecias) {
        this.precioBase = preciobase;
        this.cantidadDeSalsa = cantidadDeSalsa;
        this.cantidadDeEspecias= cantidadDeEspecias;
    }

    public int getCantidadDeSalsa() {
        return cantidadDeSalsa;
    }

    public void setCantidadDeSalsa( int cantidadDeSalsa ) {
        this.cantidadDeSalsa = cantidadDeSalsa;
    }

    public int getCantidadDeEspecias() {
        return cantidadDeEspecias;
    }

    public void setCantidadDeEspecias( int cantidadDeEspecias ) {
        this.cantidadDeEspecias = cantidadDeEspecias;
    }

    @Override
    protected void armarMenu() {
        System.out.println("Armando menú vegetariano con " + cantidadDeSalsa + " salsas...");
    }

    @Override
    public double calcularPrecio() {
        return this.precioBase * (1 + this.getCantidadDeEspecias() * 0.01) + this.getCantidadDeSalsa() * 2;

    }
}