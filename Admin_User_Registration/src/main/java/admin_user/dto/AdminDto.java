package admin_user.dto;

public class AdminDto {
	
	private String action;
	private String remark;
	
	public AdminDto(String action, String remark) {
		super();
		this.action = action;
		this.remark = remark;
	}

	public AdminDto() {
		super();
		// TODO Auto-generated constructor stub
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
