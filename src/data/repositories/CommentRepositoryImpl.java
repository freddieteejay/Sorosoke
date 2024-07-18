package data.repositories;

import data.models.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository {
    List<Comment> comments = new ArrayList<Comment>();
    @Override
    public Comment save(Comment comment) {
        comments.add(comment);
        return comment;
    }

    @Override
    public List<Comment> getAllComments() {
        return List.of();
    }

    @Override
    public Comment getCommentById(int id) {
        return null;
    }

    @Override
    public Long countComments() {
        return 0L;
    }

    @Override
    public void deleteCommentById(int id) {

    }

    @Override
    public void deleteAllComments() {

    }
}
