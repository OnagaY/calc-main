package com.example.demo.personal_information;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="personal_infomation")
public class PersonalInformation{

    @Id
    @Column(name="id")
    private int id;


 
    @Column(name="name")
    private String name;

    @Column(name="phone_number")
    private int phone_number;

    @Column(name="email")
    private String email;

    @Column(name="equation_id")
    private int equation_id;
}