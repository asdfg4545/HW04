package javaCH4;

public class Sample4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car5 car[]=new car5[2];
		car[0]=new car5();
		car[0].setcar(1234,20.5);
		car[1]=new Racingcar5();
		car[1].setcar(4567,30.5);
		for(int i=0;i<car.length;i++) {
			car[i].show();
		}
	}

}
class car5{
	protected int num;
	protected double gas;
	public car5(){
		num=0;
		gas=0;
		System.out.println("開始產生車子");
	}
	public void setcar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設定為"+num+"，將汽油量設定為"+gas);
	}
	public void show() {
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
	}
}
class Racingcar5 extends car5{
	private int course;
	public Racingcar5() {
		System.out.println("開始產生賽車");
	}
	public void setcourse(int c) {
		course=c;
		System.out.println("賽車編號為"+course);
	}
	public void show() {
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
		System.out.println("編號為"+course);
	}
}
