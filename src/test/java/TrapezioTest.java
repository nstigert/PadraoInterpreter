import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapezioTest {
    @Test
    void deveCalcularAreaTrapezio() {
        Trapezio trapezio = new Trapezio();
        trapezio.setBaseMaior(8.0);
        trapezio.setBaseMenor(4.0);
        trapezio.setAltura(5.0);

        assertEquals(30.0, trapezio.calcularArea());
    }
}