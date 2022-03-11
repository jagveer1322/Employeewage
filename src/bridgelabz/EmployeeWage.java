package bridgelabz;
import java.util.Random;

public class EmployeeWage {
	static final int WAGE_PER_HOUR = 20;
	static final int IS_PART_TIME = 1;
	static final int IS_FULL_TIME = 2;
	static final int MIN_WORKING_DAY = 20;
    static final int MAX_WORKING_HOUR = 100;
    static int emphrs;
    static int check;
    static int empwage = 0;
	static int totalempwage = 0;
    static int totalworkingdays = 0;
    static int totalworkinghours =0;
    
   
    void getcheck() {
     check = (int)Math.floor(Math.random() *10)%3;
    }
    
    void getemphours() {
    	
    	System.out.print("check v" +check); 
           switch (check) {
             case IS_PART_TIME:
                 emphrs = 4;
                 break;
             case IS_FULL_TIME:
                 emphrs = 8;
                 break;
             default:
                 emphrs = 0;
             }
        }
    void calculatewage() {
    	while(totalworkingdays < MIN_WORKING_DAY && totalworkinghours <= MAX_WORKING_HOUR)
         {   
 	    	
             empwage = WAGE_PER_HOUR * emphrs;
             totalempwage = totalempwage + empwage;
             totalworkinghours = totalworkinghours + emphrs;
             totalworkingdays++;
    }
         
    }
    public static void main(String[] args) {
		EmployeeWage obj = new EmployeeWage();
		System.out.println("Welcome Employeewage");
		obj.getcheck();
     	obj.getemphours();
		obj.calculatewage();
        System.out.println("Total Working Hours = " +totalworkinghours);
        System.out.println("Total Working Days = " +totalworkingdays);
        System.out.println("Total Employee wage is " +totalempwage);
	}
}
