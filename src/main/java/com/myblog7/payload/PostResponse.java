package com.myblog7.payload;

import com.myblog7.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PostResponse {

    private List<PostDto> postDto;
    private int pageNo;

    private int pageSize;

    private long totalElements;

    private int totalPages;

    private boolean Last;


}
