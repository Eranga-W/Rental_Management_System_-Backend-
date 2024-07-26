package org.icet.crm.repository;

import org.icet.crm.entity.ItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemsEntity,Long> {
}
