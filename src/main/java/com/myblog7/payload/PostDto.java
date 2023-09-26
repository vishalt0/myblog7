package com.myblog7.payload;

import lombok.Data;
import org.hibernate.annotations.BatchSize;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class PostDto {

    private long id;

@NotEmpty
@Size(min =2, message ="Post title should be at least 2 characters")
    private String title;

@NotEmpty
@Size(min = 4, message = "Post description should be at least 4 characters")
    private String description;

@NotEmpty
@Size(min = 2, message ="Post tittle should be at least 5 characters")
    private String content;
}
