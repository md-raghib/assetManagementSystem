package admin;

import com.csc.bean.User;
import com.csc.service.AdminService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings({ "serial", "rawtypes" })
public class AdminAction extends ActionSupport implements ModelDriven{
	
	
	
	User user=new User();
	
	@Override
	public Object getModel() {
		
		return user;
	}
	public String execute() {
		AdminService as=new AdminService();
		if((as.create(user))!=false){
			return SUCCESS;
		}
		else
			return ERROR;
		
	}
	
}