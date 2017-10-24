package com.sasei.entities.items;

import com.sasei.entities.customers.Customer;

import javax.persistence.*;
import java.util.Date;

@Entity
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "current_cost")
    private Long currentCost;
    private Long bet;
    private Date time;
    @OneToOne
    private Customer performer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCurrentCost() {
        return currentCost;
    }

    public void setCurrentCost(Long currentCost) {
        this.currentCost = currentCost;
    }

    public Long getBet() {
        return bet;
    }

    public void setBet(Long bet) {
        this.bet = bet;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Customer getPerformer() {
        return performer;
    }

    public void setPerformer(Customer performer) {
        this.performer = performer;
    }
}
