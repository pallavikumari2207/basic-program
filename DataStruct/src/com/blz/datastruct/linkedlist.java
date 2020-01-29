package com.blz.datastruct;

public class linkedlist {
	private int size;
	private Node start;
	public linkedlist()
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
   public void insertAtStart(String val)
   {
	   Node n;
	   n=new Node();
	   n.setdata(val);
	   n.setnext(start);
	   start=n;
		  size++;
   }
   public void remove(String item) {
		Node n = start;
		Node prev = null;
		if (start.getdata().equals(item)) {
			start= start.getnext();
			size -= 1;
			return;
		}
		while (!n.getdata().equals(item)) {
			prev = n;
			n = n.getnext();
		}
		n = n.getnext();
		prev.setnext(n);
		n = null;
		size -= 1;
	}
   public void insertSAtLast(String val)
   {
	   Node n,t;
	   n=new Node();
	   n.setdata(val);
	   t=start;
	   if(t==null)
	   { start=n;
	   size++;}
	   else {
		   while(t.getnext()!=null)
		   {
			   t=t.getnext();
			   }
			   t.setnext(n);
	   size++;
		   }
		  
   }
   public void insertAtPos(String val,int pos)
   {
	  
	   if(pos==1)
		   insertAtStart(val);
	   else if(pos==size+1)
		   insertSAtLast(val);
	   else if(pos>1 && pos<=size)
		   { Node n,t;
		     n=new Node(val,null);
		     t=start;
		     for(int i=1;i<pos-1;i++)
		     { 
		    	 t=t.getnext();
		    	 n.setnext(t.getnext());
		    	 size++;
		     }
		   }
	   else
		   System.out.println("insertion not possible");
   }
//   public void deleteAtStart()
//   {
//	   if(start==null)
//          System.out.println("list is empty");
//	   else {
//		   System.out.println("Checkwed   "+start.getdata());
//		   start=start.getnext();
//		   
//}	   
//}
   public void deleteAtFirst()
   {

	   if(start==null)
       System.out.println("list is empty");
	   else
		   start=start.getnext();
	   size--;  
   }
   public void deletelast()
   {

	   if(start==null)
          System.out.println("list is empty");
	   else if (size==1)
	   {
		   start=null;
		   size--;
   }
	   else
	   {
		 Node t;
		 t=start;
//		 for(int i=1;i<=size;i++)
//			 {
//			 t=t.getnext();
//			 }
//			 t.setnext(null);
//			 size--;
//			 }
		 while(t.getnext() != null)
		 {
			t = t.getnext(); 
		 }
		 t.setnext(null);
		 size--;
	   }
   }
  public void deleteAtpos(int pos)
  { if(start==null)
      System.out.println("list is empty");
  else if(pos<1 || pos>size)
	  System.out.println("deletion not possible");
  else if(pos==1)
	  deleteAtFirst();
  else if(pos==size)
	  deletelast();
  else
  {
	  Node t,t1;
	  t=start;
	  for(int i=1;i<pos-1;i++)
	  {t=t.getnext();
	  t1=t.getnext();
	  t.setnext(t1.getnext());
	  size--;
  }
	  
	  
  }}
  public boolean search( String key) 
  { 
      Node t = start;    //Initialize current 
      while (t.getnext()!= null) 
      { 
          if (t.getdata().equals(key)) 
           return true;    //data found
          else
        	  t = t.getnext(); 
      }
      return false;    //data not found 
  }
  public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("[ ");
		Node node = start;
		while (node != null) {
			s.append(node.data);
			node = node.next;
			s.append(",");
		}
		s.append(" ]");
		return s.toString();
	}

	/**
	 * method to show the items in the list
	 */
	public void show() {
		System.out.println(toString());
	}



  public String viewlist()
  {
	  Node t=start;
	  if(isEmpty())
System.out.println("list is empty");
	  else{
		  //t=start;
		  for(int i=1;i<=size;i++) {
			  System.out.println("" +t.getdata());
			  t=t.getnext();
			  
			  }}
		  
	return t.getdata();
	  }
	public int index(String item) {
		int index = 0;
		Node n = start;
		while (!n.data.equals(item)) {
			n = n.next;
			index++;
		}
		return index;

	}
	public String pop() {
		Node n = start;
		if (size == 1) {
			start = start.getnext();
			size--;
			return n.data;
		}
		while (n.getnext() != null) {
			n = n.getnext();
		}
		String ret =  n.getdata();
		n = n.getnext();
		size -= 1;
		return ret;
	}
	public String pop(int pos) {
		int index = 0;
		Node n = start;
		if (pos == 0) {
			start = start.getnext();
			size--;
			return  n.getdata();
		}
		Node prev = null;
		while (index != pos) {
			prev = n;
			n = n.getnext();
			index++;
		}
		prev.setnext(n.getnext());
		size -= 1;
		return  n.data;
	}
}