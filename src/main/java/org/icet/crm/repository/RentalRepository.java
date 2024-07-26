package org.icet.crm.repository;

import org.icet.crm.entity.RentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<RentalEntity,Long> {
}
