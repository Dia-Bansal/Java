import java.util.*;
public class selection_sort {
public static void printarray(int arr[],int n) {
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int smallest=i;
			for(int j=i+1;j<n;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		printarray(arr,n);

	}

}
