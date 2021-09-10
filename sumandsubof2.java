public class AutoTypeConversion {
     int x = 20; 
    double y = 40.5; 
    long p = 30; 
    float q = 10.60f; 
	void sum() 
	{ 
	  double f1 ;
          f1 = x + y;
              System.out.println("Sum of two numbers"+f1);
	  
	} 
	void sub() 
	{ 
	  
	Float f2;
            f2 = p -q;
	  System.out.println("Sub of two numbers"+f2);
	} 
	public static void main(String[] args) 
	{ 
	   AutoTypeConversion obj = new AutoTypeConversion(); 
	 obj.sum();
            obj.sub();
	}
}