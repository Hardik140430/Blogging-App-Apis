package com.blog.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entities.Comment;
import com.blog.entities.Post;
import com.blog.entities.User;
import com.blog.exceptions.ResourceNotFoundException;
import com.blog.payloads.CommentDto;
import com.blog.repositories.CommentRepo;
import com.blog.repositories.PostRepo;
import com.blog.repositories.UserRepo;
import com.blog.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private CommentRepo commentRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	

	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId,Integer userId) {
		
		Post post = this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post ", "post id", postId));
		
		User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User ","user id", userId));
		
		Comment comment = this.modelMapper.map(commentDto, Comment.class);
		
		comment.setPost(post);
		comment.setUser(user);
		
		Comment savedComment = this.commentRepo.save(comment);
		
		return this.modelMapper.map(savedComment,CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {
		
		Comment  com  = this.commentRepo.findById(commentId).orElseThrow(()-> new ResourceNotFoundException("Comment ","comment id", commentId));
		
		this.commentRepo.delete(com);
	}

}
