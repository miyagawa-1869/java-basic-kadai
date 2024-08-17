package kadai_015;

//車のクラスの作成
public class Car_Chapter15 {
	//フィールドの内部データ入力
	private int gear = 1;
	private int speed = 10;

	//コンストラクタ初期化
	public Car_Chapter15(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;

	}

	public Car_Chapter15() {
	}

	//メソッド１ gearChange
	public void gearChange(int afterGear) {
		System.out.println("ギア" +this.gear + "から" + afterGear + "に切り替えました");

		this.gear = afterGear;
		switch (this.gear) {
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		default -> this.speed = 10;
		}
		;
	}

	//メソッド２ run
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}

}