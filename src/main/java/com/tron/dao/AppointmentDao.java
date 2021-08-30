package com.tron.dao;

import java.util.List;
import com.tron.domain.Appointment;
import org.springframework.data.repository.CrudRepository;


public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();

}
