package by.khmel.dealerstat.repository;

import by.khmel.dealerstat.entity.Comment;
import by.khmel.dealerstat.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> getAllByUser(User user);
}
