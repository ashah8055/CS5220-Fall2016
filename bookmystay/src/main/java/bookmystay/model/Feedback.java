package bookmystay.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback{
	
	@Id
    @GeneratedValue
	private Integer id;
	private boolean type; //feedback:true,  reply:false	
	private String comment;
	private String Date;
	
	@ManyToOne
	private User user;

}
