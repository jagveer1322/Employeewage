package bridgelabz;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome Employewage");
		int check = (int)Math.floor(Math.random() * 10)%2;
        if (check == 1)
        {
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }
	}
}
