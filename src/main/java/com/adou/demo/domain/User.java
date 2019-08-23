package com.adou.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class User implements Serializable {
 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, unique = true)
	private String userName;
	@Column(nullable = false)
	private String passWord;
	@Column(nullable = false)
    private int age;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = true)
	private String nickName;
	@Column(nullable = true)
	private String regTime;
	
	public User(){}
	
	public User(String userName, String passWord, int age, String email, String nickName, String regTime) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.age = age;
		this.email = email;
		this.nickName = nickName;
		this.regTime = regTime;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getRegTime() {
		return regTime;
	}
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", age=" + age + ", email=" + email + ", nickName=" + nickName + ", regTime=" + regTime + "]";
	}

}
