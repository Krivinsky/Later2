package ru.practicum.later2.item;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemDto {

    private Long id;

    private Long userId;

    private  String url;

    //private List<String> tags;
}
