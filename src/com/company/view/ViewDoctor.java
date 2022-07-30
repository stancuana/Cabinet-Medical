package com.company.view;

import com.company.controllers.ControllAgenda;
import com.company.controllers.ControllDoctor;
import com.company.controllers.ControllPacient;

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
                case 1:
                    break;

                default: meniu();
            }
        }
    }

}
