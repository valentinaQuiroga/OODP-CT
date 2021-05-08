package com.company;

import depots.Depot;

public interface DepotDAO {

    public Depot saveDataDepot(Depot depot);
    public boolean saveTransactions();


}
