package model;

import java.io.Serializable;

public class User implements Serializable {
	private String id;
	private String name;
	private String pass;

	public User() {
		super();
	}

	public User(String id, String name, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPass() {
		return pass;
	}

}
