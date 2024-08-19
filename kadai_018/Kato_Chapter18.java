package kadai_018;

//親クラス
public abstract class Kato_Chapter18 {
	//	フィールド
	public String familyName;
	public String givenName;
	public String address;

	//共通の紹介メソッド
	public void commonIntroduce() {
		familyName = "加藤";
		address = "東京都中野区〇×";
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}

	//個別の紹介メソッド
	abstract public void eachIntroduce();

	//紹介の実行メソッド
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}