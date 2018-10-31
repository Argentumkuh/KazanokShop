package net.kazanok.shop.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@ToString
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    @Id
    private Long id;

    private String name;

    @ToString.Exclude
    private String password;

    private UserRole userRole;
}
