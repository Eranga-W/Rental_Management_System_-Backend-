package org.icet.crm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rental {
    private Long id;
    private String custName;
    private String itemName;
    private String rentalDate;
    private String returnDate;
    private String dueDate;
    private Double fine;
    private Double totalCost;
}