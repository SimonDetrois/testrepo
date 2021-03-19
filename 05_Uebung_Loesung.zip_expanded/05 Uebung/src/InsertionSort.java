public class InsertionSort {

	public static void main(String[] args) {
		int[] array = { 7, 98, 15, 38, 25, 0, 12, 8, 55, 83, 79, 77, 63, 56, 56, 2, 18, 21, 24, 28 };

		insertionSort(array);

		// Gib das sortierte Array aus
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static void insertionSort(int[] a) {

		for (int i = 1; i < a.length; i++) {

			if (a[i - 1] > a[i]) {

				// a[i] ist nicht sortiert
				int x = a[i];
				// verschieben der Zellen nach rechts bis a[k] frei ist
				int k = i;
				for (; k > 0 && a[k - 1] > x; k--) {

					a[k] = a[k - 1];
				}
				a[k] = x; // a[i] an der freien Stelle einfügen
			}
		}
	}

}
