package by.khmel.dealerstat.dao;

import by.khmel.dealerstat.entity.Game;

import java.util.List;

public interface GameDao {
    void save(Game game);

    void delete(Long id);

    Game getById(Long id);

    List<Game> getAll();
}
