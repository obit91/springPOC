package ohad.entitiyManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String first;

    private String last;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return first;
	}

	public void setName(String name) {
		this.first = name;
	}

	public String getEmail() {
		return last;
	}

	public void setEmail(String email) {
		this.last = email;
	}


}