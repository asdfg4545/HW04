package javaCH4;

public class Sample4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar1 rccar1=new RacingCar1(1234,20.5,5);
	}

}
class car1 {
	private int num;
	private double gas;
	public car1() {
		num=0;
		gas=0;
		System.out.println("生產了車子");
	}
	public car1(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車子車號為"+n+"，汽油量為"+g+"的車子");
	}
	public void setcar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("車號設為"+n+"，汽油量設為"+g);
	}
	public void show() {
		System.out.println("車號為"+num+"，汽油量為"+gas);
	}
}
class RacingCar1 extends car1{
	private int course;
	public RacingCar1() {
		course=0;
		System.out.println("生產了賽車");
	}
	public RacingCar1(int n,double g,int c) {
		super(n, g);
		course=c;
		System.out.println("生產了編號為"+course+"的賽車");
	}
	public void setCourse(int c) {
		course=c;
		System.out.println("將賽車邊號設為"+course);
	}
}