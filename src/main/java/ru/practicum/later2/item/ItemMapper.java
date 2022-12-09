package ru.practicum.later2.item;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;

@Component
public class ItemMapper {

    public ItemDto toDto(Item item) {
        List<String> tags;
        return new ItemDto(
                item.getId(),
                item.getUserId(),
                item.getUrl()
        );
    }

    public Item toItem(ItemDto itemDto) {
        return new Item(
                itemDto.getId(),
                itemDto.getUserId(),
                itemDto.getUrl(),
                new HashSet<>()
        );
    }
}
