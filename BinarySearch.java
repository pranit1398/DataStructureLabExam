import java.util.Scanner;

public class BinarySearch {
	public int search(int arr[], int low, int high, int element)
	{
		if(low == high) {
			if(arr[low] == element)
				return low;
			else
				return -1;
		}

		int mid = (low + high) / 2;
		
		if (element == arr[mid])
			return mid;
		
		if (element > arr[mid])
			return search(arr, (mid + 1), high, element);
		else
			return search(arr, low, (mid - 1), element);
	}


	public static void main(String[] args) {
		
		BinarySearch obj = new BinarySearch();
		int arr[] = {18, 36, 47, 58, 69, 100};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element : ");
		int element = sc.nextInt();
		
		int n = arr.length - 1;
		
		int position = obj.search(arr, 0, n, element);
		if(position >=0)
			System.out.println("Element position "+(position+1));
		else 
			System.out.println("Element not found");
			
	}
 

}

