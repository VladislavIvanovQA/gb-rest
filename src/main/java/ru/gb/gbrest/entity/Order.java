package ru.gb.gbrest.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    private Long id;
    private Buyer buyer;
    private BigDecimal sum;
    private Set<Product> products;
}
