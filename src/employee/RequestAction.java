package employee;

import com.csc.bean.Request;
import com.csc.service.RequestService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RequestAction extends ActionSupport implements ModelDriven{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Request request=new Request();
	
	@Override
	public Object getModel() {
		
		return request;
	}
	public String execute() {
		RequestService as=new RequestService();
		if((as.requestAsset(request))!=false){
			return SUCCESS;
		}
		else
			return ERROR;
		
	} }


