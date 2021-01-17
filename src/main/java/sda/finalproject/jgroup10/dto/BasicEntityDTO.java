package sda.finalproject.jgroup10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class BasicEntityDTO {

    private String status;

    @JsonProperty("create_date")
    private Date createDate;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
