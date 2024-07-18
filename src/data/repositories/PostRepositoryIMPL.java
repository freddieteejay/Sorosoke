package data.repositories;

import data.models.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryIMPL implements PostRepository {
    List<Post> posts = new ArrayList<>();
    @Override
    public Post findById(int id) {
        Post p = null;
        for (Post post : posts) {
            if (post.getId() == id) {
                p = post;
            }
        }
        return p;
    }

    @Override
    public List<Post> findAll() {
        return posts;
    }

    @Override
    public long count() {
        return posts.size();
    }

    @Override
    public void deleteAll() {
        posts.clear();

    }

    @Override
    public void deleteById(int id) {
        posts.remove(findById(id));
    }

    @Override
    public Post save(Post post) {
          posts.add(post);
          return post;
    }

    public boolean isEmpty(){
        if(posts.size() == 0) return true;
        else return false;
    }


}
