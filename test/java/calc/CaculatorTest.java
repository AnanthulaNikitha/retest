package calc;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CaculatorTest {
	private static CalculatorMain calc;
	
	@BeforeClass
	public static void setup(){
		calc = new CalculatorMain();
	}
	
       @Test
	public void testAdd() {
		assertEquals(5, calc.add(3,2));
       }
	@Test
	public void testSub() {
		assertEquals(1, calc.Sub(3,2));
	}
	@Test
	public void testMul() {
	assertEquals(6, calc.mul(3,2));
	}
	@Test
	public void testDiv() {
		assertEquals(1, calc.div(2,2));
	}
	@Test
	public void testDivByZero() {
		assertEquals(0, calc.div(3,0));
	}
	@Test
	public void testPresedence() {
		assertEquals(30, calc.add(calc.mul(5, 5), calc.div(10, 2)));
		}
	@Test
	public void testSquare() {
		assertEquals(4, calc.Square(2));
	}
       @Test
   	public void testfact() {
   		assertEquals(2, calc.fact(2));
          }
       @Test
   	public void testremaind() {
   		assertEquals(1, calc.remaind(7,3));
          }
       @Test
    public void testIntegrate() {
    	   assertEquals (4, calc.Sub(calc.add(3,3), calc.div(4, 2)));
       }
}

