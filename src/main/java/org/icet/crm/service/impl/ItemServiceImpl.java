package org.icet.crm.service.impl;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.icet.crm.dto.Items;
import org.icet.crm.entity.ItemsEntity;
import org.icet.crm.repository.ItemRepository;
import org.icet.crm.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    final ItemRepository repository;

    @Override
    public void addItem(Items items) {
        ItemsEntity itemsEntity = new ObjectMapper().convertValue(items, ItemsEntity.class);
        repository.save(itemsEntity);
    }

    @Override
    public List<Items> getAll() {
        List<Items> itemsList = new ArrayList<>();
        List<ItemsEntity> allEntityList = repository.findAll();
        allEntityList.forEach(entity ->
            itemsList.add(new ObjectMapper().convertValue(entity, Items.class))
        );
        return itemsList;
    }

    @Override
    public void deleteItemById(Long id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
        }
    }
    @Override
    public void updateItem(Items items) {
        if(repository.findById(items.getId()).isPresent()){
            repository.save(new ObjectMapper().convertValue(items, ItemsEntity.class));
        }
    }
}
