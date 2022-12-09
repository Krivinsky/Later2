package ru.practicum.later2.item;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ItemRepositoryImpl implements ItemRepository {

    private final Map<Long, List<Item>> items = new HashMap<>();

    private Long generateId = 0L;

    private Long generateId() {
        return ++generateId;
    }

    @Override
    public List<Item> findByUserId(long userId) {
        return items.getOrDefault(userId, Collections.emptyList());
    }

    @Override
    public Item save(Item item) {
        List<Item> userItems = new ArrayList<>();
        item.setId(generateId());
        for (var pair: items.entrySet()) {
            Long key = pair.getKey();
            List<Item> value = pair.getValue();
            if (value == null) {
                value = new ArrayList<>();
            }
            value.add(item);
            userItems.addAll(value);
        }
        items.put(item.getUserId(), userItems);
        return item;
    }

    @Override
    public void deleteByUserIdAndItemId(long userId, long itemId) {
        if (items.containsKey(userId)) {
            List<Item> itemList = items.get(userId);
            itemList.removeIf(item -> item.getId().equals(itemId));
        }
    }
}
