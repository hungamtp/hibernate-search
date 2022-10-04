package com.example.hibernatesearch.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserRoleTypePK implements Serializable {
    private static final long serialVersionUID = 1441630043873953283L;
    private Integer roleId;
    private Integer typeId;

}
