package bookmystay.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "address")
@Embeddable
public class Address {

	private String addr1;
	private String addr2;
	private String city;
	private String State;
	private String zipcode;
	private String phone;
}
