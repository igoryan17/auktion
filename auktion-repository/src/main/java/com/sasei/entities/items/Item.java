package com.sasei.entities.items;

import com.sasei.entities.customers.Customer;
import com.sasei.models.items.ItemsStatus;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @MapsId
    private ItemCategory itemType;
    @Enumerated(EnumType.STRING)
    private ItemsStatus status;
    @Column(name = "date_of_the_auction")
    private Date dateOfTheAuction;
    private Customer owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ItemCategory getItemType() {
        return itemType;
    }

    public void setItemType(ItemCategory itemType) {
        this.itemType = itemType;
    }

    public ItemsStatus getStatus() {
        return status;
    }

    public void setStatus(ItemsStatus status) {
        this.status = status;
    }

    public Date getDateOfTheAuction() {
        return dateOfTheAuction;
    }

    public void setDateOfTheAuction(Date dateOfTheAuction) {
        this.dateOfTheAuction = dateOfTheAuction;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
}
