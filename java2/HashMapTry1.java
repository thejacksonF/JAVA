package JAVA.java2;


import java.util.HashMap;


public class HashMapTry1 {
    public void hashConValores(){

        HashMap<String, String> capitalCities = new HashMap<String, String>();
    
        // Add keys and values (Country, City)
        capitalCities.put("México", "Chihuahua");
        capitalCities.put("Estados Unidos", "Paso TX");
        capitalCities.put("Australia", "Sidney");
        capitalCities.put("Republica Checa", "Praga");
        capitalCities.put("México", "Ciudad de México");
        System.out.println(capitalCities);
    }


}
