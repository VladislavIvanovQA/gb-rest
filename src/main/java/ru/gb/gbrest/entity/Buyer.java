package ru.gb.gbrest.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Buyer {
    private Long id;
    private String name;
    private Set<Order> orders;
}
