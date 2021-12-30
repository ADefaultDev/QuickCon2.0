package com.example.QuickBank.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Client")
public class Client {
    private Long[] values;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    @Column(name = "surname", length = 50, nullable = false)
    private String surname;
    @Column(name = "patronymic", length = 50, nullable = false)
    private String patronymic;
    @Column(name = "balance", nullable = false)
    private double balance;
    @Type(type = "com.example.QuickBank.LongArrayCustomType")
    public Long[] getValues(){
        return values;
    }
}
