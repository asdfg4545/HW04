package javaCH4;

public class Sample4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car8[] car =new car8[2];
		car[0]=new car8();
		car[1]=new Racingcar8();
		for(int i=0;i<car.length;i++) {
			Class cl=car[i].getClass();
			System.out.println("第"+(i+1)+"個物件的類別屬於"+cl);
		}
	}

}
class car8{
	protected int num;
	protected double gas;
	public car8() {
		num=0;
		gas=0;
		System.out.println("開始產生了車子");
	}
}
class Racingcar8 extends car8{
	public Racingcar8() {
		System.out.println("開始產生了賽車");
	}
}
