//列挙型のさらなる活用
	//値を追加できる
public class Test1 {
	public enum Dessert {

		// それぞれに値段を指定する（フィールドなどを定義する場合、最後にセミコロンを付ける）
		APPLE(100), ICE_CREAM(200), CAKE(300);

		// 値段を保持するフィールド
		private int price;

		// privateコンストラクタを追加。引数はint型の値段。
		private Dessert(int price) {
			this.price = price;
		}

		// 値段を取得するメソッドを追加
		public int getPrice() {
			return price;
		}
	}
}
