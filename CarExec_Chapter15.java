package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[]args) {
//クラスの呼び出し、gearChangeメソッドに引数３を与えて実行する
		Car_Chapter15 gear = new Car_Chapter15();
		gear.gearChange(3);
		gear.run();
	}
}
