package bookmystay.model;
import java.io.Serializable;

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
    
    @OneToMany(mappedBy="user")
    private Creditcard card;
}
