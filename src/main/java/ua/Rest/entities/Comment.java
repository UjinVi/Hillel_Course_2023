package ua.Rest.entities;

import lombok.*;

@Data
public class Comment {

    private Integer id;
    private Integer postId;
    private String name;
    private String email;

}
