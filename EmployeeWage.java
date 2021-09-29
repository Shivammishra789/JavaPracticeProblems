   public class EmployeeWage {

   public static void main(String[] args) {

	System.out.println("Welcome to Employee Wage Computation Program !");

	int Wage_Per_Day = 20;

	int Full_Day_Hr = 8;

	int Is_Part_Time = 2;

	int Is_Present = 1;

	int Part_Day_Hr = 4;

	int Monthly_Wage = 0;

	
	int Working_Hrs = 0;

	for(int i=1;i<=20;i++){

	if(Working_Hrs > 100 ){
		
				break; 
		
				}
	else			{

	double Emp_Check = Math.floor(Math.random() *10 )%3;

	int Random = (int) Emp_Check;


	//Switch expression  

   	switch(Random){  

	//Case statements  

	 case 1:   {

			int Emp_Wage = Wage_Per_Day * Full_Day_Hr;

			Monthly_Wage+=Emp_Wage;

			Working_Hrs+=8;
   		    }
    		    break;  
    	 case 2:  {

			int Emp_Wage = Wage_Per_Day * Part_Day_Hr;

			Monthly_Wage+=Emp_Wage;

			Working_Hrs+=4;
  		  } 
   		   break;  
  
       //Default case statement  
         default:   

		   break;

			}
       	       }

	}
	System.out.println("Total Working Hours Of Employee Are " + Working_Hrs);
	System.out.println("Monthly Wage Of Employee Is " + Monthly_Wage);
	 		
                 }       
   }
