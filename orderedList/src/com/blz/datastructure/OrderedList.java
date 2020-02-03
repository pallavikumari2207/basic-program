package com.blz.datastructure;

import com.blz.datastruct.Node;

public class OrderedList<T> implements Comparable<T> {
	public Node start;
	public int size;
	public OrderedList()
	{
		this.size=0;
		this.start=null;
	}
	public boolean isEmpty()
	{
		if(start==null)
			return true;
		else 
			return false;
	}
	public int getsize()
	{
		return size;
	}
	public void add(T item)
	{ 
		Node n=new Node();
	   n.setdata(item);
	   
	   if(start==null)
	   {
		   n.setnext(start);
		   start=n;
			  size++;
			  }
		  else { 
			  Node t,t1;
		   t=start;
		   t1=t;
		   
		   
		    if (((Comparable<T>) n.getdata()).compareTo((T) t.getdata()) < 0) {
	   while(t.getnext()!=null)
	   { 	   t1=t;
		   t=t.getnext();
	   }
	   t1.setnext(n);
	   n.setnext(t);
	   size++;
	   }else if (((Comparable<T>) n.getdata()).compareTo((T) t.getdata()) >0) {
		   while(t.getnext()!=null){  
			   {
			   t1=t;
			   t=t.getnext();
		   }
		   n.setnext(t.getnext());
		   t1.setnext(n);
		   size++;
		   
	   }}}}//Node prev = null;
		/*while (((Comparable<T>) item).compareTo((T) start.getdata()) > 0 && start.getnext() != null) {
			prev = start;
			start = start.getnext();
		}
		prev.setnext(n);
		n.setnext(start);;
		    }*/
	public int viewlist()
	{
		 Node t=start;
		  if(isEmpty())
	System.out.println("list is empty");
		  else{
			  t=start;
			  for(int i=0;i<=size;i++) {
				 System.out.println("j" +t.getdata());
				  t=t.getnext();
				  
				  }}
			  
		return (int) t.getdata();
	}
	public static void main(String [] args)
	{
		OrderedList<Integer> obj=new OrderedList();
		obj.add(8);
		obj.add(6);
		//obj.add(4);
		//obj.add(7);
		obj.viewlist();
		System.out.println("size:"+obj.getsize());
	}
	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
