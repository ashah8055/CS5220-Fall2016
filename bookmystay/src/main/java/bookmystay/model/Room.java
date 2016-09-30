package bookmystay.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class Room{
	

	private Integer id;
	private String type;
	private String roomNo;
	private int bedNum; //added
	private String bedType;  //added
	private boolean smoke;
	private Integer capacity; //for how many people
	private List<String> images;
	
	private Facility facility;
	
	@OneToMany(mappedBy="room")
	private RoomStatus status;

	@ManyToOne
	private Reservation reservation;
}
