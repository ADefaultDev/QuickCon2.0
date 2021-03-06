package com.example.QuickBank.entity;

import javax.persistence.*;

@Entity
@Table(name = "Bank_Account")
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "Full_Name", length = 128, nullable = false)
    private String fullName;
    @Column(name = "Balance", nullable = false)
    private double balance;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
