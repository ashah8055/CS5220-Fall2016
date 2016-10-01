package bookmystay.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment implements Serializable{
    private static final long serialVersionID = 1L;
	
	@Id
    @GeneratedValue
	private Integer id;
	
	@OneToOne
	private Reservation reservation;
	
	@OneToOne
	private Creditcard card;
	
	private Date date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Creditcard getCard() {
		return card;
	}

	public void setCard(Creditcard card) {
		this.card = card;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
