import java.io.*; //dont know
import java.util.*;

class HeapSort
{
	ArrayList <Integer> a;
	int heap_size;
	HeapSort(ArrayList <Integer> arr)
	{
		a=arr;
		heap_size = a.size()-1;	
	}
	void max_heapify(int index)
	{
		int l = 2 * index +1, r = 2* index +2;
		int largest = index;
		if(l<=heap_size)
			if(a.get(l) > a.get(index))
				largest = l;
		if(r<=heap_size)
			if(a.get(r) > a.get(largest))
				largest = r;
		if(largest != index)
		{
			int temp = a.get(largest);
			a.set(largest, a.get(index));
			a.set(index, temp);
			max_heapify(largest);
		}
			
	}
	
	void build_max()
	{
		for(int i = (heap_size-1)/2 ; i>=0; i--)
			max_heapify(i);
				
	}
	
	void sort()
	{
		build_max();
		while(heap_size>=1)
		{
			int temp = a.get(heap_size);
			a.set(heap_size,a.get(0));
			a.set(0,temp);
			heap_size--;
			max_heapify(0);
		}
	}
		
}

class Bofa
{
	public static void main(String args[]) throws FileNotFoundException
	{
		Scanner S = new Scanner(new File("C:\\Users\\sachinsri12345\\Desktop\\Interview Practice\\file.txt"));
		ArrayList<Integer> a = new ArrayList<Integer>();
		while(S.hasNextInt())
			a.add(S.nextInt());	
		HeapSort h = new HeapSort(a);
		h.sort();
		System.out.println(a.toString());
	}
}

