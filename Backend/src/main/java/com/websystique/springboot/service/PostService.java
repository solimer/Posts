package com.websystique.springboot.service;

import com.websystique.springboot.model.Post;

import java.util.List;

public interface PostService {
	List<Post> getAllPosts();

	List<Post> getUserPosts(Integer userId);

	void addPost(Post post);
}