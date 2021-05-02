package by.khmel.dealerstat.repository;

import by.khmel.dealerstat.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

    Game getByName(String name);
}