import java.util.*;
class insertion{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	public void input() {
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	}
	public void insert_sort() {
		for(int i=1;i<n;i++) {
			int temp=arr[i];
			int j=i-1; 
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	void display() {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertion insert=new insertion();
		insert.input();
		insert.insert_sort();
		insert.display();

	}

}
