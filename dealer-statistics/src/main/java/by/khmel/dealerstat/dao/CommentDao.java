package by.khmel.dealerstat.dao;

import by.khmel.dealerstat.entity.Comment;

import java.util.List;

public interface CommentDao {
    void save(Comment user);

    void delete(Long id);

    Comment getById(Long id);

    List<Comment> getAll();
}
