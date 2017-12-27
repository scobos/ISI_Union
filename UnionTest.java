import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.lang.NullPointerException;

public class UnionTest {
	
	/*Estos son los test fixture*/
	Vector<Integer> v1;
	Vector<Integer> v2;
	Vector<Integer> v3;
	
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
		v1.add(1);
		v2.add(2);
		v3.add(1);
		v3.add(2);
		assertTrue("Ha fallado al intentar unir dos vectores", v3.equals(Union.union(v1, v2)));
	}
	
	@Test (expected = NullPointerException.class)
	public void vectorNulo{
		v1 = null;
		v2.add(3);
		Union.union(v1,v2);
	}
	
	@Test
	public void elementoNulo{
		v1.add(1);
		v1.add(null);
		v1.add(3);
		
		v2.add(4);
		v2.add(3);
		v2.add(null);
		
		v3.add(2);
		v3.add(null)
		assertTrue("El vector tiene elemento nulo", v3.equals(Union.union(v1, v2)));
	}
	
	@Test
	public void vectorVacio{
		v1.add(1);
		v3.add(3);
		assertTrue("Falla porque b está vacio", v3.equals(Union.union(v1, v2)));
	}
}
