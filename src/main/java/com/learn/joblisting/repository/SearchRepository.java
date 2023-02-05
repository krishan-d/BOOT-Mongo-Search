package com.learn.joblisting.repository;

import com.learn.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
