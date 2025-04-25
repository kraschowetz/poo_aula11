import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import model.Cachorro;
import model.RacaDeCachorro;

public class Main {
    public static void main(String args[]) {
        var listaDeCachorros = new ArrayList<Cachorro>();

        for(int i = 0; i < 8; i++) {
            listaDeCachorros.add(new Cachorro(RacaDeCachorro.VIRA_LATA, String.valueOf(Math.random()), (byte)(Math.random() * 20)));
        }

        System.out.println("#####");
        for(Cachorro c : listaDeCachorros) {
            System.out.println(c);
        }

        var hashset = new HashSet<Cachorro>();
        hashset.add(listaDeCachorros.get(0));


        System.err.println("###atividade");
        var dogmap = new HashMap<String, Cachorro>();
        for(Cachorro c : listaDeCachorros) {
            dogmap.put(c.getNome(), c);
        }

        for(Cachorro c : dogmap.values()) {
            System.err.println(c);
        }

        System.err.println(listaDeCachorros.get(0).hashCode());
    }
}