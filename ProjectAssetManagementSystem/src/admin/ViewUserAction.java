package admin;

import java.util.ArrayList;

import com.csc.bean.User;
import com.csc.service.AdminService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings({ "serial" })
public class ViewUserAction extends ActionSupport {
	
	ArrayList<User> eList=new ArrayList<>();
	
	public ArrayList<User> geteList() {
		return eList;
	}
	public void seteList(ArrayList<User> eList) {
		this.eList = eList;
	}
	
	public String execute() {
		AdminService as=new AdminService();
		as.display();
	
		return SUCCESS;
	}
	
	
	
	
}
