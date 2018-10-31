package net.kazanok.shop.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "client")
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@ToString
public class Client {

    @Id
    private Long id;

    @NotNull
    private String name;

    private String secondName;

    private String surname;

    @Email
    private String email;

	@ElementCollection(targetClass=String.class)
    private List<String> phoneNumbers;

    private String description;

    @OneToMany(targetEntity = Order.class, mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Order> orders;

    private Boolean isWholesale;

    private Boolean isInBlackList;
}
