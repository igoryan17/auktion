package com.sasei.repositories.resources;

import com.sasei.entities.resources.Resource;
import org.springframework.data.repository.CrudRepository;

public interface ResourceRepository extends CrudRepository<Resource, Long> {
}
