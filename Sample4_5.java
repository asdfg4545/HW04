package javaCH4;

public class Sample4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car4 ccar=new Racingcar4();
		ccar.setcar(1234, 20.5);
		ccar.show();
	}

}
class car4{
	protected int num;
	protected double gas;
	public car4() {
		num=0;
		gas=0;
		System.out.println("生產了車子");
	}
	public void setcar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("車子車號設為"+n+"，車子汽油量設為"+g);
	}
	public void show() {
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
	}
	
}
class Racingcar4 extends car4{
	private int course;
	public Racingcar4() {
		course=0;
		System.out.println("生產了賽車");
	}
	public void setcourse(int c) {
		course=c;		
		System.out.println("賽車邊號設為"+course);
	}
	public void show() {
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
		System.out.println("編號量為"+course);
	}
}
