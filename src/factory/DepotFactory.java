package factory;

import depots.Depot;
import depots.DepotA;
import depots.DepotB;
import depots.DepotC;

import java.util.Arrays;

public class DepotFactory {



    public static Depot getDepot(String type){

//        ID Generator 1 to 50
//        Integer[] arr = new Integer[50];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i+1;
//        }
//        System.out.println(Arrays.toString(arr));

        if(type.equalsIgnoreCase("a")){

            DepotA depotA = new DepotA(0, "A", 0, 0, 0, 0, 0,  0);
            return depotA;
        }
        else if(type.equalsIgnoreCase("b")){
            return new DepotB(0, "B", 0, 0, 0, 0, 0,  0);
        }
        else if(type.equalsIgnoreCase("c")){
            return new DepotC(0, "C", 0, 0, 0, 0, 0,  0);
        }
        return null;
    }
}
