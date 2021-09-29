   public class EmployeeWage {

   public static void main(String[] args) {

	System.out.println("Welcome to Employee Wage Computation Program !");

	int Wage_Per_Day = 20;

	int Full_Day_Hr = 8;

	int Is_Part_Time = 2;

	int Is_Present = 1;

	int Part_Day_Hr = 4;


	double Emp_Check = Math.floor(Math.random() *10 )%3;

	int Random = (int) Emp_Check;


	//Switch expression  

   	switch(Random){  

	//Case statements  
   
	 case 1:   {
    			System.out.println("Employee is present");
			
			int Emp_Wage = Wage_Per_Day * Full_Day_Hr;
			
			System.out.println("Employee daily wage is " + Emp_Wage );
   		    }
    		    break;  
    	 case 2:  {
    			System.out.println("Employee is part time");
			
			int Emp_Wage = Wage_Per_Day * Part_Day_Hr;
		
			System.out.println("Employee daily wage is " + Emp_Wage );
  		  } 
   		   break;  
  
       //Default case statement  
         default:   {
			System.out.println("Employee is absent");
	    
			System.out.println("Employee daily wage is 0 " );
	    	    }  
    
		}
        	
	 }
   }
