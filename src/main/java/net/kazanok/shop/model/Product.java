package net.kazanok.shop.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@ToString
public class Product {

    @Id
    private Long id;

    private String name;

    @Column(unique = true)
    private String productCode;

    private Double price;
}
