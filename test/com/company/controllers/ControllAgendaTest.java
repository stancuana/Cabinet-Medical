package com.company.controllers;

import com.company.model.Agenda;
import com.company.model.Programare;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

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

        ArrayList<Agenda> schedule=controllAgenda.returnProgramariById(1);

        for(int i=0; i<schedule.size();i++){

            System.out.println(schedule.get(i).toString());
        }
    }

    @Test
    public void afisareProgramariZiTest(){

        ControllAgenda controllAgenda=new ControllAgenda();

        ArrayList<Agenda> programariZi=controllAgenda.programareZi(3, LocalDate.of(2022,8,1));

        for(int i=0; i<programariZi.size();i++){

            System.out.println(programariZi.get(i).toString());
        }
    }





}