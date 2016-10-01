package bookmystay.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "credit_card")
public class  Creditcard {
	
	@Id
    @GeneratedValue
	private Integer id;
	private String name;

	@Column(name = "card_no")
	private Integer cardNo;

	@Column(name = "card_type")
	private String cardType;

    @Column(name = "sec_code")
	private Integer secCode; //security code
	
    @Embedded
	private creditAddress creAddr;
    
    @ManyToOne
	private User user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCardNo() {
		return cardNo;
	}

	public void setCardNo(Integer cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Integer getSecCode() {
		return secCode;
	}

	public void setSecCode(Integer secCode) {
		this.secCode = secCode;
	}

	public creditAddress getCreAddr() {
		return creAddr;
	}

	public void setCreAddr(creditAddress creAddr) {
		this.creAddr = creAddr;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
    

}
