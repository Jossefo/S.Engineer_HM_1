import java.util.LinkedList;

public class Manager extends TeamMember {

	protected LinkedList<Employee> employees_list;
	
	public Manager (String name ,int id , double bonus , double salary) {
		super(name,id,bonus,salary);
		employees_list = new LinkedList<Employee>() ;
	}
	
	public void add_employee (Employee e) {
		employees_list.add(e);
	}
	
	public double calculate_bonus () {
		double updated_bonus = 0 ;
		updated_bonus += task_list.size()*(this.salary_employee / 10) ;
		double factor = this.salary_employee / (employees_list.size());
		for (int i=0;i<employees_list.size();i++) {
			Employee employee = employees_list.get(i);
			if (employee.get_bonus() >= employee.get_salary()) {
				updated_bonus += factor ; 
			}
		}
		this.set_bonus(updated_bonus);
		return updated_bonus;
	}
	
}
