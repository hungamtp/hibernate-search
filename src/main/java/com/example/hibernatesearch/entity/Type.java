package com.example.hibernatesearch.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Type {
    @Id
    private Integer id;
    private String name;
}
