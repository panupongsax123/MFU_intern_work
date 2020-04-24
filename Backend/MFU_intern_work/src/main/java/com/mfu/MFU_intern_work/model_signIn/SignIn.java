package com.mfu.MFU_intern_work.model_signIn;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="register")

public class SignIn implements Serializable{

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		
		@Column(name="username")
        private String username;
		
		@Column(name="password")
        private String password;
		
		@Column(name="nickname")
        private String nickname;
		
		@Column(name="email")
        private String email;
		
		 public SignIn() {
		    }

		public SignIn(String username, String password, String nickname, String email) {
			super();
			this.username = username;
			this.password = password;
			this.nickname = nickname;
			this.email = email;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getNickname() {
			return nickname;
		}

		public void setNickname(String nickname) {
			this.nickname = nickname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		  
	
}




