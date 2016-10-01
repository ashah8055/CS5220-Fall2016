package bookmystay.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class RoomStatus{
	
	@Id
    @GeneratedValue
	private Integer id;
	private Date date;
	private float rate;
	private String status; //open, closed, reserved
	
	@ManyToOne
	private Reservation reservation;
	
	@OneToOne
	private Room room;
}
