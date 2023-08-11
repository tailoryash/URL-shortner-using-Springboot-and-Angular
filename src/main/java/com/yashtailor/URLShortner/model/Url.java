package com.yashtailor.URLShortner.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Url {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String shorturl;

    private String originalurl;

}
