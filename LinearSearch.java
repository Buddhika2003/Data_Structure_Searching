public class LinearSearch{
	
	public int search(int[] arr, int target){
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] == target){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[]args){
		LinearSearch ls = new LinearSearch();
		int[]arr = {20,50,40,10,30};

		int index = ls.search(arr,10);

		if(index != -1){
			System.out.println("Found at index: " + index);
		}else{
			System.out.println("Not found");
		}
	}
}