package sda.finalproject.jgroup10.model;

import org.hibernate.annotations.CreationTimestamp;
import sda.finalproject.jgroup10.model.status.EntityStatus;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class BasicEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private EntityStatus status;

    @CreationTimestamp
    @Column(name = "create_date")
    private Date createDate;

    public EntityStatus getStatus() {
        return status;
    }

    public void setStatus(EntityStatus status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
