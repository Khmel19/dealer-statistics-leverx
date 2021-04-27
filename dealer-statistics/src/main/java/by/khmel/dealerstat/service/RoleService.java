package by.khmel.dealerstat.service;

import by.khmel.dealerstat.dao.RoleDao;
import by.khmel.dealerstat.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    private final RoleDao roleDao;

    @Autowired
    public RoleService(RoleDao roleDao) {
        this.roleDao = roleDao;
    }


    public void save(Role role) {
        roleDao.save(role);
    }


    public Role getById(Long id) {
        return roleDao.getById(id);
    }


    public void delete(Long id) {
        roleDao.delete(id);
    }


    public List<Role> getAll() {
        return roleDao.getAll();
    }
}
