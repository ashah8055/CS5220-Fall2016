package bookmystay.model;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable{
    private static final long serialVersionID = 1L;
    
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "user_fname")
    private String userFname;

    @Column(name = "user_lname")
    private String userLname;
    
    private String email;
    private String password;

    @Column(name = "sec_question")
    private Integer secQuestion;
    private String answer;

    @Embedded
    private Address address;
    
    //one user can have multiple credit card
    @OneToMany(mappedBy="user")
    private List<Creditcard> card;
    
    //one user can have multiple reservation
    @OneToMany(mappedBy="user")
    private List<Reservation> reservation;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserFname() {
		return userFname;
	}

	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}

	public String getUserLname() {
		return userLname;
	}

	public void setUserLname(String userLname) {
		this.userLname = userLname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getSecQuestion() {
		return secQuestion;
	}

	public void setSecQuestion(Integer secQuestion) {
		this.secQuestion = secQuestion;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Creditcard> getCard() {
		return card;
	}

	public void setCard(List<Creditcard> card) {
		this.card = card;
	}

	public List<Reservation> getReservation() {
		return reservation;
	}
    
}
