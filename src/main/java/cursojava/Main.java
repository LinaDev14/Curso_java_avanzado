package cursojava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Barcelona");
        cities.add("Calarca");
        cities.add("Bogotá");
        cities.add("Medellin");
        cities.add("Cali");
        cities.add("Armenia");

        cities.forEach(System.out::println);

        // Simple example of parallel pipeLine
        cities.stream()
                .parallel()
                        .forEach(System.out::println);

        // Referencia de metodo
        cities.forEach(Main::printCity);

        // filter
        cities.stream()
                .filter(city -> city.startsWith("A"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void printCity(String city) {
        System.out.println(city);
    }
}
