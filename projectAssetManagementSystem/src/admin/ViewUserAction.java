package admin;

import java.util.ArrayList;

import com.csc.bean.User;
import com.csc.service.AdminService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings({ "serial" })
public class ViewUserAction extends ActionSupport
{
	
	ArrayList<User> empList=new ArrayList<>();
	
	public ArrayList<User> getEmpList() {
		return empList;
	}

	public void setEmpList(ArrayList<User> empList) {
		this.empList = empList;
	}

	public String execute() {
		AdminService as=new AdminService();
		empList=as.display();
	
		return SUCCESS;
	}
		
}
