public class InsertionSortRandomFill {

	public static void main(String[] args) {
				
		int[] array = new int[20];

		randomFill(array);

		insertionSort(array);

		for (int element: array) {
			System.out.print(element + " ");
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
				a[k] = x; // a[i] an der freien Stelle einf�gen
			}
		}
	}

	public static void randomFill(int[] a) {

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100); /*
													 * Math.Random liefert Pseudozufallszahl in Form einer
													 * Gleitkommazahl im Intervall von [0 - 1)
													 */
		}

	}

}
