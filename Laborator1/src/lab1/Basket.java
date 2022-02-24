package lab1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Produs> Cos;

    public Basket(){
        this.Cos=new ArrayList<>();
    }
    public void Add(Produs X){

        Cos.add(X);
    }
    public void delete(String produs2){
        for (int i = 0; i < Cos.size(); i++) {
            if(Cos.get(i).getNume() == produs2)
                Cos.remove(Cos.get(i));
        }
    }

    public void total() {
        double suma = 0;
        for (int i = 0; i < Cos.size(); i++) {
        suma+=Cos.get(i).getPret();
        }
        System.out.println("Suma totala din cos: " + suma);

    }

    @Override
    public String toString() {
        return "Basket{" +
                "Cos=" + Cos +
                '}';
    }
}