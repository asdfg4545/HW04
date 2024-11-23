package javaCH4;

public class Sample4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car7 car1=new car7();
		car7 car2=new car7();
		car7 car3;
		car3=car1;
		System.out.println("car1是否與car2相同?"+car1.equals(car2));
		System.out.println("car1是否與car3相同?"+car1.equals(car3));
	}

}
class car7{
	protected int num;
	protected double gas;
	public car7() {
		num=0;
		gas=0;
		System.out.println("開始產生了車子");
	}
}
