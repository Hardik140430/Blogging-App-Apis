package com.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.blog.entities.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	
	@NotEmpty
	@Size(min = 4,message = "Username should be atleast of 4 charcters!")
	private String name;
	
	@Email(message = "Email address is not valid!")
	private String email;
	
	@NotEmpty
	@Size(min = 4,max = 10, message = "password should be between 4 to 10 character!")	
	private String password;
	
	@NotEmpty
	private String about;
	
//	private Set<CommentDto> comments = new HashSet<>();
	
	private Set<RoleDto> roles = new HashSet<>();
	

}
