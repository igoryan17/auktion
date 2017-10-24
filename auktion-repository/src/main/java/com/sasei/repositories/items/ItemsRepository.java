package com.sasei.repositories.items;

import com.sasei.entities.items.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemsRepository extends CrudRepository<Item, Long> {
}
