package javaCH4;

public class Sample4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Racingcar2 rcar=new Racingcar2();
		rcar.newshow();
	}

}
class car2 {
	protected int num;
	protected double gas;
	public car2() {
		num=0;
		gas=0;
		System.out.println("生產了車子");
	}
	public void setcar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("車子車號設為"+n+"，汽油量設為"+g);
	}
	public void show() {
		System.out.println("車號為"+num+"，汽油量為"+gas);
	}
	
}
class Racingcar2 extends car2{
	private int course;
	public Racingcar2(){
		course=0;
		System.out.println("生產了賽車");
	}
	public void setCourse(int c) {
		course=c;
		System.out.println("將賽車編號設為"+course);
	}
	public void newshow() {
		System.out.println("賽車車號為"+num);
		System.out.println("賽車汽油量為"+gas);
		System.out.println("賽車編號為"+course);
		
	}
}