package leetcodeProblems;

public class LC1491 {

	public static void main(String[] args) {
		int[] testA = {4000,3000,1000,2000};
		average(testA);
	}
	
	public static double average(int[] salary) {
		
		double highestSalary = salary[0];
		double lowestSalary = salary[0];
		double numberOfE = salary.length-2;
		double sumOfSalaries = 0;
		int highestSalaryI = 0;
		int lowestSalaryI = 0;
		
		//get correct highest and lowest salary
//		for(int index = 0; index < salary.length; index++) {
//			if (salary[index] > highestSalary) highestSalary = salary[index]; 
//			if (salary[index] < lowestSalary) lowestSalary = salary[index]; 
//		}
		//Instead of taking the actual salary number, lets try to take the index
	//turned out to be redundant but i will leave it
		
		for(int index = 0; index < salary.length; index++) {
			if (salary[index] > highestSalary) {
				highestSalary = salary[index];
				highestSalaryI = index; 
			}
			if (salary[index] < lowestSalary) {
				lowestSalary = salary[index];
				lowestSalaryI = index; 
			}
		}
		
		
		System.out.println("Highest Salary is " + highestSalary + " at index " + highestSalaryI);
		System.out.println("Lowest Salary is " + lowestSalary+ " at index " + lowestSalaryI);
		System.out.println("Number of Employees is " + salary.length);

		
		
		for(int index = 0; index < salary.length; index++) {
			if (salary[index] != highestSalary) {
				if (salary[index] != lowestSalary) {
					sumOfSalaries += salary[index];
				}
			}
		}
		System.out.println("Total without highest and lowest is " + sumOfSalaries);
		System.out.println("Average without highest and lowest is " + sumOfSalaries/numberOfE);

		return sumOfSalaries/numberOfE;

	}

}
