package cn.yinyao.entity;

import java.util.Date;

public class User {

	private int id;
	private String username;
	private String password;
	private String address;
	private Date createtime;
	private Date updatetime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", address=" + address
				+ ", createtime=" + createtime + ", updatetime=" + updatetime + ", getId()=" + getId()
				+ ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + ", getAddress()="
				+ getAddress() + ", getCreatetime()=" + getCreatetime() + ", getUpdatetime()=" + getUpdatetime()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
