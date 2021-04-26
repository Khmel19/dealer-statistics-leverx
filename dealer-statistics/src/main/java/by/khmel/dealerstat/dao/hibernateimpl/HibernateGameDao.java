package by.khmel.dealerstat.dao.hibernateimpl;

import by.khmel.dealerstat.dao.GameDao;
import by.khmel.dealerstat.entity.Game;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class HibernateGameDao implements GameDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void save(Game game) {
        Long id = game.getId();
        if (id == null) {
            entityManager.persist(game);
        } else {
            entityManager.merge(game);
        }
    }


    @Override
    public void delete(Long id) {
        entityManager.remove(getById(id));
    }


    @Override
    public Game getById(Long id) {
        return entityManager.find(Game.class, id);
    }


    @Override
    public List<Game> getAll() {
        return (List<Game>) entityManager.createNativeQuery("SELECT * FROM game").getResultList();
    }
}