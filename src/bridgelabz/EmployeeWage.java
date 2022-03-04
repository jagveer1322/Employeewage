package bridgelabz;
import java.util.Random;
public class EmployeeWage {
	static final int W_P_R = 20;
	public static void main(String[] args) {
		System.out.println("Welcome Employewage");
		int check = (int)Math.floor(Math.random() * 10)%2;
        if (check == 1)
        {
        	int emphrs = 8;
        	int empwage = W_P_R*emphrs;
            System.out.println("Employee is Present");
            System.out.println("Daily wage is " +empwage);
        }
        else
        {
            System.out.println("Employee is Absent");
        }
      
	}
}
