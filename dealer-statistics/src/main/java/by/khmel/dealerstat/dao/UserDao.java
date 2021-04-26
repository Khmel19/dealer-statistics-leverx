package by.khmel.dealerstat.dao;

import by.khmel.dealerstat.entity.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    void delete(Long id);

    User getById(Long id);

    List<User> getAll();
}
