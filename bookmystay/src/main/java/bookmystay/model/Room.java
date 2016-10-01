package bookmystay.model;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class Room{

	@Id
    @GeneratedValue
	private Integer id;
	private String type; //single, double, king
	
	@Column(name = "room_num")
	private String roomNo;
	
	@Column(name = "bed_num")
	private int bedNum; //added
	
	@Column(name = "bed_tyoe")
	private String bedType;  //added
	private boolean smoke;
	private Integer capacity; //for how many people
	
	@JoinTable(name = "room_images",
			joinColumns = @JoinColumn(name = "room_id"))
	@ElementCollection(targetClass=String.class)
	@Column(name = "image")
	@OrderColumn(name = "image_order")
	private List<String> images;
	
	//many rooms can have same facility
	@ManyToOne
	private Facility facility;
	
	@OneToMany(mappedBy="room")
	private List<RoomStatus> status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public int getBedNum() {
		return bedNum;
	}

	public void setBedNum(int bedNum) {
		this.bedNum = bedNum;
	}

	public String getBedType() {
		return bedType;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public boolean isSmoke() {
		return smoke;
	}

	public void setSmoke(boolean smoke) {
		this.smoke = smoke;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public Facility getFacility() {
		return facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}

	public List<RoomStatus> getStatus() {
		return status;
	}

	public void setStatus(List<RoomStatus> status) {
		this.status = status;
	}
	
}
