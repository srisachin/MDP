import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashsort {
	
	ArrayList <Integer> a;
	HashMap<Integer, Integer> h;
	HashMap<Integer, Integer> rh;
	hashsort(ArrayList<Integer> arr)
	{
		a= arr;
		h = new HashMap <Integer,Integer>();
		rh = new HashMap <Integer,Integer>();
	}
	void sort()
	{
		Iterator <Integer>i =a.iterator();
		while(i.hasNext())
		{
			int key = i.next();
			int value =1;
			if(h.containsKey(key))  
			{
				value = h.get(key);
				h.put(key, ++value);
			}
			else
			{
				h.put(key, value);
			}
		}
		for(Map.Entry<Integer, Integer> entry: h.entrySet()) 
			rh.put(entry.getKey(), entry.getValue());
	}
	void print()
	{
		for(int i=0; i< 1000; i++)
		{
			if(rh.containsKey(i))
				System.out.println(i);
		}
	}
}
