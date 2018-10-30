package ec.edu.utpl.arqapp.validar;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
public class TestRational {

    Rational r1 = new Rational(3,4);
    Rational r2 = new Rational(2,1);

    @Test(expected = IllegalArgumentException.class)
    public void Testdenominator(){
        Rational r = new Rational(1,0);
    }
    @Test
    public void TesttoString(){
        Rational r = new Rational(1,2);
        assertEquals("resultado esperado","1/2",r.toString());
    }
    @Test
    public void testisLessThan(){
        assertEquals(true,r1.isLessThan(r2));
    }
    @Test
    public void testgetGreater(){
        assertEquals(r2,r1.getGreater(r2));
    }
    @Test
    public void testplus(){
        assertEquals(11,r1.plus(r2).getNumerator());
        assertEquals(4,r1.plus(r2).getDenominator());
    }
    @Test
    public void testminus(){
        assertEquals("5/-4",r1.minus(r2).toString());

    }
    @Test
    public void testtimes(){
        assertEquals(3,r1.times(r2).getNumerator());
        assertEquals(2,r1.times(r2).getDenominator());
    }
    @Test
    public void testdivides(){
        assertEquals(3,r1.divides(r2).getNumerator());
        assertEquals(8,r1.divides(r2).getDenominator());
    }
}

