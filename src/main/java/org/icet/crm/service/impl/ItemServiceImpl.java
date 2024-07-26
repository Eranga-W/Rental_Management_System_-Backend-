package org.icet.crm.service.impl;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.icet.crm.dto.Items;
import org.icet.crm.entity.ItemsEntity;
import org.icet.crm.repository.ItemRepository;
import org.icet.crm.service.ItemService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    final ItemRepository repository;

    @Override
    public void addItem(Items items) {
        ItemsEntity itemsEntity = new ObjectMapper().convertValue(items, ItemsEntity.class);
        repository.save(itemsEntity);
    }
}
