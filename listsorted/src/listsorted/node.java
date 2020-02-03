package listsorted;

//import com.blz.datastructure.Node;

public class node {
	private int data;
	node next;
	public node()
	{
		this.data=0;
		this.next=null;
	}
	public node(int d, node n)
	{
		this.data=d;
		this.next=n;
	}
	public void setdata(int val)
	{
		data=val;
	}
	public void setnext(node n)
	{
		next=n;
	}
	public int getdata()
	{
		return data;
	}
	public node getnext()
	{
		return next;
	}
	}


