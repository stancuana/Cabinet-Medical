package com.company.view;

import java.util.Scanner;

public class ViewLogin {

   private ViewLoginPacient viewPacientLogin;
   private ViewLoginDoctor viewLoginDoctor;
   private Scanner scanner;


    public ViewLogin(){
        this.viewLoginDoctor=new ViewLoginDoctor();
        this.viewPacientLogin=new ViewLoginPacient();
        this.scanner=new Scanner(System.in);
    }

    public void meniu(){

        System.out.println("Daca sunteti cadru medical apasati tasta 1");
        System.out.println("Daca sunteti pacient apasati tasta 2");
    }

    public void play(){

        boolean running=true;
        while (running==true){

            meniu();
            int alegere=Integer.parseInt(scanner.nextLine());
            switch (alegere){
                case 1:viewLoginDoctor.play();
                    break;
                case 2:viewPacientLogin.play();
                default:
                    meniu();
            }
        }
    }
}
