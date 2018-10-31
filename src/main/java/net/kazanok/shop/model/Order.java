package net.kazanok.shop.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order")
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@ToString
public class Order {

    @Id
    private Long id;

    @ManyToOne
    private Client client;

    private Date orderDate;

    private DeliveryService deliveryService;

    private PaymentMethod paymentMethod;

    @ManyToMany
    @JoinColumn(name = "client_id")
    private List<Product> products;
}
