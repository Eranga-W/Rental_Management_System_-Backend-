package org.icet.crm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Items {
    private Long id;
    private String name;
    private Double rentalPerDay;
    private Double finePerDay;
    private String availability;
}
