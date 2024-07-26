package org.icet.crm.service;

import org.icet.crm.dto.Items;

import java.util.List;

public interface ItemService {
    void addItem(Items items);

    List<Items> getAll();
}
