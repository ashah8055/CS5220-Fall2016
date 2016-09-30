package bookmystay.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment{
	
	@Id
    @GeneratedValue
	private Integer id;
	
	@OneToOne
	private Reservation reservation;
	
	@OneToOne
	private Creditcard card;
	
	private Date date;
}
