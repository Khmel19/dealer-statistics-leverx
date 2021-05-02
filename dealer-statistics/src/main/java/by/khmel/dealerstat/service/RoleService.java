package by.khmel.dealerstat.service;

import by.khmel.dealerstat.entity.Role;
import by.khmel.dealerstat.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Transactional
    public Role getById(Long id) {
        return roleRepository.getById(id);
    }


    @Transactional
    public Role getByName(String name) {
        return roleRepository.getByName(name);
    }

}
