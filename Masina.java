package s7.clase;

import s7.interfete.IAsigurator;
import s7.interfete.IMasina;

public class Masina implements IMasina {
	private String model;
	private double pret;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model)throws ExceptieModel{
		if(mdodel == nu;; || model.length() < 3 || model.length() > 10)
			throw new ExceptieModel();
		for(int i=0;i<model.length();i++) {
			char c = model.charAt(i);
			if(!Character.isUpperCase(c) && !Character.isDigit(c))
				throw new ExceptieModel();
		}
		this.model = model;
	}
	public double getPret() {
		return pret;
	}
	public void setPret(double pret) {
		this.pret = pret;
	}
	
	public Masina(String model, double pret) {
		super();
		this.model = model;
		this.pret = pret;
	}
	
	//cheltuielile de intretinere presupun plata asigurarii 
	//si impozitului - de 5% din pretul masinii
	public float cheltuieliIntretinere(IAsigurator asigurator){
		return (float) (asigurator.getPretAsigurare()+this.pret*0.05);
	}
	
}
