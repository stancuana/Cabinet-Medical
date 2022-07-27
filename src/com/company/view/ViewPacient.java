package com.company.view;

import com.company.controllers.ControllAgenda;
import com.company.controllers.ControllDoctor;
import com.company.controllers.ControllPacient;
import com.company.model.Agenda;
import com.company.model.Programare;

import java.util.Scanner;

public class ViewPacient {

    private ControllDoctor controllDoctor;
    private ControllAgenda controllAgenda;
    private ControllPacient controllPacient;
    private Scanner scanner;

    public ViewPacient(){
        controllDoctor=new ControllDoctor();
        controllAgenda=new ControllAgenda();
        controllPacient=new ControllPacient();
        scanner=new Scanner(System.in);
    }

    public void meniu(){
        System.out.println("Pentru a crea o noua programare apasati tasta 1");
        System.out.println("Pentru a modifica o programare apasati tasta 2");
        System.out.println("Pentru a anula o programare apasati tasta 3");
        System.out.println("Pentru a vizualiza o programare apasati tasta 4");
    }

    public void play(){
        boolean running=true;

        while(running==true){

            meniu();

            int alegere=Integer.parseInt(scanner.nextLine());

            switch (alegere){
                case 1:programareNoua();
                    break;

                default: meniu();
            }
        }
    }

    public void programareNoua(){

        System.out.println("Introduceti numele dumneavoastra:");
        String numePacient=scanner.nextLine();
        System.out.println("Introduceti numele medicului la care doriti sa realizati programarea: ");
        String numeDoctor=scanner.nextLine();
        System.out.println("Introduceti data si ora la care doriti programarea");
        String dataInceput=scanner.nextLine();
        String dataSfarit=scanner.nextLine();

        Programare programare=new Programare(dataInceput,dataSfarit);

        if(controllAgenda.verificareSuprapunereProgramari(programare)==true){
            controllAgenda.add(programare);
            System.out.println("Programarea s-a realizat cu succes");
        }else{
            System.out.println("Nu se poate realiza programarea in intervalul de timp selectat");
        }

        Agenda agenda=new Agenda(controllAgenda.nextAvailableId(),controllDoctor.returnIdDoctorByName(numeDoctor),controllPacient.nextAvailableId());
    }

}
