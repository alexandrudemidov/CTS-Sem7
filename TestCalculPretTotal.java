package s7.testare;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import s7.clase.Masina;
import s7.clase.ParcAuto;
import s7.clase.SlowTest;
import s7.exceptii.ExceptieParcAuto;

public class TestCalculPretTotal {
	ParcAuto pa;
	static Masina m1;
	static Masina m2;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//aici obj pe care le folosesc in lista
		m1 = new Masina("MODEL1", 101);
		m2 = new Masina("MODEL2", 102);
	}

	@Before
	public void setUp() throws Exception {
		//il initializez mereu cu 0 masini
		pa = new ParcAuto();
	}

	@Test
	public void testRight() throws ExceptieParcAuto{
		pa.achizitioneazaMasina(m1);
		pa.achizitioneazaMasina(m2);
		
		double expected = 203;
		double actual = pa.calculPretTotal();
		
	}
	@Test(expected=ExceptieParcAuto.class)
	public void testException() throws ExceptieParcAuto{
		pa.calculPretTotal();
	}
	@Test
	public void testExtremLimits() throws ExceptieParcAuto{
		pa.achizitioneazaMasina(m1);
		
	}
	//pe asta o las afara din suita ca dureaza mult 
	//o includ in clasa slowtest pt a o exclude 
	//fac asta cu category
	@Category(SlowTest.class)
	@Test
	public void testPerformance() throws ExceptieParcAuto{
		for(int i=1;i<=25;i++)
			pa.achizitioneazaMasina(new Masina("BMW" + i, 100+i));
	}
	
	Double caulculPretTotalCross(ParcAuto pa) {
		
		double[] v = new double[pa.getNrMasini()];
		for(int i=0;i<pa.getNrMasini();i++)
			v[i] = pa.getMasina(i).getPret();
		double s = 0;
		s += v[i];
		return s;
	}

}
