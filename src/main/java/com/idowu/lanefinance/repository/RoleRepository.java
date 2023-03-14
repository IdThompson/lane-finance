package com.idowu.lanefinance.repository;

import com.idowu.lanefinance.constants.RoleEnum;
import com.idowu.lanefinance.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {

Role findRoleByName(RoleEnum roleEnum);
}
