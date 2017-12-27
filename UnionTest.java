import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class UnionTest {
	
	/*Estos son los test fixture*/
	Vector<Integer> a;
	Vector<Integer> b;
	Vector<Integer> c;
	
	/*Metodo para preparar el test*/
	@Before
	public void setUp()
	{
		v1 = new Vector<Integer>();
		v2 = new Vector<Integer>();
		v3 = new Vector<Integer>();
	}
	
	/*Método ejecutado al finalizar cada test*/
	@After
	public void tearDown(){
		v1 = null;
		v2 = null;
		v3 = null;
	}
	
	
	@Test public void primerTest{
		a.add(1);
		b.add(2);
		c.add(1);
		c.add(2);
		assertTrue("Ha fallado al intentar unir dos vectores", c.equals(Union.union(a, b)));
		}
	}
}
