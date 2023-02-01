package util;

import kitchens.Kitchen;
import menyu.Dessert;

import java.util.List;

public class DessertUtil {

    public static List<Dessert>  dessertList=List.of(new Dessert("Shekerbura","2$", Kitchen.Azerbaijani),
            new Dessert("Paxlava","3$", Kitchen.Azerbaijani),
            new Dessert("Teramisu","8$", Kitchen.Italian),
            new Dessert("Borek","3$", Kitchen.Turkish),
            new Dessert("Pishmaniye","6$", Kitchen.Turkish),
            new Dessert("Baklava","5$", Kitchen.Turkish),
            new Dessert("Bulocka s djemom","2$", Kitchen.Russian),
            new Dessert("Aloshe","5$", Kitchen.Italian)
    );
}
