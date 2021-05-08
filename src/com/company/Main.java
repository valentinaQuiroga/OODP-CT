package com.company;

import depots.Depot;
import factory.DepotFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Depot d1 = DepotFactory.getDepot("a");
        Depot d2 = DepotFactory.getDepot("b");
        Depot d3 = DepotFactory.getDepot("c");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);




    }

  }
