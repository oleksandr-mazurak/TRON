package com.tron.service;

import java.util.List;
import com.tron.domain.Appointment;


public interface AppointmentService {
	Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);

    Appointment findOne(Long id);

}
