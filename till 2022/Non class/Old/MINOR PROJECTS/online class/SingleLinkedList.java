import java.util.Scanner;
public class SingleLinkedList {
	Node start=null;
	
	Scanner sc=new Scanner(System.in);
	public void create()
	{
		Node p=new Node();
		System.out.println("Input info ");
		p.info=sc.nextInt();
		p.link=null;
		start=p;
		System.out.println("Do you want more nodes(y/n)");
		char ch=sc.next().charAt(0);
		while(ch!='n')
		{
			Node q=new Node();
			System.out.println("Input info ");
			q.info=sc.nextInt();
			q.link=null;
			p.link=q;
			p=q;
			System.out.println("Do you want more nodes(y/n)");
			ch=sc.next().charAt(0);
		}
	}
	public void display()
	{
		Node p=start;
		System.out.println("Start="+start);
		while(p!=null)
		{
			System.out.println(p.info+"  "+p.link);
			p=p.link;
		}		
	}
	public int count()
	{
		int c=0;
		Node p=start;
		while(p!=null)
		{
			c++;
			p=p.link;
		}		
		return c;
	}
	public int search(int ele)
	{
		int pos=0;
		Node p=start;
		while(p!=null)
		{
			pos++;
			if(p.info==ele)
				return pos; 
			p=p.link;
		}
		return -1;
	}
	public void insBeg()
	{
		Node p=new Node();
		System.out.println("Input info ");
		p.info=sc.nextInt();
		p.link=null;
		
		p.link=start;
		start=p;		
	}
	public void insEnd()
	{
		Node p=new Node();
		System.out.println("Input info ");
		p.info=sc.nextInt();
		p.link=null;
		
		if(start==null)
		{
			start=p;
		}
		else
		{
		Node q=start;
		while(q.link!=null)
			q=q.link;		
		
		q.link=p;		
		}
	}
	public void insLoc()
	{
		System.out.println("Input node number ");
		int loc=sc.nextInt();
		int c=count();
		if(loc<=c+1)
		{
			if(loc==1)
				insBeg();
			else if(loc==c+1)
				insEnd();
			else
			{
				Node p=new Node();
				System.out.println("Input info ");
				p.info=sc.nextInt();
				p.link=null;
				
				Node q=start;
				int cnt=1;
				while(cnt<loc-1)
				{
					cnt++;
					q=q.link;
				}
				
				p.link=q.link;
				q.link=p;
			}
		}
	}
	public void delBeg()
	{
		if(start==null)
		{
			System.out.println("Underflow");
			return;
		}
		start=start.link;		
	}
	public void delEnd()
	{
		if(start==null)
		{
			System.out.println("Underflow");
			return;
		}
		if(start.link==null)
		{
			delBeg();
		}
		else
		{
		Node q=start;
		while(q.link.link!=null)
			q=q.link;	
		
		q.link=null;
		}
	}
	public void reverse()
	{
		if(count()>=2)
		{
			Node p=null,q=start,r=start.link;
			q.link=null;
			while(r!=null)
			{
				p=q;
				q=r;
				r=r.link;
				q.link=p;
			}
			start=q;
		}		
	}
	public void sort()
	{
		Node i,j;
		for(i=start;i.link!=null;i=i.link)
		{
			for(j=start;j.link!=null;j=j.link)
			{
				if(j.info > j.link.info)
				{
					int temp=j.info;
					j.info=j.link.info;
					j.link.info=temp;
				}
			}
		}
	}
}
