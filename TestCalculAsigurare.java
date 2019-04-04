package s7.testare;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import mock.AsiguratorMock;
import s7.clase.Masina;

public class TestCalculAsigurare {
	
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	//daca aveam o expcetie tb sa o testez
	@Test
	public void testRight() {
		Masina m = new Masina("DACIA", 120);
		AsiguratorMock asigurator = new AsiguratorMock();
		asigurator.setPretAsigurare(100);
		
	}
	//la error testez o situatie in care sa mi arunce o exceptie
	//la existence testam metoda sa vedem ca face ce tb ori seteaza, ori construieste, etc cand nu exista cv anume gen numele e null
	//la cardinality ce face metoda daca avem 0,1, n obj facem test pt fiecare
}
