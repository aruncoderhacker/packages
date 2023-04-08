package org.computer;

public class Desktop  extends Computer {
	private void desktopsize() {
	System.out.println("desktop size is :6.5");

	}
	private void desktopprice() {
		System.out.println("price is :6000");

	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		        d.desktopprice();
		        d.desktopsize();
		        d.computermodel1();
		        d.computerprice();
	}

}
