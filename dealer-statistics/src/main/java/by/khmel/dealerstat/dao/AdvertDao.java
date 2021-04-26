package by.khmel.dealerstat.dao;

import by.khmel.dealerstat.entity.Advert;
import by.khmel.dealerstat.entity.User;

import java.util.List;

public interface AdvertDao {
    void save(Advert advert);

    void delete(Long id);

    Advert getById(Long id);

    List<Advert> getAll();

    List<Advert> getByUser(User user);
}
