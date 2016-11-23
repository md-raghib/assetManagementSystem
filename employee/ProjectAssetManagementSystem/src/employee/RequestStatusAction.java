package employee;
import java.util.ArrayList;

import com.csc.bean.Request;
import com.csc.service.RequestService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings({ "serial", "rawtypes" })
public class RequestStatusAction extends ActionSupport implements ModelDriven {
ArrayList<Request> statusList=new ArrayList<>();
	
	
	
	public ArrayList<Request> getStatusList() {
	return statusList;
}
public void setStatusList(ArrayList<Request> statusList) {
	this.statusList = statusList;
}
	public String execute() {
		RequestService rs=new RequestService();
		statusList=rs.displayStatus();
	
	
		return SUCCESS;
	}
	@Override
	public Object getModel() {
		
		return statusList;
	}
	
}