package model;

import java.util.Random;


public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Fabrica f = null;
			
			Random r = new Random();
			
			int i   = r.nextInt(10);
			if(i<5){
				f= new Alpina();
			}else {
				f = new colanta();
			}
			Queso q = f.getQueso();
			Yogurt y = f.getYogurt();
			
			System.out.println(q.darMensaje());
			System.out.println(y.darMensaje());

	}
}
