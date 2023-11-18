package Assignment4;
class Marks extends Exception{
	
	Marks(String message){
		super(message);
		System.out.println("");
		
	}
	
	
}
public class CheckMarks {
	static void checkMark(int m1,int m2) throws Marks
	{
		if (m1>40) {
			throw new Marks("Internal Marks Exceeded");
		}
		else if (m2>60) {
			throw new Marks("External Marks Exceeded");
		}
		else {
		     boolean res =  (m1 <=40 || m2<=60 );
			System.out.println("Result :" + res);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     try {	 
             checkMark(38,50);
		     }catch (Exception e) {
		    	 System.out.println(" Message :"+ e.getMessage());
		     }
		   //  System.out.println(" Message :"+ Marks.getMessage());
	}

}
