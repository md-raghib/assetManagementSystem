package admin;

import java.util.ArrayList;

import com.csc.bean.User;
import com.csc.service.AdminService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings({ "serial" })
public class ViewUserAction extends ActionSupport implements ModelDriven  {
	
	ArrayList<User> eList=new ArrayList<>();
	
	public ArrayList<User> geteList() {
		return eList;
	}
	public void seteList(ArrayList<User> eList) {
		this.eList = eList;
	}
	
	public String execute() {
		AdminService as=new AdminService();
		eList=as.display();
	System.out.println("-----------------------in ACTION-----------------------");
	System.out.println(eList);
	
		return SUCCESS;
	}
	@Override
	public ArrayList<User> getModel() {
		// TODO Auto-generated method stub
		return eList;
	}
	
	
	
	
}
