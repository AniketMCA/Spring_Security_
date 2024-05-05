package admin_user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long Application_no;
	private String action;
	private String remark;
	
	public Admin(String action, String remark) {
		super();
		this.action = action;
		this.remark = remark;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getApplication_no() {
		return Application_no;
	}

	public void setApplication_no(long application_no) {
		Application_no = application_no;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}	
}
