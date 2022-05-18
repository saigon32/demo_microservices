package demo.team.international;

import java.util.HashMap;
import java.util.Map;

public class DemoArrayMapTeam {


    public static void esValorUnico() {
        int arreglo[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3};
        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < arreglo.length; i++) {
            int conta = 1;
            map.put(arreglo[i],conta);
            if (arreglo[i] == 12){
                conta = conta + 1;
                map.put(arreglo[i],conta);
                System.out.println("sii 12, conta: "+conta);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        DemoArrayMapTeam.esValorUnico();
    }
}
