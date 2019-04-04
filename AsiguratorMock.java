package mock;

import s7.interfete.IAsigurator;

public class AsiguratorMock implements IAsigurator{
	float pretAsigurare;
	
	public void setPretAsigurare(float pretAsigurare) {
		this.pretAsigurare = pretAsigurare;
	}

	//aici pot sa pun cat vreau
	@Override
	public float getPretAsigurare() {
		// TODO Auto-generated method stub
		return pretAsigurare;
	}

}
