
public class BinaryRecursiveSearch implements Practice2Search{

	public String searchName(){
		return "Binary Recursive Search";
	}

	public int search(int [] arr, int target){
		return search2(arr, target, 0, arr.length-1);
	}

	public int search2(int [] arr, int target, int low, int upper){
		if(low>upper) 
			return -1;

		int mid = (low + upper)/2;
		if (arr[mid]==target)
			return mid; 
		else if(arr[mid]<target)
			return search2(arr, target, mid+1, upper);
		else
			return search2(arr, target, low, mid-1);
	}



}