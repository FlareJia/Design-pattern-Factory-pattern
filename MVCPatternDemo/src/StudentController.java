
public class StudentController {

	private Student model;
	private StudentView view;
	
	public StudentController(Student model,StudentView view){
		this.model=model;
		this.view=view;
	}
	
	public void setStudentName(String name){
		model.setName(name);
	}
	//为下面的updateView()服务
	public String getStudentName(){
		return model.getName();
	}
	
	
	public void setStudentRollNo(String rollNo){
		model.setRollNo(rollNo);
	}
	//为下面的updateView()服务
	public String getStudentRollNo(){
		return model.getRollNo();
	}
	
	
	public void updateView(){
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
}
