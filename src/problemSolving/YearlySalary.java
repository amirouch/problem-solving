package problemSolving;

import java.util.Scanner;

public class YearlySalary {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("please inter your monthly salary");
		int monthlySalary = obj.nextInt();
		
		int yearlySalary = monthlySalary * 12;
		System.out.println(yearlySalary);

	}

}
