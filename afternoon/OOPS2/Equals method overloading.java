						Equals method overloading 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the product id");
		int pid1= Sc.nextInt();
		System.out.println("Enter the product name");
		String pname1= Sc.next();
		System.out.println("Enter the supplier name");
		String sname1= Sc.next();
		
		Product p1= new Product(pid1,pname1,sname1);
		p1.display();
		
		System.out.println("Enter the product id");
		int pid2= Sc.nextInt();
		System.out.println("Enter the product name");
		String pname2= Sc.next();
		System.out.println("Enter the supplier name");
		String sname2= Sc.next();
		
		Product p2= new Product(pid2,pname2,sname2);
		p2.display();
		
		if(p1.equals(p2))
		{
			System.out.println("The two products are the same");
		}
		else
		{
			System.out.println("The two products are different");
		}

	}

}
---------------------------------------------------------------------------------------------////////////////////
Product.java






public class Product {
    
	private long pid;
	private String pname;
	private String sname;
	
	public Product() {
		super();
	}

	public Product(long pid, String pname, String sname) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.sname = sname;
	}

	public long getPid() {
		return this.pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (pid != other.pid)
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}

	void display()
	{
		System.out.println("Product Id is "+this.pid);
		System.out.println("Product Name is "+this.pname);
		System.out.println("Supplier Name is "+this.sname);
		
	}

}





