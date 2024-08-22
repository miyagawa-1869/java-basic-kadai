package kadai_026;

//自分と対戦相手の手を出力する処理はHashMapを出力しましよう
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	//メソッド１：自分のじゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");

		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
		//入力した内容を取得する
		String myinput = scanner.next();
		//ifで正しいじゃんけんの手であるか判定する
		if (myinput.equals("r") || myinput.equals("s") || myinput.equals("p")) {
			scanner.close();
			return myinput;
		} else {
			System.out.println("じゃんけんの手ではありません再入力してください。");
			return getMyChoice();
		}
	}

	//	メソッド２：対戦相手の手を乱数で選ぶ
	public String getRandom() {
		String[] handArray = { "r", "s", "p" };
		String yourinput = handArray[(int) Math.floor(Math.random() * 3)];
		return yourinput;
	}

	//メソッド３：じゃんけんを行う
	public void playGame() {

		//keyとvalueをHashMapに設定する
		HashMap<String, String> handMap = new HashMap<String, String>();
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");

		//自分と対戦相手の結果を出力する
		String own = new String(getMyChoice());
		String you = new String(getRandom());

		System.out.println("自分の手は" + handMap.get(own) + "対戦相手の手は" + handMap.get(you));

		//	自分と対戦相手の結果を比較する
		if (own.equals(you)) {
			System.out.println("あいこです");
		} else if ( (own.equals("r") && you.equals("s"))||
					(own.equals("s") && you.equals("p"))||
					(own.equals("p") && you.equals("r"))) {
				System.out.println("自分の勝ちです");
		} else {
			System.out.println("あなたの負けです");
		}

	}

}
