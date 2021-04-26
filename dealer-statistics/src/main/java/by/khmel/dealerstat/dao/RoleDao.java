package by.khmel.dealerstat.dao;

import by.khmel.dealerstat.entity.Role;

import java.util.List;

public interface RoleDao {
    void save(Role role);

    void delete(Long id);

    Role getById(Long id);

    List<Role> getAll();
}
