package com.tron.dao;

import java.util.List;
import com.tron.domain.Recipient;
import org.springframework.data.repository.CrudRepository;


public interface RecipientDao extends CrudRepository<Recipient, Long> {
    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}
