package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

@Data
@Entity(name = "entity_one")
public class EntityOne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "col_1")
    private String fieldOne;

    @Column(name = "col_2")
    private Integer fieldTwo;

    @CreatedDate
    @Column(name = "col_3")
    private Date fieldThree;
}
