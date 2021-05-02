package by.khmel.dealerstat.repository;

import by.khmel.dealerstat.entity.Advert;
import by.khmel.dealerstat.entity.Game;
import by.khmel.dealerstat.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvertRepository extends JpaRepository<Advert, Long> {

    List<Advert> getAllByUser(User user);


    @Modifying
    @Query("UPDATE Advert a set a.status = ?2 where a.id = ?1")
    void setAdvertApprove(Long id, boolean isApproved);


    List<Advert> getAllByGames(Game game);


    @Query("SELECT a FROM Advert a WHERE a.status = true")
    List<Advert> getAllApprovedAdverts();

}
