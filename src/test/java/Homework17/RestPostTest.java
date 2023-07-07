package Homework17;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.Rest.PostController;
import ua.Rest.entities.Comment;
import ua.Rest.entities.Post;

import java.io.IOException;

public class RestPostTest {
    @Test
    public void getAllPostsTest() throws IOException {
        PostController postController= new PostController();
/*
        postController.getAllPosts();

        postController.getPostById(1);
        postController.getPostById(10);

        postController.createNewPostWithJson("Post title 2", "Body content");

 */
        Post post = new Post();
        post.setUserid(1);
        post.setTitle("GSON title");
        post.setBody("GSON Body");

        Post newPost = postController.createNewPostWithGson(post);
        Assert.assertEquals(post, newPost, "Post is not created");
        Assert.assertNotEquals(newPost.getId(), 0, "New ID is empty");


        Comment comment = new Comment();

    }
}
