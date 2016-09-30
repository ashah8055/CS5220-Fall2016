package bookmystay.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "credit_card_address")
@Embeddable
public class creditAddress {
    private String addr1;
	private String addr2;
	private String city;
	private String State;
	private String zipcode;
	
}
