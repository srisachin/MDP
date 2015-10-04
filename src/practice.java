/*import java.util.ArrayList;
//import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
import java.util.PriorityQueue;;

class Heapsort {

//	int a[]={10,50,32,9,104,26,84,83,20,85,8,3,75,47,40,94};
	ArrayList<Integer> a;
	int heap_size;
	
	Heapsort(ArrayList <Integer>arr)
	{
		a = arr;
		heap_size=a.size()-1;
		
	}
	void max_heapify(int n)
	{
		int l = 2*n+1, r = 2*n+2;
		int largest=n;
		if(2*n+1<=heap_size && a.get(l)>a.get(n))
			largest =l;
		if(2*n+2<=heap_size && a.get(r)>a.get(largest))
			largest =r;
		if(largest != n)
		{
			int temp=a.get(largest);
			a.set(largest,a.get(n));
			a.set(n,temp);
			max_heapify(largest);
		}
	}
	
	void build_heap()
	{
		heap_size = a.size()-1;
		
		for(int i=(heap_size-1)/2; i>=0; i-- )
		{
			max_heapify(i);
		}
		
	}
	void sort()
	{
		build_heap();
		for(int i=a.size()-1; i>=0;i--)
		{
			int temp = a.get(i);
			a.set(i,a.get(0));
			a.set(0,temp);
			heap_size--;
			max_heapify(0);
		}
		
	}
	void print()
	{
		System.out.println(a.toString());
	}
	
}

	class practice
	{
		public static void main(String args[]) throws FileNotFoundException
		{
			 
//			int a[] = new int[100];
			ArrayList<Integer> a = new ArrayList<Integer>();
			int i=0;
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			for(int i=0;i<10;i++)
//			{	System.out.println("Enter a new Number");
//				a[i]=Integer.parseInt(br.readLine());
//			}
			Scanner s= new Scanner(new File("C:\\Users\\sachinsri12345\\Desktop\\Interview Practice\\file.txt"));
			while(s.hasNextInt())
			{	
				a.add(s.nextInt());
			}
			
//			Heapsort h= new Heapsort(a);
//			hashsort h = new hashsort(a);
			PQ h = new PQ(a);
//			h.sort();
			h.print();
		}
	}
*/
