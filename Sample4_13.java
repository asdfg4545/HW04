package javaCH4;

public class Sample4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car12 car=new car12(1234,20.5);
		car.vshow();
		car.mshow();
	}

}
interface iVehicle3{
	void vShow();
}
interface iMaterial{
	void mShow();
}
class car12 implements iVehicle3,iMaterial{
	private int num;
	private double gas;
	public car12(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號是"+num+"，汽油量為"+gas+"的車子");
	}
	public void vshow() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	public void mshow() {
		System.out.println("車子的材質是鐵");
	}
}