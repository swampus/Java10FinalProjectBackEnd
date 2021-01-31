package sda.finalproject.jgroup10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class UserDTO extends BasicEntityDTO {

    @JsonProperty("id")
    private Long id;
    @NotEmpty
    @JsonProperty("name")
    private String name;
    @Length(min = 11, max = 11, message = "LV personal codes should 11 length")
    @JsonProperty("code")
    private String code;
    @JsonProperty("address")
    private String address;
    @JsonProperty("phone")
    private String phone;
    @Email(message = "Email not correct")
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