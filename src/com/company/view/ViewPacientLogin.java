package com.company.view;

import com.company.controllers.ControllPacient;

import javax.swing.text.View;
import java.util.Scanner;

public class ViewPacientLogin {

    private ViewPacient viewPacient;
    private ControllPacient controllPacient;
    private Scanner scanner;

    public ViewPacientLogin(){
        viewPacient=new ViewPacient();
        controllPacient=new ControllPacient();
        scanner=new Scanner(System.in);
    }

    public void meniu(){
        System.out.println("Pentru a va loga apasati tasta 1");
        System.out.println("Pentru a va crea un cont apasati tasta 2");
    }

    public void play(){
        boolean running=true;

        while(running==true){

            meniu();

            int alegere=Integer.parseInt(scanner.nextLine());

            switch (alegere){
                case 1:logare();
                    break;

                default: meniu();
            }
        }
    }


    public void logare(){

        System.out.println("Introduceti email-ul: ");
        String email=scanner.nextLine();

        System.out.println("Introduceti parola: ");
        String password=scanner.nextLine();

        if(controllPacient.returnarePacientByEmail(email,password)!=null){
            System.out.println("V-ati logat cu succes");
            viewPacient.play();

        }else{

            System.out.println("Email sau parola incorecte");
        }
    }



}
