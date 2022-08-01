package com.company.view;

import com.company.controllers.ControllAgenda;
import com.company.controllers.ControllDoctor;
import com.company.controllers.ControllPacient;
import com.company.model.Agenda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewDoctor {

    private ControllDoctor controllDoctor;
    private ControllAgenda controllAgenda;
    private ControllPacient controllPacient;
    private Scanner scanner;

    public ViewDoctor(){
        controllDoctor=new ControllDoctor();
        controllAgenda=new ControllAgenda();
        controllPacient=new ControllPacient();
        scanner=new Scanner(System.in);
    }

    public void meniu(){

        System.out.println("Apasati tasta 1 pentru a vizualiza programarile dumneavoastra");


    }

    public void play(){
        boolean running=true;

        while(running==true){

            meniu();

            int alegere=Integer.parseInt(scanner.nextLine());

            switch (alegere){
                case 1:afisareProgramariZi();
                    break;

                default: meniu();
            }
        }
    }

    public void afisareProgramariZi(){

        System.out.println("Introduceti data pentru a vizualiza programarile: \n");

        System.out.println("Anul: ");
        int an=Integer.parseInt(scanner.nextLine());
        System.out.println("Luna: ");
        int luna=Integer.parseInt(scanner.nextLine());
        System.out.println("Ziua: ");
        int ziua=Integer.parseInt(scanner.nextLine());


        LocalDate date=LocalDate.of(an,luna,ziua);

        System.out.println("Introduceti numele dumneavoastra");
        String nume=scanner.nextLine();

        System.out.println("Programarile din data "+date+" sunt: ");

        ArrayList<Agenda> programariZi=controllAgenda.programareZi(controllDoctor.returnIdDoctorByName(nume), date);

        for(int i=0; i<programariZi.size();i++){

            System.out.println(programariZi.get(i).toString());
        }
    }

}
