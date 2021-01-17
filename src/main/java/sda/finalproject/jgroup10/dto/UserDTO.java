package sda.finalproject.jgroup10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class UserDTO extends BasicEntityDTO {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("code")
    private String code;
    @JsonProperty("address")
    private String address;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("email")
    private String email;
    @JsonProperty("notes")
    private String notes;

    // Needed because the library Jackson requires a default constructor.
    public UserDTO() {
    }

    public UserDTO(Long id, String name, String code, String address, String phone, String email,
                   String notes, String status, Date createDate) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.notes = notes;
        this.setStatus(status);
        this.setCreateDate(createDate);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}