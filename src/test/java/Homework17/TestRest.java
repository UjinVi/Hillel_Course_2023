package Homework17;

import com.google.gson.Gson;
import okhttp3.Response;
import org.testng.annotations.Test;
import ua.Rest.entities.Post;
import ua.Rest.entities.PostsAPI;
import java.io.IOException;
import static org.testng.AssertJUnit.assertEquals;

public class TestRest {


    @Test
    public void testCreatePost() throws IOException {
        Post post = new Post();
        post.setTitle("New Post");
        post.setBody("This is a new post");

        PostsAPI postsAPI = new PostsAPI();

        Response response = postsAPI.createPost(post);
        assertEquals(response.code(), 201);

    }

    @Test
    public void testUpdatePost() throws IOException {
        int postId = 1;

        Post post = new Post();
        post.setTitle("Updated Post");
        post.setBody("This post has been updated");
        PostsAPI postsAPI = new PostsAPI();

        Response response = postsAPI.updatePost(postId, post);
        assertEquals(response.code(), 200);

    }

    @Test
    public void testDeletePost() throws IOException {
        int postId = 1;
        PostsAPI postsAPI = new PostsAPI();

        Response response = postsAPI.deletePost(postId);
        assertEquals(response.code(), 200);

    }

    @Test
    public void testGet() throws IOException {
        Post post = new Post();
        post.setTitle("New Post");
        post.setBody("This is a new post");
        PostsAPI postsAPI = new PostsAPI();

        Response response = postsAPI.createPost(post);
        assertEquals(response.code(), 201);

        int postId = Integer.parseInt(response.header("id"));
        Response getResponse = postsAPI.getPost(postId);
        assertEquals(getResponse.code(), 200);

        Gson gson = new Gson();
        Post createdPost = gson.fromJson(getResponse.body().string(), Post.class);
        assertEquals(createdPost.getTitle(), post.getTitle());
        assertEquals(createdPost.getBody(), post.getBody());

    }

}
