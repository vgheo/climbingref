package vgh.climbingref.model;

import java.util.ArrayList;
import java.util.List;

public class Competition {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public List<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

	public List<Competitor> getCompetitors() {
		return competitors;
	}

	public void setCompetitors(List<Competitor> competitors) {
		this.competitors = competitors;
	}

	public enum State {
		PREPARING,
		ONGOING,
		FINISHED
	}

	private String name;
	
	private State state=State.PREPARING;
	
	private List<Route> routes = new ArrayList<>();
	
	private List<Competitor> competitors = new ArrayList<>();
	
}

