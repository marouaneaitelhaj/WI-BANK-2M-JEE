package com.bank.bank2mjee.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Client")
public final class Client extends Person{
    @Id
    @Column(name = "code")
    private String code;
    @Column(name = "address")
    private String address;
    public Client(String firstName, String lastName, LocalDate birthDate, String mobile, String code, String address) {
        super(firstName, lastName, birthDate, mobile);
        this.code = code;
        this.address = address;
    }

    public Client(String client) {
        this.code = client;
    }
}
