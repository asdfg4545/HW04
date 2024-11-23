package javaCH4;

public class Sample4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iVehicle vc[]=new iVehicle[2];
		vc[0]=new car11(1234,20.5);
		vc[1]=new plane2(232);
		for(int i=0;i<vc.length;i++) {
			vc[i].show();
		}
	}

}
interface iVehicle{
	int weight=1000;
	void show();
}
class car11 implements iVehicle{
	private int num;
	private double gas;
	public car11(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
class plane2 implements iVehicle{
	private int flight;
	public plane2(int f) {
		flight=f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次是"+flight);
	}
}