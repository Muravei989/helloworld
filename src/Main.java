import data.TrusyStorage;
import entity.Trusy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final TrusyStorage storage = new TrusyStorage();
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Oho,ebat,Mihalych,draste");
        System.out.println("On the storage now " + storage.getTrusyQuantity() + " trusikov");
        System.out.println("Input pantsu color");
        String color = reader.readLine();
        System.out.println("Input huy v stakane");
        String price = reader.readLine();
        int realPrice = Integer.parseInt(price);
        storage.addTrucyToTheStorage(new Trusy(color, realPrice));
        System.out.println(storage.getTrusyQuantity());
    }
}
