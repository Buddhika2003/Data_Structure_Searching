public class BinaryIterative{
	public static int binarySearch(int[]arr, int key){
		int left = 0;
		int right = arr.length - 1;

		while(left <= right){
			int mid = (left + right)/2;

			if(arr[mid] == key){
				return mid;
			}

			if(key < arr[mid]){
				right = mid - 1;
			}else{
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[]args){
		int[]arr = {1,3,6,8,12,18,25};
		int key = 18;

		int result = binarySearch(arr, key);

		if(result != -1){
			System.out.println("Target found in " + result + " index");
		}else{
			System.out.println("Not found");
		}
	}
}