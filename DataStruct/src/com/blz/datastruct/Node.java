package com.blz.datastruct;

import com.blz.datastructure.Node;

public class Node<T> {
	
	private T  data;
	Node next;
	public Node()
	{
		this.data=null;
		this.next=null;
	}
	public Node(T d, Node n)
	{
		this.data=d;
		this.next=n;
	}
	public void setdata(T val)
	{
		data=val;
	}
	public void setnext(Node n)
	{
		next=n;
	}
	public T getdata()
	{
		return data;
	}
	public Node getnext()
	{
		return next;
	}
	}

