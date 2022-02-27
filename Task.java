
public class Task {
    // protected --> who derives can update this arguments 
	protected String task_name ;
	protected int days_task_takes ;
	protected int days_realy_taken ;
	
	
	// Constructor
	
	public Task (String name , int days_take , int days_realy_taken) {
		this.task_name = name ;
		this.days_task_takes = days_take ;
		this.days_realy_taken = days_realy_taken ;
	}
	
	// GETTERS
	
	public String getTaskName () {
		return this.task_name ;
	}
	
	public int getDaysTaskTakes () {
		return this.days_task_takes;
	}
	
	public int getDaysRTaken () {
		return this.days_realy_taken ;
	}
	
	 
	
	public void setTaskName(String name) {
		this.task_name = name;
	}
	
	public void setDaysTaskTakes (int Days) {
		this.days_task_takes = Days ;
	}
	
	public void setDaysRTaken (int Days) {
		this.days_realy_taken = Days ;
	}
	
	// METHODS
	
	public int isDeadLine () {
		// return 1 if the task completed as needed 
		// return 0 if the task didnt completed as needed 
		if ((this.days_realy_taken) == (this.days_task_takes)) {
			return 1;
		}
		if ((this.days_realy_taken) < (this.days_task_takes)) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
