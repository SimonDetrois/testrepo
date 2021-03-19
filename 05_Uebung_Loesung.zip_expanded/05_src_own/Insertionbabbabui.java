
public class Insertionbabbabui {

	public static void main(String[] args) {
		int[] ar = { 7, 98, 15, 38, 25, 0, 12, 8, 55, 83, 79, 77, 63, 56, 56, 2, 18, 21, 24, 28 };

		babba(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

	}

	public static void babba(int[] a) {

		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i-1]) {
				int count = i;
				int save = a[i];
				for(;save < a[count-1] && count > 0; count--) {
					a[count]= a[count-1];
					
				}
				a[count] = save;

			}

		}

	}
}
