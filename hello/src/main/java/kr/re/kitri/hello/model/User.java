package kr.re.kitri.hello.model;


//Immutable Value Object
public class User {

	private final long userId;
	private final String name;
	private final String email;
	private final String hpNum;
	
	
	public User(long userId, String name, String email, String hpNum) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.hpNum = hpNum;
	}


	public long getUserId() {
		return userId;
	}


	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public String getHpNum() {
		return hpNum;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", hpNum=" + hpNum + "]";
	}

	
	
}
