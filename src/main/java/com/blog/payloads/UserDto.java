package com.blog.payloads;


import java.util.HashSet;
import java.util.Set;

import com.blog.entities.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	
	@NotEmpty
	@Size(min = 3, max = 20, message ="min 3 and max 20 characters are allowed in username !!")
	private String name;
	

	@Email(message ="Invalid Emaill !!")
	@Pattern(regexp=".+@.+\\..+", message ="Invalid Emaill !!")
	private String email;
	
	@NotEmpty
	@Size(min = 3, message ="password must be of minimum 3 characters !!")
	private String password;
	
	@NotEmpty
	private String about;
	
	private Set<RoleDto> roles = new HashSet<>();
	
	
}
