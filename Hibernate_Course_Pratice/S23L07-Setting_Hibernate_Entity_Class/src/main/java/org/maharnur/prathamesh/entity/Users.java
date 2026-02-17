package org.maharnur.prathamesh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="users")
@Table(name="users")
public class Users {
	
	@Id
	@Column(name="user_id")
	int userId;
	
	@Column(name="username")
	String username;
	
	@Column(name="password")
	String password;
	
	@Column(name="first_name")
	String firstname;
	
	@Column(name="last_name")
	String lastname;
}
