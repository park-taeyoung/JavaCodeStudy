package ch14_collection.Member;

public class Member {
	private String usreid;
	private String passwd;
	private String name;
	private String tel;
	private String email;
	
	@Override
	// toString���� �������̵� �س����� ���߿� ����� �� �� ����.
	public String toString() {
		return "Member [usreid=" + usreid + ", passwd=" + passwd + ", name=" + name + ", tel=" + tel + ", email="
				+ email + "]";
	}
	
	public String getUsreid() {
		return usreid;
	}
	public void setUsreid(String usreid) {
		this.usreid = usreid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}