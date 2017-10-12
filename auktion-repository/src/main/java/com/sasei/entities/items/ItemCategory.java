package com.sasei.entities.items;

import com.sasei.entities.resources.Resource;
import com.sasei.models.items.ItemType;

import javax.persistence.*;

@Entity
@Table(name = "item_categories")
public class ItemCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private ItemType itemType;
    @Column(name = "initial_cost")
    private Long initialCost;
    private Resource model;
    private Resource image;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInitialCost() {
        return initialCost;
    }

    public void setInitialCost(Long initialCost) {
        this.initialCost = initialCost;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Resource getModel() {
        return model;
    }

    public void setModel(Resource model) {
        this.model = model;
    }

    public Resource getImage() {
        return image;
    }

    public void setImage(Resource image) {
        this.image = image;
    }
}
