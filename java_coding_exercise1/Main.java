package java_coding_exercise1;

public class Main {
	    public static void main(String[] args) {
	        // Create an instance of AddEmployee
	        AddEmployee addEmployee = new AddEmployee();

	        // Adding some employees
	        addEmployee.addEmployee(new Employee(1, "John Doe", "New York"));
	        addEmployee.addEmployee(new Employee(2, "Alice Smith", "Los Angeles"));
	        addEmployee.addEmployee(new Employee(3, "Bob Johnson", "Chicago"));

	        // Retrieving an employee by id
	        int searchId = 2;
	        Employee foundEmployee = addEmployee.getEmployee(searchId);
	        if (foundEmployee != null) {
	            System.out.println("Employee found:");
	            System.out.println("ID: " + foundEmployee.getId());
	            System.out.println("Name: " + foundEmployee.getName());
	            System.out.println("City: " + foundEmployee.getCity());
	        } else {
	            System.out.println("Employee with ID " + searchId + " not found.");
	        }
	    }
	}



