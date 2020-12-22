
public class SunsetView {

	public static void main(String[] args) {

		int[] array = { 3, 7, 8, 3, 6, 1 };
		System.out.println(countBuilding(array));
	}

	public static int countBuilding(int[] arr) {
		// Traversing the array from the end.
		// Created a variable to check/compare if the buildings on the east side are lower. If yes, ignore that. 
		
		int sum = 0;
		int max = 0;
		int len = arr.length;

		for (int i = len - 1; i >= 0; i--) {

			if (arr[i] > max) {
				max = arr[i];
				sum++;
			}
		}

		return sum;
	}

}
