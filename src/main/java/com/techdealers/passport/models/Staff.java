package com.techdealers.passport.models;

import com.techdealers.passport.utils.PasswordConverter;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.annotations.ColumnTransformer;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Date;

@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message="Please enter your email address.")
    @Email(message="Please enter a valid email address.")
    @Column(unique = true)
    private String email;


    @ColumnTransformer(
            read = "password_decrypt(password)",
            write = "password_encrypt(?)"
    )
    @Convert(converter = PasswordConverter.class)
    private String password;

    @Column
    @CreatedDate
    private Date created;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public Date getCreated() {
        return created;
    }
}
