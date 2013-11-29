package model.business.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;


/**
 * The persistent class for the plate database table.
 * 
 */
@Entity
@XmlRootElement
public class Plate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PLATE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PLATE_ID_GENERATOR")
	private int id;

	//bi-directional many-to-many association to Food
	@ManyToMany
	@JoinTable(
		name="plate_to_food"
		, joinColumns={
			@JoinColumn(name="plate_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="food_id")
			}
		)
	private List<Food> foods;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="fk_user")
	private User user;

	public Plate() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Food> getFoods() {
		return this.foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}