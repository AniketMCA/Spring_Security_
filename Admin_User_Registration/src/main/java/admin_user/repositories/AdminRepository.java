package admin_user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import admin_user.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{

	Admin findByRemark (String remark);
}
