public class Calculator {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter an arithematic operation:");
	    String s= sc.next();
	    
		//String s = "6/3*3";
	    ArithematicOperation ao = new ArithematicOperation();
	    ao.calculate(s);
	   
	    sc.close();
	}
}
