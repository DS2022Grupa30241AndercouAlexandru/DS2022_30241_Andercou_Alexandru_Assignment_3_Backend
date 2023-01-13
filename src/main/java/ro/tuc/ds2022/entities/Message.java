package ro.tuc.ds2022.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Message {
    @Id
    private Long id;


    public void setId(Long id) {
        this.id = id;
    }

    public UserAccount getFrom() {

        return from;
    }

    public void setFrom(UserAccount from) {
        this.from = from;
    }

    public UserAccount getTo() {
        return to;
    }

    public void setTo(UserAccount to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }
    @OneToOne(fetch= FetchType.EAGER)
    UserAccount from;
    @OneToOne(fetch= FetchType.EAGER)
    UserAccount to;
    String message;
    String description;
    String type;

}
