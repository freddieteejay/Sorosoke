package Test;

import data.models.Post;
import data.repositories.PostRepositoryIMPL;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostRepositoryIMPLTest {

        @Test
        void testThatPostListIsEmpty(){
            PostRepositoryIMPL repo = new PostRepositoryIMPL();
            assertTrue(repo.isEmpty());
        }

        @Test
        void testThatPostListIsNotEmptyWhenValueAdded(){
            PostRepositoryIMPL repo = new PostRepositoryIMPL();
            Post post = new Post();
            repo.save(post);
            assertFalse(repo.isEmpty());
        }

        @Test
        void testThatPostIsAddedSucessfully(){
            PostRepositoryIMPL repo = new PostRepositoryIMPL();
            Post post = new Post();
            repo.save(post);
            assertEquals(1,repo.count());
        }

        @Test
        void testThatAllPostCanBeDeleted(){
            PostRepositoryIMPL repo = new PostRepositoryIMPL();
            Post post = new Post();
            repo.save(post);
            Post pos = new Post();
            repo.save(pos);
            repo.deleteAll();
            assertEquals(0,repo.count());

        }

        @Test
        void testThatYouCanDeleteAPostById(){
            PostRepositoryIMPL repo = new PostRepositoryIMPL();
            Post post = new Post();
            post.setId(12112);
            repo.save(post);
            Post pos = new Post();
            pos.setId(12110);
            repo.save(pos);
            repo.deleteById(12112);
            assertEquals(1,repo.count());
        }

        @Test
        void testThatCanFindPostById(){
            PostRepositoryIMPL repo = new PostRepositoryIMPL();
            Post post = new Post();
            post.setId(12112);
            repo.save(post);
            Post pos = new Post();
            pos.setId(12110);
            repo.save(pos);
            assertEquals(post,repo.findById(12112));
        }

        @Test
        void testThatCanFindAllPost(){
            PostRepositoryIMPL repo = new PostRepositoryIMPL();
            Post post = new Post();
            post.setId(12112);
            repo.save(post);
            Post pos = new Post();
            pos.setId(12110);
            repo.save(pos);
            List<Post> postu = new ArrayList<>();
            postu.add(post);
            postu.add(pos);
            assertEquals(postu,repo.findAll());
        }

    }


