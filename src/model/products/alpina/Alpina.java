package model.products.alpina;

import model.products.Fabrica;
import model.products.Queso;
import model.products.Yogurt;

public class Alpina implements Fabrica {

	@Override
	public Queso getQueso() {
		// TODO Auto-generated method stub
		return new Alpinito();
	}

	@Override
	public Yogurt getYogurt() {
		// TODO Auto-generated method stub
		return new Yoyoyogo();
	}
	

}
