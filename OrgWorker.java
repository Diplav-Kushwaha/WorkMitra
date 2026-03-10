package com.NinJ.WorkMitra.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
public class OrgWorker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Pattern(regexp = "^[6-9][0-9]{9}$", message = "Invalid phone number")
    private String phoneNumber;

    @NotBlank(message = "Aadhar number is required")
    @Pattern(regexp = "^[0-9]{12}$", message = "Aadhar number must be 12 digits")
    private String aadharNumber;

    @NotBlank(message = "Address cannot be empty")
    private String address;

    @NotBlank(message = "Category is required")
    private String category;

    @NotBlank(message = "Skills cannot be empty")
    private String skills;
}
