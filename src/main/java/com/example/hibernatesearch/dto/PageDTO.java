package com.example.hibernatesearch.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PageDTO {
    private int size;
    private Object data;
}
