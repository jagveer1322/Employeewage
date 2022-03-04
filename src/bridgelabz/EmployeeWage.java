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
		int totalempwage = 0;
        int totalworkingdays = 0;
        while (totalworkingdays < 20) {
            int check = (int) Math.floor(Math.random() * 10) % 3;
            switch (check) {
                case I_P_T:
                    emphrs = 4;
                    break;
                case I_F_T:
                    emphrs = 8;
                    break;
                default:
                    emphrs = 0;
            }
            empwage = W_P_H * emphrs;
            totalempwage = totalempwage + empwage;
            totalworkingdays++;
        }
        System.out.println("Employee wage is " + totalempwage);
      
	}
}
