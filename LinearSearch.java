public class LinearSearch{

	public int search(int[]arr, int target){
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == target){
				return i;
			}
		}
		return -1; 
	}

	public static void main(String[]args){
		LinearSearch ls = new LinearSearch();
		int[]arr = {23,45,65,21,43,2,3,5,1};

		int index = ls.search(arr, 3);

		if(index != -1){
			System.out.println("Target is found in " + index);
		}else{
			System.out.println("Target not found");
		}
	}

}