package com.example.demo.equation_log;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="equation_log")
public class EquationLog{

    @Id
    @Column(name="id")
    private int id;
    

    @Column(name="equation")
    private String equation;

    @Column(name="result")
    private String result;

    @Column(name="summit_date")
    private Timestamp summit_date;

    
}