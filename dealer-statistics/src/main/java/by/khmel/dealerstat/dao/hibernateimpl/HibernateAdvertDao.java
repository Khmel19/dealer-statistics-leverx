package by.khmel.dealerstat.dao.hibernateimpl;

import by.khmel.dealerstat.dao.AdvertDao;
import by.khmel.dealerstat.entity.Advert;
import by.khmel.dealerstat.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class HibernateAdvertDao implements AdvertDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void save(Advert advert) {
        Long id = advert.getId();
        if (id == null) {
            entityManager.persist(advert);
        } else {
            entityManager.merge(advert);
        }
    }


    @Override
    public void delete(Long id) {
        entityManager.remove(getById(id));
    }


    @Override
    public Advert getById(Long id) {
        return entityManager.find(Advert.class, id);
    }


    @Override
    public List<Advert> getAll() {
        return (List<Advert>) entityManager.createNativeQuery("SELECT * FROM advert").getResultList();
    }


    @Override
    public List<Advert> getByUser(User user) {
        return entityManager.createNativeQuery("SELECT * FROM advert WHERE id=" + user.getId()).getResultList();
    }
}