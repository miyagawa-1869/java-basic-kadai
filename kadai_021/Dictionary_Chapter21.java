package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	//辞書を検索するメソッド
	public void serchDictionary(String[] word) {

		HashMap<String, String> dictionary = new HashMap<String, String>();

		dictionary.put("apple", "リンゴ");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");

		//wordの長さ分だけ繰り返す
		for (int i = 0; i < word.length; i++) {
			String result = dictionary.get(word[i]);
			//nullかどうかの判定
			if(result ==null) {
				System.out.println(word[i]+"は辞書に存在しません");
			}else {
				System.out.println(word[i]+"の意味は"+result);
			}

		}

	}
}
