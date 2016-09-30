package bookmystay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "facility")
public class Facility{
	
	@Id
    @GeneratedValue
	private Integer id;
	private boolean microwave;
	
	@Column(name = "flat_tv")
	private boolean flatTV;
	
	@Column(name = "mini_fridge")
	private boolean miniFridge;
	private boolean balcony;
}
