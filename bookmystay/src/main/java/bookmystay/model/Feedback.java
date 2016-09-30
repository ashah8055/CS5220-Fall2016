package bookmystay.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback{
	
	private Integer id;
	private boolean type; //feedback:true,  reply:false	
	private String comment;
	private String Date;
	private List<Integer> Feedback;
	
	@ManyToOne
	private User user;

}
