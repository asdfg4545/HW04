package javaCH4;

public class Sample4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 vc[]=new Vehicle1[2];
		vc[0]=new car10(1234,20.5);
		vc[0].setspeed(60);
		vc[1]=new plane1(232);
		vc[1].setspeed(500);
		for(int i=0;i<vc.length;i++) {
			if(vc[i]instanceof car10) {
			System.out.println("第"+(i+1)+"個物件是Car類別");
			}else {
				System.out.println("第"+(i+1)+"個物件不是Car類別");
			}
		}
	}

}
abstract class Vehicle1{
	protected int speed;
	public void setspeed(int s) {
		speed=s;
		System.out.println("將速度設為"+speed+"了");
	}
	abstract void show();
}
class car10 extends Vehicle1{
	private int num;
	private double gas;
	public car10(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	public void show() {
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
		System.out.println("速度為"+speed);
	}
}
class plane1 extends Vehicle1{
	private int flight;
	public plane1(int f) {
		flight=f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show() {
		System.out.println("班機為"+flight);
		System.out.println("速度為"+speed);
	}
}