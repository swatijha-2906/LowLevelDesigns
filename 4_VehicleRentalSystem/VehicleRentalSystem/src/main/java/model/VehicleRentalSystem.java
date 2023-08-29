package model;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    List<User> users= new ArrayList<>();
    List<Store> stores = new ArrayList<>();

    public void addUsers(User user)
    {
        users.add(user);
    }
    public void removeUsers(User user)
    {
        users.remove(user);
    }
    public void addStores(Store store)
    {
        stores.add(store);
    }
    public void removeStores(Store store)
    {
        stores.remove(store);
    }

    public List<Store> findStores(Location location)
    {
        List<Store> availableStores = new ArrayList<>();

        //add logic to filter out all the available stores present in the location
        availableStores.add(stores.get(0));
        availableStores.add(stores.get(1));

        return availableStores;
    }
}
