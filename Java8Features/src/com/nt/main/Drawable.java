package com.nt.main;

public interface Drawable {
	public void draw();//interface never have body
		
public class LambdaExpEx{
	public static void main(String[] args) {
		int width=10;
		//without lambda expression
//		Drawable d=new Drawable() {
//			public void draw() {
		//using lambda 
		Drawable d=()->{
			System.out.println("Drawing:"+width);
			
		};
		d.draw();
	}
}
}