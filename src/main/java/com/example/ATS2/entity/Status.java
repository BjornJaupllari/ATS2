package com.example.ATS2.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "statuses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Status implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

}
