

public class Addition {

	public int Add1(int x ,int y)
	{
		return  x+y;
	}
	public  int Add2(int x ,int y,int z)
	{
		return x+y+z;
	}
	public  int Add3(int x ,int y, int z, int r)
	{
	      return x+y+z+r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a = new Addition();
		int sum =a.Add1(5,5);
		System.out.println("Sum of two number :"+ sum);
		
		int sum1 =a.Add2(5,5,10);
		System.out.println("Sum of three number :"+ sum1);
		
		int sum3 =a.Add3(5,5,10,10);
		System.out.println("Sum of four number :"+ sum3);

	}

}
