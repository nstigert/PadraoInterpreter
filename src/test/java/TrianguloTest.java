import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {
    @Test
    void deveCalcularAreaTriangulo() {
        Triangulo triangulo = new Triangulo();
        triangulo.setBase(2.0);
        triangulo.setAltura(5.0);

        assertEquals(5.0, triangulo.calcularArea());
    }
}