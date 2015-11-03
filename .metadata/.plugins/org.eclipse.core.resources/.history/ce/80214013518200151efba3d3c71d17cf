package br.edu.ifpb.pps.figura;

public class Quadrilstero implements Figura{
	private Ponto p1;
	private Ponto p2;
	private Ponto p3;
	private Ponto p4;
	
	public Quadrilstero(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	
	public void draw(){
		System.out.println("aqui esta um quadrilatero, olha que massa");
	}
	
	public double perimetro(){	
		return this.calc();
	}
	
	private double calc(){
		double raio1 = Math.sqrt(Math.pow(p2.getX()-p1.getX(), 2)+Math.pow(p2.getY()-p1.getY(), 2));
		double raio2 = Math.sqrt(Math.pow(p3.getX()-p2.getX(), 2)+Math.pow(p3.getY()-p2.getY(), 2));
		double raio3 = Math.sqrt(Math.pow(p4.getX()-p3.getX(), 2)+Math.pow(p4.getY()-p3.getY(), 2));
		double raio4 = Math.sqrt(Math.pow(p1.getX()-p4.getX(), 2)+Math.pow(p1.getY()-p4.getY(), 2));	
		
		return raio1+raio2+raio3+raio4;
	}
}
