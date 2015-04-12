package kr.ac.shinhancsp;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Member {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long key;
	
	@Persistent
	private String name;
	
	@Persistent
	private String socialNumber;
	
	@Persistent
	private String hakname;
	@Persistent
	private String tell;
	@Persistent
	private String add;
	@Persistent
	private String value;
	@Persistent
	private String gitid;
	

	public Member(String name, String socialNumber, String hakname, String tell, 
			String add, String value, String gitid) {
		super();
		this.name = name;
		this.socialNumber = socialNumber;
		this.hakname = hakname;
		this.tell = tell;
		this.add = add;
		this.value = value;
		this.gitid = gitid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSocialNumber() {
		return socialNumber;
	}


	public void setSocialNumber(String socialNumber) {
		this.socialNumber = socialNumber;
	}


	public String getHakname() {
		return hakname;
	}


	public void setHakname(String hakname) {
		this.hakname = hakname;
	}


	public String getTell() {
		return tell;
	}


	public void setTell(String tell) {
		this.tell = tell;
	}


	public String getAdd() {
		return add;
	}


	public void setAdd(String add) {
		this.add = add;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public String getGitid() {
		return gitid;
	}


	public void setGitid(String gitid) {
		this.gitid = gitid;
	}


	public Long getKey() {
		return key;
	}
}
