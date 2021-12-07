package com.example.furama.repository.customer;

import com.example.furama.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, String> {
    @Override
    Page< Customer > findAll(Pageable pageable);
    // Search by name
    @Query(value = "select * \n" +
            " from customer c\n" +
            " where c.name like concat('%',:name, '%')", nativeQuery = true)
    Page< Customer > searchByName(@Param("name") String name, Pageable pageable);
    // Show list customer using service
//    @Query(value="", nativeQuery=true);
//    @Query(value = "select c.id, c.`name`, c.id_card, att.service_attach, att.cost, att.unit, cd.quantity\n" +
//            " from customer c\n" +
//            " join contract ct on ct.customer_id = c.id\n" +
//            " join contract_detail cd on cd.contract_id = ct.id\n" +
//            " join attach_service att on att.id = cd.attach_service_id", nativeQuery = true)
//    Page< CustomerUseServiceDTO > listCustomerUsingService(Pageable pageable);
}
