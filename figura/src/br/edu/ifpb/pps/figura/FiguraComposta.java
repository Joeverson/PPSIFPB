package br.edu.ifpb.pps.figura;

import java.util.ArrayList;

public class FiguraComposta {
	private ArrayList<Figura> Figuras = new ArrayList<Figura>();
		
	public double perimetroTotal(){		
		double soma = 0;
		
		for (Figura p : this.Figuras) 
			soma += p.perimetro();
		return soma;
	}
	
	public void drawAll(){		
		for (Figura p : this.Figuras) 
			p.draw();		
	}
	
	
	//main
	public static void main(String[] args) {
		double calc;
		FiguraComposta f = new FiguraComposta();
		Circulo c1 = new Circulo(new Ponto(10,11), new Ponto(10,31));
		Circulo c2 = new Circulo(new Ponto(1,17), new Ponto(13,1));
		Circulo c3 = new Circulo(new Ponto(0,0), new Ponto(5,0));
		Quadrilstero c4 = new Quadrilstero(new Ponto(1,1), new Ponto(1,3),new Ponto(5,3), new Ponto(5,1));
		
		f.Figuras.add(c3);
		/*f.Figuras.add(c2);
		f.Figuras.add(c3);
		f.Figuras.add(c4);*/
		
		System.out.println("calc total of perimetro = "+f.perimetroTotal());
		f.drawAll();
	}

}
