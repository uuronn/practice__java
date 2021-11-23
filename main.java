class main {
	public static void main(String[] args) {
		final int SIZE = 50;
		int[] score = new int[SIZE];

		for (int i=0; i<SIZE; i++) {
				score[i] = (i*83 + 15) % 101;
		}

		int sum = 0;
		for (int i=0; i<SIZE; i++) {
				sum += score[i];
		}
		double ave = (double)sum / SIZE;
		System.out.println("平均点 : " + ave);

		int max = score[0];
		for (int i=1; i<SIZE; i++) {
				if (max < score[i]) {
						max = score[i];
				}
		}
		System.out.println("最高点 : " + max);
    
	}
}
