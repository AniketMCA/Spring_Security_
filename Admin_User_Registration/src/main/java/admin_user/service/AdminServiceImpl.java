package admin_user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin_user.dto.AdminDto;
import admin_user.model.Admin;
import admin_user.repositories.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository; 
	
	@Override
	public Admin save(AdminDto adminDto) {
		Admin admin = new Admin(adminDto.getAction(),adminDto.getRemark());
		return adminRepository.save(admin);
		
	}
}
