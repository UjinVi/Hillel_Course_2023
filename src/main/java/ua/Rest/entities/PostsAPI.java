package ua.Rest.entities;

import com.google.gson.Gson;
import lombok.Data;
import okhttp3.*;

import java.io.IOException;

@Data
public class PostsAPI {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    private OkHttpClient client;

    public PostsAPI() {
        client = new OkHttpClient();
    }

    public Response getPosts() throws IOException {
        Request request = new Request.Builder()
                .url(BASE_URL + "/posts")
                .build();

        return client.newCall(request).execute();
    }

    public Response createPost(Post post) throws IOException {
        MediaType JSON = MediaType.get("application/json; charset=utf-8");
        String requestBody = new Gson().toJson(post);

        RequestBody body = RequestBody.create(requestBody, JSON);

        Request request = new Request.Builder()
                .url(BASE_URL + "/posts")
                .post(body)
                .build();

        return client.newCall(request).execute();
    }

    public Response updatePost(int postId, Post post) throws IOException {
        MediaType JSON = MediaType.get("application/json; charset=utf-8");
        String requestBody = new Gson().toJson(post);

        RequestBody body = RequestBody.create(requestBody, JSON);

        Request request = new Request.Builder()
                .url(BASE_URL + "/posts/" + postId)
                .put(body)
                .build();

        return client.newCall(request).execute();
    }

    public Response deletePost(int postId) throws IOException {
        Request request = new Request.Builder()
                .url(BASE_URL + "/posts/" + postId)
                .delete()
                .build();

        return client.newCall(request).execute();
    }

    public Response getPost(int postId) throws IOException {
        Request request = new Request.Builder()
                .url(BASE_URL + "/posts/" + postId)
                .build();

        return client.newCall(request).execute();
    }
}


