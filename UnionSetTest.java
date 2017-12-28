import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.lang.NullPointerException;
public class UnionSetTest {
	
	/*Estos son los test fixture*/
	Set a;
	Set b;
	Set c;
	/*Metodo para preparar el test*/
	@Before
	public void setUp()
	{
		a = new HashSet();
		b = new HashSet();
		c = new HashSet();
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
		a = null;
		b.add(2);
		Union.unionSet(a, b);
	}
}
