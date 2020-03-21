package com.project.database.pojos;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="userdb")
public class Userp {
	@Id
  private int userid;
	
	@Override
	public String toString() {
		return "Userp [userid=" + userid + ", profileimage=" + profileimage + ", username=" + username + ", password="
				+ password + ", usertype=" + usertype + ", email=" + email + ", mobile=" + mobile + ", confirmed="
				+ confirmed + "]";
	}
	private String profileimage;
	
	private String username;
	private String password;
	  private String usertype;
	  private String email;
	  private int mobile;
	private String confirmed;
	
	public String getProfileimage() {
		return profileimage;
	}
	public void setProfileimage(String profileimage) {
		this.profileimage = profileimage;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}
	
	
	
	
}