package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgendaTest {

    @Test
    public void constructoriSiToStringTest(){

        Agenda agenda=new Agenda("1-1-2-07,08,2022,14,30-07,08,2022,15,30");
        assertEquals("Id: 1\n" +
                "Doctor Id: 1\n" +
                "Pacient Id: 2\n" +
                "Programare: Programare: Sunday, Aug 07, 2022 14:30:00 PM\n" +
                "Final: Sunday, Aug 07, 2022 15:30:00 PM\n" +
                "Durata: 60 minute\n",agenda.toString());

    }

    @Test
    public void constructoriEqualsTest(){

        Agenda agenda=new Agenda("1-1-2-07,08,2022,14,30-07,08,2022,15,30");
        Agenda agenda1=new Agenda("2-2-1-07,08,2022,14,30-07,08,2022,15,30");
        assertEquals(false,agenda.equals(agenda1));

    }

    @Test
    public void constructoriCompareToTest(){

        Agenda agenda=new Agenda("1-1-2-07,08,2022,14,30-07,08,2022,15,30");
        Agenda agenda1=new Agenda("2-2-1-07,08,2022,16,30-07,08,2022,17,30");
        assertEquals(-1,agenda.compareTo(agenda1));
    }

}