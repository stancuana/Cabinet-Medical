package com.company.controllers;

import com.company.model.Programare;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

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

    @Test
    public void afisareProgramariDisponibileTest(){
        ControllAgenda controllAgenda=new ControllAgenda();
        controllAgenda.afisareProgramariPeZi(LocalDate.ofEpochDay(07));
    }



}