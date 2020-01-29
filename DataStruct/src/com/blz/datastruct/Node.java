package com.blz.datastruct;

public class Node {
	
		String data;
		Node next;
		Node()
		{
		this.data=null;
		this.next=null;

		}
		Node (String val,Node n)
		{
		this.data=val;
		this.next=n;
		}
		void setdata(String d)
		{
		data=d;
		}
		void setnext(Node n)
		{
		next=n;
		}
		String getdata()
		{
		return data;
		}
		Node getnext()
		{
		return next;
		}
		}
