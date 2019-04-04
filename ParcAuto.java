package s7.clase;

import java.util.ArrayList;
import java.util.List;

import s7.exceptii.ExceptieParcAuto;
import s7.interfete.IMasina;



public class ParcAuto {

	private List<IMasina> masini;

	public ParcAuto() {
		masini=new ArrayList<>();
	}
	
	public void achizitioneazaMasina(Masina masina){
		masini.add(masina);
	}
	
	public double calculPretTotal() throws ExceptieParcAuto{
		if(masini == null || masini.size() == 0)
			throw new ExceptieParcAuto();
		double rezultat=0;
		for(IMasina masina:masini){
			rezultat=rezultat+masina.getPret();
		}
		return rezultat;
	}	
	
	public int getNrMasini() {
		return this.masini.size();
	}

	public IMasina getMasina(int i) {
		// TODO Auto-generated method stub
		return this.masini.get(i);
	}
}
