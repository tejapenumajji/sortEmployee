import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sortemp.Employee.Employee;

public class EmployeeSortMain {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("tarun", 28));
		employees.add(new Employee("karan", 29));
		employees.add(new Employee("varun", 8));
		employees.add(new Employee("arun", 22));
		employees.add(new Employee("prasad", 28));
		employees.add(new Employee("sushan", 29));
		employees.add(new Employee("girish", 8));
		employees.add(new Employee("pratap", 22));

		Collections.sort(employees, Comparator.comparingInt(Employee::getAge).thenComparing(Employee::getName));

		System.out.println("Empoyee list after sorting by age then by name: "+ employees);

		System.out.println("Below are the employee names having age >=10: ");

		employees.stream().filter(employee -> employee.getAge() >= 10).map(employee -> employee.getName())
				.forEach(System.out::println);
		
	}

}
