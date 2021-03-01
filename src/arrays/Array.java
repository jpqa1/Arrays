package arrays;

public class Array {

	public static void main(String[] args) {

//		int[] tenVals = new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
//
//		for (int i = 0; i < tenVals.length; i++) {
//			System.out.println(tenVals[i]);
//		}

		int[] loopArray = new int[10];

		for (int i = 0; i < 10; i += 1) {
			loopArray[i] = i + 1;
			System.out.println(loopArray[i]);
		}

		System.out.println("-----------------------------------------");

		for (int j = 0; j < loopArray.length; j++) {
			if (j == 0) {
				loopArray[j] = (j + 1) * 10;
			} else {
				loopArray[j] = j * 10;
				System.out.println(loopArray[j]);
			}

		}

	}

}
