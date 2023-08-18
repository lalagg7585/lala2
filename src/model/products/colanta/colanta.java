package model.products.colanta;

import model.products.Fabrica;
import model.products.Queso;
import model.products.Yogurt;

public class colanta implements Fabrica {

	@Override
	public Queso getQueso() {
		// TODO Auto-generated method stub
		return new Pepito();
	}

	@Override
	public Yogurt getYogurt() {
		// TODO Auto-generated method stub
		return new Yagurt();
	}

	
}
