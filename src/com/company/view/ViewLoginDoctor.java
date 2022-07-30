package com.company.view;

import com.company.controllers.ControllDoctor;
import com.company.model.Doctor;

import java.util.Scanner;

public class ViewLoginDoctor {

    private ViewDoctor viewDoctor;
    private ControllDoctor controllDoctor;
    private Scanner scanner;

    public ViewLoginDoctor(){
        this.viewDoctor=new ViewDoctor();
        this.controllDoctor=new ControllDoctor();
        this.scanner=new Scanner(System.in);
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

        if(controllDoctor.returnareMedicByEmail(email,password)!=null){
            System.out.println("V-ati logat cu succes");
            viewDoctor.play();

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
        System.out.println("Introduceti sectia in care veti lucra: ");
        String sectia=scanner.nextLine();
        System.out.println("Introduceti specializarea dumneavoastra: ");
        String specializarea=scanner.nextLine();


        Doctor doctor=new Doctor(controllDoctor.nextAvailableId(),nume,prenume,varsta,email, password, sectia, specializarea);
        controllDoctor.add(doctor);

        System.out.println("Contul a fost creat cu succes! Bine ati venit!");
        System.out.println("\n");

        viewDoctor.play();
    }
}


