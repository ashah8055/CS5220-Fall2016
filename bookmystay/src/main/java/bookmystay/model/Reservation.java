package bookmystay.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Reservation{

	private Integer id; 
	private Date checkin;
	private Date checkout;
	@Column(name = "adult_num")
	private Integer adultNum;
	@Column(name = "child_num")
	private Integer childNum;

    @OneToOne
	private User user;
	
	@OneToMany(mappedBy="reservation")
	private List<Room> room;
	
	private boolean status; //0: cancelled 1: valid
    
	@OneToOne
    private Payment payment;

}
