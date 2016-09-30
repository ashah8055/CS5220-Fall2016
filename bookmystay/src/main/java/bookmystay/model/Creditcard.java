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

}
