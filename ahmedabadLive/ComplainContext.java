package ahmedabadLive;

import java.util.ArrayList;
import java.util.List;

public class ComplainContext {

	private int id;
	private String title;
	private String description;
	private String address;
	private long mobile_number;
	private String email;
	
	private static List<ComplainContext> complainList = new ArrayList<>();
	private static ComplainContext comaplainContext = new ComplainContext();
	
	
	public static List<ComplainContext> getComplainList() {
		return complainList;
	}


	public static void setComplainList(List<ComplainContext> complainList) {
		complainList.addAll(complainList);
	}


	public static ComplainContext getComaplainContext() {
		return comaplainContext;
	}


	public static void setComaplainContext(ComplainContext comaplainContext) {
		ComplainContext.comaplainContext = comaplainContext;
	}


	public static void main(String[] args) {


	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getMobile_number() {
		return mobile_number;
	}


	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

}
