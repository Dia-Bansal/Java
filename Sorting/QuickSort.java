import java.util.*;
public class quicksort {
public static int partition(int[]arr,int low,int high) {
	int pivot=arr[high];
	int i=low-1;
	for(int j=low;j<high;j++) {
		if(arr[j]<pivot) {
			i++;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	i++;
	int temp=arr[i];
	arr[i]=arr[high];
	arr[high]=temp;
	return i;
}
public static void QUICKsort(int arr[],int low,int high) {
	if(low<high) {
		int pi=partition(arr,low,high);
		QUICKsort(arr,low,pi-1);
		QUICKsort(arr,pi+1,high);
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
		QUICKsort(arr,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
