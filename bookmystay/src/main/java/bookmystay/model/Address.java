package bookmystay.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
public class Address implements Serializable{
    private static final long serialVersionID = 1L;

	private String addr1;
	private String addr2;
	private String city;
	private String State;
	private String zipcode;
	private String phone;
}
