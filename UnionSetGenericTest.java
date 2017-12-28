import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.lang.NullPointerException;
import java.util.HashSet;
import java.util.Set;

public class UnionSetTest {
	
	/*Estos son los test fixture*/
	Set<Integer> a;
	Set<Integer> b;
	Set<Integer> c;
	/*Metodo para preparar el test*/
	@Before
	public void setUp()
	{
		a = new HashSet<Integer>();
		b = new HashSet<Integer>();
		c = new HashSet<Integer>();
	}

	/*Método ejecutado al finalizar cada test*/
	@After
	public void tearDown(){
		a = null;
		b = null;
		c = null;
	}


	@Test (expected = NullPointerException.class)
	public void test{
		a.add(1);
		a.add(2)
		b.add(1);
		b.add(2)
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		assertTrue("Ha fallado al intentar unir dos vectores", c.equals(Union.union(a, b)));
	}
}
