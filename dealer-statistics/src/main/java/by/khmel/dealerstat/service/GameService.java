package by.khmel.dealerstat.service;

import by.khmel.dealerstat.dao.GameDao;
import by.khmel.dealerstat.entity.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameDao gameDao;

    @Autowired
    public GameService(GameDao gameDao) {
        this.gameDao = gameDao;
    }


    public void save(Game game) {
        gameDao.save(game);
    }


    public Game getById(Long id) {
        return gameDao.getById(id);
    }


    public void delete(Long id) {
        gameDao.delete(id);
    }


    public List<Game> getAll() {
        return gameDao.getAll();
    }
}
