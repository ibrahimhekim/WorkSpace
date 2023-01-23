package HashMap;

import java.util.HashMap;

public class MainHashMap {
    public static void main(String[] args) {
        HashMap<String, String> country = new HashMap<>();  // map interface ile key,value kullanilir

        country.put("TR", "Suriye");
        country.put("TR", "Turkiye"); //set ettik replace de var
        country.put("GR", "Almanya");
        country.put("EN", "Ingiltere");
        country.put("IT", "Italya");
        country.put("NA", "Hollanda");

        System.out.println(country.get("TR"));
        System.out.println("-----------------");

        country.remove("IT");
        country.remove("NA", "Hollanda");
        System.out.println("keys : ");
        for (String countryKey : country.keySet()) {
            System.out.println(countryKey);
        }
        System.out.println("-----------------");
        System.out.println("values : ");
        for (String countryValues : country.values()) {
            System.out.println(countryValues);
        }
        System.out.println("-----------------");
        System.out.println("key lere gore value ler getirildi : ");
        for (String countryKey : country.keySet()) {
            System.out.println(country.get(countryKey));
        }
    }
}
