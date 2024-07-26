package org.icet.crm.controller;

import lombok.RequiredArgsConstructor;
import org.icet.crm.dto.Items;
import org.icet.crm.dto.Rental;
import org.icet.crm.service.ItemService;
import org.icet.crm.service.RentalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rental-controller")
@RequiredArgsConstructor
@CrossOrigin
public class RentalController {
    final RentalService service;
    @PostMapping("/add-rental")
    public void addRental(@RequestBody Rental rental){
        service.addRental(rental);
    }
    @GetMapping("/get-all")
    public List<Rental> getAll(){
        return service.getAll();
    }
    @DeleteMapping("/delete-rental/{id}")
    public void deleteRental(@PathVariable Long id){
        service.deleteRentalById(id);
    }
    @PostMapping("/update-rental")
    public void updateRental(@RequestBody Rental rental){
        service.updateRental(rental);
    }
}
