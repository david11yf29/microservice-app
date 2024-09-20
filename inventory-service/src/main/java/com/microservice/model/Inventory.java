package com.microservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_invnetory")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private Integer quantity;
}
