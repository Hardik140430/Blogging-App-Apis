package com.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	
	private int categoryId;
	
	@NotBlank
	@Size(min = 4,max = 20,message = "title should be between 3 to 20 characters!!")
	private String categoryTitle;
	
	@NotBlank
	@Size(min = 10,max = 500,message = "Description should be between 10 to 500 chracters")
	private String categoryDescription;
	

}
