package com.example.hikmaproject.Models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class RotationMp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRotation;

    private BigDecimal dispoof;
}
