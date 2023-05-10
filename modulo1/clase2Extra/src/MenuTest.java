import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.Menu;


import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    public void testClasicoMenuPrice() {
        MenuClasico classic = new MenuClasico(100);
        classic.prepararMenu();
        assertEquals(100, classic.calcularPrecio(), "El precio del menú clásico debe ser 100");
    }

    @Test
    public void testInfantilMenuPrice() {
        MenuInfantil child = new MenuInfantil(100, 2);
        child.prepararMenu();
        assertEquals(106, child.calcularPrecio(), "El precio del menú infantil debe ser 106");
    }

    @Test
    public void testVegetarianoMenuPrice() {
        MenuVegetariano vegetarian = new MenuVegetariano(100, 3, 2);
        vegetarian.prepararMenu();
        assertEquals(108, vegetarian.calcularPrecio(), "El precio del menú vegetariano debe ser 108");
    }
}