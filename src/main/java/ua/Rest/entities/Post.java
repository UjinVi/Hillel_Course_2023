package ua.Rest.entities;

import java.util.Objects;

public class Post {
    private int id;
    private int Userid;

    private  String title;

    private  String body;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", Userid=" + Userid +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Userid == post.Userid && Objects.equals(title, post.title) && Objects.equals(body, post.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Userid, title, body);
    }
}
