import java.util.Locale; 

public class Main {

	public static void main(String[] args) {
		String product1 = "computer";
		String product2 = "Office desk"; 
		
		  int age = 30;
		  int code = 5290;
		  char gender = 'F';
		
		  double price1 = 2100.0;
	    double price2 = 650.50;
	  	double measure = 53.234567;
		
				Locale.setDefault(Locale.US);
		System.out.println("products:");
		 System.out.printf("%s, which price is $ %.2f%n",product1,price1);
		  System.out.printf("%s, which price is $%.2f%n", product2, price2 );
		   System.out.println();
		    System.out.printf("%d years old, code %d and gender %s%n", age, code, gender);
		     System.out.println();
		      System.out.printf("measue with eight decimal places:%f%n",measure);
		       System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		        System.out.printf("Us decimal point: %.3f%n",measure );
		
		

	}

}
