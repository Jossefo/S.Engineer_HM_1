
public class TeamMember extends Employee{
	
	protected double factor = this.get_salary() / this.task_list.size() ;
	
	public TeamMember (String name ,int id , double bonus , double salary) {
		super(name,id,bonus,salary);
	}
	
	public double calculate_bonus () {
		set_bonus(0);
		double updated_bonus = 0 ;
		for (int i=0;i<task_list.size();i++) {
			Task task = task_list.get(i);
			int check = task.isDeadLine();
			if (check == 1 ) {
				updated_bonus += factor ;
			}
			if (check == -1) {
				updated_bonus += (factor*2);
			}
			
		}
		this.set_bonus(updated_bonus);
		return updated_bonus ;
	}
	





}


