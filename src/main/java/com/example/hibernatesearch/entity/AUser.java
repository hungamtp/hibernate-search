package com.example.hibernatesearch.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AUser {
    @Id
    private Integer id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER , mappedBy = "user")
    private List<UserRoleType> userRoleTypes;
}
