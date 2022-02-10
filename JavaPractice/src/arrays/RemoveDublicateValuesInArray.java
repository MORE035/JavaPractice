package arrays;



public class RemoveDublicateValuesInArray {

	public static void main(String[] args) {
		int[] a = new int[]{ 55, 45, 69, 44, 45, 55,2,2,2};
		int n = a.length;
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {

					temp = j;
					while (temp <n-1) {

						a[temp] = a[temp +1];
						temp++;

					}
					n = temp-1;
				}
			}
		}
		for (int k = 0; k < n; k++) {
			System.out.println(a[k]);
		}
	}

}
