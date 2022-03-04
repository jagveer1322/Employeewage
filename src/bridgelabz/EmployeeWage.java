package bridgelabz;
import java.util.Random;
public class EmployeeWage {
	static final int W_P_H = 20;
	static final int I_P_T = 1;
	static final int I_F_T = 2;
	
	public static void main(String[] args) {
		System.out.println("Welcome Employewage");
		int emphrs = 0;
		int empwage = 0;
		int check = (int)Math.floor(Math.random() * 10)%2;
		switch (check)
		{
        case I_P_T : System.out.println("Employee is present part time");
            emphrs = 4;
            break;
        case I_F_T : System.out.println("Employee is  full time");
            emphrs = 8;
            break;
        default : System.out.println("Employee is Absent");
            emphrs = 0;
        }
        empwage = W_P_H*emphrs;
        System.out.println("Employee wage =" +empwage );
            
      
	}
}
