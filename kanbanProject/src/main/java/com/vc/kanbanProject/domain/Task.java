package com.vc.kanbanProject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {

    private String name;
    private String description;
    private String status;
    private String priority;
}
