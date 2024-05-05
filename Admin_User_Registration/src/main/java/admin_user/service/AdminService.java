package admin_user.service;

import admin_user.dto.AdminDto;
import admin_user.model.Admin;

public interface AdminService {
	
	Admin save(AdminDto adminDto);
}
