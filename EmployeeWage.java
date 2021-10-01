public class EmployeeWage {
	
    public static final int Is_Full_Time = 1;

    public static final int Is_Part_Time = 2;

    public static final int Wage_Per_Hr = 20;

    public static final int Max_Working_Days = 20;

    public static final int Max_Monthly_Hrs = 100;

public static void main(String[] args) {

	
    //Variables

    int Emp_Hrs=0; 
    int Total_Working_Days = 0; 
    int Total_Working_Hrs = 0;

    while ( Total_Working_Hrs <= Max_Monthly_Hrs &&

            Total_Working_Days < Max_Working_Days ) {

    Total_Working_Days++;


    double Emp_Check = Math.floor(Math.random() *10 )%3;


    //Switch expression

    switch((int) Emp_Check){

    //Case statements

     case Is_Full_Time:

                       Emp_Hrs=8;

                       break;
     case Is_Part_Time:

                       Emp_Hrs=4;

                       break;

   //Default case statement
     default:

                      Emp_Hrs=0;

                       break;
                    }

    Total_Working_Hrs+=Emp_Hrs;

    System.out.println("Day:" + Total_Working_Days + " Emp Hr: " + Emp_Hrs);
    
    	}

    int Monthly_Emp_Wage =Total_Working_Hrs*Wage_Per_Hr;
    System.out.println("Total Employee Wage is : " + Monthly_Emp_Wage);

   	}
}
