import static org.junit.jupiter.api.Assertions.*;

class ArithmeticsTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void add() {
        Arithmetics test1Model  = new Arithmetics();
        double res = test1Model.add(3, 7);
        assertNotNull(test1Model);
    }

    @org.junit.jupiter.api.Test
    void deduct() {
        Arithmetics test2Model = new Arithmetics();
        double res = test2Model.deduct(3, 7);
        assertEquals(-4, res);
    }

    @org.junit.jupiter.api.Test
    void mult() {
        Arithmetics test3Model = new Arithmetics();
        double res = test3Model.mult(3, 7);
        assertEquals(21, res);
    }

    @org.junit.jupiter.api.Test
    void div() {
        Arithmetics test4Model = new Arithmetics();
        double res = test4Model.div(14, 7);
        assertEquals(2, res);
    }
}