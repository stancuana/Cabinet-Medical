package com.company.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllPacientTest {

    @Test
    public  void loadAfisareTest(){

        ControllPacient controllPacient=new ControllPacient();
        controllPacient.afisare();
    }

}