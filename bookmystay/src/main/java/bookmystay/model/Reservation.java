package bookmystay.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation{

	@Id
    @GeneratedValue
	private Integer id;
	private Date checkin;
	private Date checkout;
	
	@Column(name = "adult_num")
	private Integer adultNum;
	
	@Column(name = "child_num")
	private Integer childNum;

    @ManyToOne
	private User user;
	
	@OneToMany(mappedBy="reservation")
	private List<RoomStatus> roomStatus;
	
	private boolean status; //0: cancelled 1: valid
    
	@OneToOne
    private Payment payment;

}
