//Leagan Dan-Adrian si Tablan Andrei-Razvan

package lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Produs apa = new Produs(1,"apa", "01/02/2022", "01/02/2050",2.3);
        Produs faina = new Produs(2,"faina", "06/07/2021", "01/02/2023",3.1);
        Produs ulei = new Produs(3,"ulei", "08/10/2021", "01/02/2022",4.1);
        Produs zahar = new Produs(4,"zahar", "04/03/2021", "01/02/2022",5.2);
        Produs telefon = new Produs(5,"telefon", "-", "-",1000.5);


        Basket Cos1 = new Basket();
        Basket Cos2 = new Basket();

        List<Produs> Raft;
        Raft=new ArrayList<>();

        Raft.add(apa);
        Raft.add(faina);
        Raft.add(zahar);
        Raft.add(ulei);
        Raft.add(telefon);


        Cos1.Add(apa);
        Cos1.Add(faina);
        Cos1.Add(telefon);
        Cos2.Add(ulei);

        Cos1.total();
        System.out.println(Cos1);
        Cos2.total();
        System.out.println(Cos2);


        System.out.println("Adaugati in cosul 2:");
            Scanner input = new Scanner(System.in);
            String produs = input.next();
            for (int j = 0; j < Raft.size(); j++) {
                if (Raft.get(j).getNume().equals(produs)) {
                   Cos2.Add(Raft.get(j));
                    System.out.println("Am adaugat in cosul 2");
                    System.out.println(Cos1);
                }
            }
        Cos2.total();
        System.out.println(Cos2);

        System.out.println("Stergeti din cosul 2:");
        Scanner input2 = new Scanner(System.in);
        String produs2 = input.next();
        for (int j = 0; j < Raft.size(); j++) {
            if (Raft.get(j).getNume().equals(produs2)) {
                Cos2.delete(produs2);
                System.out.println("Am sters din cosul 2");
                System.out.println(Cos2);
            }
        }
    }
}