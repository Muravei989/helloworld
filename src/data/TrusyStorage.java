package data;

import entity.Trusy;

import java.util.ArrayList;
import java.util.List;


public class TrusyStorage {
    private final List<Trusy> trusies = new ArrayList<>();

    public TrusyStorage() {
        trusies.add(new Trusy("red", 150));
        trusies.add(new Trusy("dark blue",200));
    }

    public int getTrusyQuantity(){
        return trusies.size();
    }

    public void addTrucyToTheStorage(Trusy trusy){
        trusies.add(trusy);
    }
}
