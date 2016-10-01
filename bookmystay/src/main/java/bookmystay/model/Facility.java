package bookmystay.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "facility")
public class Facility implements Serializable{
    private static final long serialVersionID = 1L;
	
	@Id
    @GeneratedValue
	private Integer id;
	private boolean microwave;
	
	@Column(name = "flat_tv")
	private boolean flatTV;
	
	@Column(name = "mini_fridge")
	private boolean miniFridge;
	private boolean balcony;
	
	//many rooms have the same facility
	@OneToMany(mappedBy="facility")
	private List<Room> room;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isMicrowave() {
		return microwave;
	}

	public void setMicrowave(boolean microwave) {
		this.microwave = microwave;
	}

	public boolean isFlatTV() {
		return flatTV;
	}

	public void setFlatTV(boolean flatTV) {
		this.flatTV = flatTV;
	}

	public boolean isMiniFridge() {
		return miniFridge;
	}

	public void setMiniFridge(boolean miniFridge) {
		this.miniFridge = miniFridge;
	}

	public boolean isBalcony() {
		return balcony;
	}

	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}

	public List<Room> getRoom() {
		return room;
	}

	public void setRoom(List<Room> room) {
		this.room = room;
	}
	
}
