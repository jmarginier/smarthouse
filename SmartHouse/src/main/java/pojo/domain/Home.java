package pojo.domain;

import static javax.persistence.CascadeType.ALL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

import pojo.pattern.Scenario;

/**
 * The persistent class for the home database table.
 * 
 */
@Entity
public class Home implements Serializable {
	//private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	private String name;

	@OneToMany(mappedBy = "home", cascade = ALL)
	private List<Area> areas = new ArrayList<Area>();

	@OneToMany(mappedBy = "home", cascade = ALL)
	private List<Scenario> scenarios = new ArrayList<Scenario>();

	public Home () {
	}

	public Home ( String _name ) {
		name = _name;
	}

	public Home ( int _id, String _name ) {
		id = _id;
		name = _name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Area> getAreas() {
		return this.areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	public List<Scenario> getScenarios() {
		return this.scenarios;
	}

	public void setScenarios(List<Scenario> scenarios) {
		this.scenarios = scenarios;
	}

}