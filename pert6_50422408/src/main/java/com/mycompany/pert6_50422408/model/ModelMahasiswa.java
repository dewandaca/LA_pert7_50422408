/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert6_50422408.model;

/**
 *
 * @author Acer
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity 
public class ModelMahasiswa {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String npm;
    private String nama;
    private int semester;
    private float ipk;
    
    public ModelMahasiswa(String npm, String nama, int semester, float ipk) {
        this.npm = npm;
        this.nama = nama;
        this.semester = semester;
        this.ipk = ipk;
    }
}