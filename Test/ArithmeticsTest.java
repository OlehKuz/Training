import static org.junit.jupiter.api.Assertions.*;

class ArithmeticsTest {
    private static Arithmetics a;

    @org.junit.jupiter.api.BeforeAll
    static void setUp() {
        a = new Arithmetics();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    
    @org.junit.jupiter.api.Test
    void timeoutNotExceeded(){
        assertTimeout(Duration.ofMillis(1000),()-> {
            a.div(14, 7);
        });
    }

    @org.junit.jupiter.api.Test
    void add() {
        double res = a.add(3, 7);
        assertNotNull(a);
    }

    @org.junit.jupiter.api.Test
    void deduct() {
        double res = a.deduct(3, 7);
        assertEquals(-4, res);
    }
    @org.junit.jupiter.api.Disabled
    @org.junit.jupiter.api.Test
    void mult() {
        double res = a.mult(3, 7);
        assertEquals(21, res);
    }

    @org.junit.jupiter.api.Test
    void div() {
        double res = a.div(14, 7);
        assertEquals(2, res);
    }

    @org.junit.jupiter.api.Test
    void divException() {
        ArithmeticException e = assertThrows(ArithmeticException.class, ()->{
            a.div(14, 0);
        });
        assertEquals("Dividing by 0 not allowed", e.getMessage());
    }
}
