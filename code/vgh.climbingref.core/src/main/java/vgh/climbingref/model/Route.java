package vgh.climbingref.model;

import javax.persistence.Entity;

@Entity
public class Route {

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String id;
}
