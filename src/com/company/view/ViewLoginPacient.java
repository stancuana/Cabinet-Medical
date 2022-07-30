package com.company.view;

import com.company.controllers.ControllPacient;
import com.company.model.Doctor;
import com.company.model.Pacient;

import java.util.Scanner;

public class ViewLoginPacient {

    private ViewPacient viewPacient;
    private ControllPacient controllPacient;
    private Scanner scanner;

    public ViewLoginPacient(){
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
                case 2:creareCont();

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


    public void creareCont(){


        System.out.println("Introduceti numele dumneavoastra: ");
        String nume=scanner.nextLine();
        System.out.println("Introduceti prenumele dumneavoastra: ");
        String prenume=scanner.nextLine();
        System.out.println("Introduceti varsta dumneavoastra: ");
        int varsta=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti adresa de email: ");
        String email=scanner.nextLine();
        System.out.println("Introduceti parola: ");
        String password=scanner.nextLine();
        System.out.println("Introduceti afectiunea principala resimtita: ");
        String afectiune=scanner.nextLine();


        Pacient pacient=new Pacient(controllPacient.nextAvailableId(),nume,prenume,varsta,email, password,afectiune);
        controllPacient.add(pacient);

        System.out.println("Contul a fost creat cu succes! Bine ati venit!");
        System.out.println("\n");

        viewPacient.play();
    }


}
