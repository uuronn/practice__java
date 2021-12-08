import java.util.Random;

public class main {
	public static void main(String[] args) {
		Random random = new Random();

		int diceData[] = new int[6];

		for (int i=0; i<8; i++) {
			int diceResult = random.nextInt(6) + 1;/* 0~5までの整数が取得されるから+1する。 +1をしないと↓の処理で-1の配列を指すことになってエラーになる。 */ 
			System.out.println(diceResult);
			diceData[diceResult-1] = diceData[diceResult-1] + 1;/* 配列に合わせるので-1 */
		}

		String diceTotal;
		for (int i=0; i<6; i++) {
			diceTotal = (i + 1) + ":";
				for(int m=0; m<diceData[i]; m++) {
					diceTotal += "*";
				}
			System.out.println(diceTotal);
		}
	}
}
