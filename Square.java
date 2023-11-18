

public class Square {
	public int square(int x)
	{
		return x*x;
	}
	public double square1(double d)
	{
		return d*d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		
	    int sqr = s.square(3);
	    System.out.println("Square of int " + sqr);
	    
	    double sqr1 = s.square1(0.2);
	    System.out.println("Square of double " + sqr1);

	}

}
