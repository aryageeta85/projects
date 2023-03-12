package pkg1;

public class student1 {
	//problem (((((10+2)+2)-2)*2)/2)
	public int add(int a,int b)
	{
		int c=a+b;
		System.out.println("add two values"+c);
		return c;
		
	}
	public int sub(int a,int b)
	{
		int c=a-b;
		System.out.println("sub of two values"+c);
		return c;
		
	}
	public int multi(int a,int b)
	{
		int c=a*b;
		System.out.println("multi of values"+c);
		return c;
		
	}
	public void divi(int a,int b)
	{
	int c=a/b;
	System.out.println("divi of valus"+c);
	
	}
	public static void main(String[] args) {
		student1 obj=new student1();
		int m=obj.add(10,2);
		int n=obj.add(m,2);
		int o=obj.sub(n,2);
		int p=obj.multi(o, 2);
		obj.divi(p,2);
	
		
		
		
	}
	

}
