package javaCH4;

public class Sample4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vc[]=new Vehicle[2];
		vc[0]=new car9(1234,20.5);
		vc[0].setspeed(60);
		vc[1]=new plane(232);
		vc[1].setspeed(500);
		for(int i=0;i<vc.length;i++) {
			vc[i].show();

		}
	}

}
abstract class Vehicle{
	protected int speed;
	public void setspeed(int s) {
		speed=s;
		System.out.println("將速度設為"+speed+"了");
	}
	abstract void show();
}
class car9 extends Vehicle{
	private int num;
	private double gas;
	public car9(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas);
	}
	public void show() {
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
		System.out.println("速度"+speed);
	}
	
}

class plane extends Vehicle{
	private int flight;
	public plane(int f) {
		flight=f;
		System.out.println("生產了"+flight+"班次的航班");
	}
	public void show(){
		System.out.println("飛機的航班是"+flight);
		System.out.println("飛機的速度是"+speed);
	}
	
}