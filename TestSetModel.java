package s7.testare;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import s7.clase.Masina;
import s7.exceptii.ExceptieModel;

public class TestSetModel {

	//o folosesc pt acele obj care nu se modifica pe masura ce ruleaza codul 
	//daca testez setter pot sa am obj la inceput deci pot sa optez pt beforeclass
	
	static Masina m;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		m = new Masina("DACIA", 1000);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRight() throws ExceptieModel {
		//nu apelam direct set model
		//tb caz cat mai general
		//folosesc expected
		//ar tb sa incerc cu mai multe dar revin la primul
		String expected = "BMWZ3";
		m.setModel(expected);
		assertEquals("verificare right", expected, m.getModel());
	}
	@Test(expected = ExceptieModel.class)
	public void testException() throws ExceptieModel{
		m.setModel("dacia");
	}
	@Test
	public void testExtremLimits() throws ExceptieModel{
		String expected = "BMW";
		m.setModel(expected);
		assertEquals("verificare right", expected, m.getModel());
	}

}
