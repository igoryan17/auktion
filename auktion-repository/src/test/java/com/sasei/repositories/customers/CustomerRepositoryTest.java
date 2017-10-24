package com.sasei.repositories.customers;

import com.sasei.SpringDataJpaConfig;
import com.sasei.entities.customers.Customer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringDataJpaConfig.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CustomerRepositoryTest {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    EntityManager entityManager;

    private Customer testCustomer;

    @Before
    public void executeScript() {
        testCustomer = new Customer();
        testCustomer.setName("first");
        entityManager.persist(testCustomer);
        entityManager.flush();
    }

    @Test
    @Transactional
    public void findById() {
        Customer customer = customerRepository.findOne(testCustomer.getId());
        assertEquals("first", customer.getName());
    }
}
