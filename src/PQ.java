import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Iterator;

public class PQ {

	ArrayList <Integer> a;
	PriorityQueue <Integer> p;
	PQ(ArrayList<Integer> arr)
	{
		a=arr;
		p = new PriorityQueue<Integer>();
		max_heapify();
	}
	void max_heapify()
	{
		Iterator<Integer> it= a.iterator();
		while (it.hasNext())
			p.add(it.next());
	}
	void print()
	{
		while(!p.isEmpty())
			System.out.println(p.remove());
	}
}
