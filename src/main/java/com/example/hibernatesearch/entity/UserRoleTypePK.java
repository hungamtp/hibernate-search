package com.example.hibernatesearch.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleTypePK implements Serializable {
    private static final long serialVersionUID = 1441630043873953283L;
    private Integer roleId;
    private Integer typeId;

}
