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
        System.out.println("Apasati tasta 2 pentru a vizualiza locurile libere din data aleasa");

    }

    public void play(){
        boolean running=true;

        while(running==true){

            meniu();

            int alegere=Integer.parseInt(scanner.nextLine());

            switch (alegere){
                case 1:afisareProgramariZi();
                    break;
                case 2:locuriLibereByZi();
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

    public void locuriLibereByZi(){

        System.out.println("Introduceti data pentru care doriti sa vizualizati locurile libere \n ");
        System.out.println("Anul: ");
        int an=Integer.parseInt(scanner.nextLine());
        System.out.println("Luna: ");
        int luna=Integer.parseInt(scanner.nextLine());
        System.out.println("Ziua: ");
        int ziua=Integer.parseInt(scanner.nextLine());

        LocalDate date=LocalDate.of(an,luna,ziua);

        ArrayList<Agenda> locuriLibere=controllAgenda.afisareLocuriLiberePeZi(date);
        System.out.println("Locurile libere in data de "+date+" sunt: ");

        for(int i=0; i<locuriLibere.size();i++){

            System.out.println(locuriLibere.get(i).toString());

        }



    }

}
