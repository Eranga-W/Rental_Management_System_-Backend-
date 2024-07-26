package org.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.icet.crm.dto.Items;
import org.icet.crm.dto.Rental;
import org.icet.crm.entity.ItemsEntity;
import org.icet.crm.entity.RentalEntity;
import org.icet.crm.repository.RentalRepository;
import org.icet.crm.service.RentalService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {
    final RentalRepository repository;

    @Override
    public void addRental(Rental rental) {
        RentalEntity rentalEntity = new ObjectMapper().convertValue(rental, RentalEntity.class);
        repository.save(rentalEntity);
    }

    @Override
    public List<Rental> getAll() {
        List<Rental> rentalList = new ArrayList<>();
        List<RentalEntity> allEntityList = repository.findAll();
        allEntityList.forEach(entity ->
                rentalList.add(new ObjectMapper().convertValue(entity, Rental.class))
        );
        return rentalList;
    }

    @Override
    public void deleteRentalById(Long id) {
        if (repository.existsById((id))){
            repository.deleteById(id);
        }
    }

    @Override
    public void updateRental(Rental rental) {
        if(repository.findById(rental.getId()).isPresent()){
            repository.save(new ObjectMapper().convertValue(rental, RentalEntity.class));
        }
    }
}
