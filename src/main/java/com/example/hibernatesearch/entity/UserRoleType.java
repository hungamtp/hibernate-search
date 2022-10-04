package com.example.hibernatesearch.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleType {
    @EmbeddedId
    private UserRoleTypePK id;
    @ManyToOne
    private AUser user;
}
