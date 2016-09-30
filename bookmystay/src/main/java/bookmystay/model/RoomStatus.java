package bookmystay.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "room_status")
public class RoomStatus{
	
	private Date date;
	private float rate;
	private String status; //open, closed, reserved
	
	@ManyToOne
	private Room room;
}
