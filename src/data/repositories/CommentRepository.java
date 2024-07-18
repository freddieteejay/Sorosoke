package data.repositories;

import data.models.Comment;

import java.util.List;

public interface CommentRepository {
    Comment save(Comment comment);
    List<Comment> getAllComments();
    Comment getCommentById(int id);
    Long countComments();
    void deleteCommentById(int id);
    void deleteAllComments();
}
