package array.com;

public class Sum {
	public static void main(String[] args) {
		int arr[]= {2,10,31,7,44};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
System.out.println("The Sum of array is "+sum);
}
}