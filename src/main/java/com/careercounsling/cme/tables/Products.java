package com.careercounsling.cme.tables;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="products")
public class Products {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

   @Column
   private String name;
    @Column
    private BigDecimal price;
    @Column
    private int quantity;
    @Column
    private String description;
    @Column
    private String photo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
