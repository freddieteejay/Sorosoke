package Test;

import data.models.Comment;
import data.repositories.CommentRepository;
import data.repositories.CommentRepositoryImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommentRepositoryTest {
    @Test
    void testThatCommentIsEmpty() {
        CommentRepositoryImpl comment = new CommentRepositoryImpl();
        assertEquals(0, comment.countComments());
    }

    @Test
    void testThatICanAddComment() {
        CommentRepositoryImpl comment = new CommentRepositoryImpl();
        Comment newComment = new Comment();
        comment.save(newComment);
        assertEquals(1, comment.countComments());
    }
}
