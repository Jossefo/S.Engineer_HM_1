import java.util.LinkedList;

public class Employee {

	protected String employee_name ;
	protected int id_number ; 
	protected LinkedList<Task> task_list ;
	protected double salary_employee ;
	protected double bonus_employee ;
	
	//  
	public Employee(String name ,int id , double bonus , double salary ) {
		
		this.employee_name = name ;
		this.id_number = id ;
		this.bonus_employee = bonus ;
		this.salary_employee = salary ;
		task_list = new LinkedList<Task>();


	}
	
	// Getters
	public String get_name() {
		return this.employee_name;
	}
	
	public int get_id() {
		return this.id_number ;
	}
	
	public LinkedList<Task> get_tasks() {
		return this.task_list ;
	}
	
	public double get_salary() {
		return this.salary_employee ;
	}
	
	public double get_bonus () {
		return this.bonus_employee;
	}
	
	//Setters
	public void set_name (String name) {
		this.employee_name = name ;
	}
	
	public void set_id (int id) {
		this.id_number = id ;
	}
	
	public void set_salary (double salary) {
		this.salary_employee = salary ;
	}
	
	public void set_bonus (double bonus) {
		this.bonus_employee = bonus ;
	}
	
	//Methods
	
	public void add_task_to_list (Task task_) {
		task_list.add(task_);
	}
	
	public double calculate_bonus () {
		return 0;
	}
	

	
	
}  
   