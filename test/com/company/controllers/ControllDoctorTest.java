package com.company.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllDoctorTest {

    @Test
    public  void loadAfisareTest(){

        ControllDoctor controllDoctor=new ControllDoctor();
        controllDoctor.afisare();
    }

}