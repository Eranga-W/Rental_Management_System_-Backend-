package org.icet.crm.service;

import org.icet.crm.dto.Rental;

import java.util.List;

public interface RentalService  {
    List<Rental> getAll();

    void addRental(Rental rental);

    void deleteRentalById(Long id);

    void updateRental(Rental rental);
}
