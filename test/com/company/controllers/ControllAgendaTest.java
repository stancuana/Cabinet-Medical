package com.company.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllAgendaTest {

    @Test
    public  void loadAfisareTest(){

        ControllAgenda controllAgenda=new ControllAgenda();
        controllAgenda.afisare();
    }

    @Test
    public  void agendaSortata(){

        ControllAgenda controllAgenda=new ControllAgenda();
        controllAgenda.sortareAgendaDupaProgramari();
        controllAgenda.afisare();
    }

}