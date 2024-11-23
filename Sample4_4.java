package javaCH4;

public class Sample4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Racingcar3 ccar=new Racingcar3();
		ccar.setCar(1234,20.5);
		ccar.setcourse(5);
		ccar.show();
	}

}
class car3{
	protected int num;
	protected double gas;
	public car3() {
		num=0;
		gas=0;
		System.out.println("生產了車子");
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("車號設為"+num+"，汽油量設為"+gas);
	}
	public void show() {
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
	}
}
class Racingcar3 extends car3{
	private int course;
	public Racingcar3(){
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
		System.out.println("賽車邊號設"+course);
	}
	
}