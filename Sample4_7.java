package javaCH4;

public class Sample4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car6 car=new car6();
		car.setcar(1234,20.5);
		System.out.println(car);
	}

}
class car6{
	protected int num;
	protected double gas;
	public car6() {
		num=0;
		gas=0;
		System.out.println("開始生產了車子");
	}
	public void setcar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("車號設定為"+num+"，車汽油量設定為"+gas);
	}
	public String toString(){//tostring必須大寫，不然會傳錯
		String str="車號:"+num+";汽油量:"+gas;
		return str;
	}
	
}