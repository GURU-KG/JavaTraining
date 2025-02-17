public class RemoveDupliNumInArr{
	public static void main(String[] args) {
		int arr[] = {3,2,3,1,2,9};
		int newSize = arr.length;

		for (int i = 0; i < newSize; i++) {
			for (int j = i + 1; j < newSize; j++) {
				if (arr[i] == arr[j]) {
					for (int k = j; k < newSize - 1; k++) {
						arr[k] = arr[k + 1];
					}
					newSize--;
					j--;
				}
			}
		}

		for (int i = 0; i < newSize; i++){
			System.out.println(arr[i] + " ");
		}
	}
}
