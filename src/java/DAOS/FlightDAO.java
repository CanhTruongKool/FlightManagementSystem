/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Model.Flight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class FlightDAO {

    public ArrayList<Flight> flightList = new ArrayList();
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    // LocalDateTime dateTime = LocalDateTime.parse(str, formatter);

    public FlightDAO() {
        flightList.add(new Flight("FHM-A001", "TP Ho Chi Minh", "Ha Noi", LocalDateTime.parse("2023-08-20 10:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A002", "TP Ho Chi Minh", "Hue", LocalDateTime.parse("2023-08-20 10:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A003", "Da Nang", "Ha Noi", LocalDateTime.parse("2023-08-20 10:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A004", "Gia Lai", "TP Ho Chi Minh", LocalDateTime.parse("2023-08-20 10:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A005", "Hai Duong", "Can Tho", LocalDateTime.parse("2023-08-20 10:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A006", "Ha Noi", "Can Tho", LocalDateTime.parse("2023-08-20 10:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A007", "Da Nang", "Gia Lai", LocalDateTime.parse("2023-08-20 10:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A008", "Hue", "Hai Duong", LocalDateTime.parse("2023-08-20 10:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A009", "TP Ho Chi Minh", "Ha Noi", LocalDateTime.parse("2023-08-21 10:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A010", "TP Ho Chi Minh", "Ha Noi", LocalDateTime.parse("2023-08-20 16:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A011", "Hai Duong", "Can Tho", LocalDateTime.parse("2023-08-20 17:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A012", "Da Nang", "Gia Lai", LocalDateTime.parse("2023-08-21 10:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A013", "Hai Duong", "Can Tho", LocalDateTime.parse("2023-08-20 17:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A014", "Hai Duong", "Can Tho", LocalDateTime.parse("2023-08-20 17:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A015", "Hai Duong", "Can Tho", LocalDateTime.parse("2023-08-20 17:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A016", "Hai Duong", "Can Tho", LocalDateTime.parse("2023-08-20 17:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A017", "Hai Duong", "Can Tho", LocalDateTime.parse("2023-08-20 17:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A018", "Hai Duong", "Can Tho", LocalDateTime.parse("2023-08-20 17:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A019", "Hai Duong", "Can Tho", LocalDateTime.parse("2023-08-20 17:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A020", "Hai Duong", "Can Tho", LocalDateTime.parse("2023-08-20 17:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A021", "Hai Duong", "Can Tho", LocalDateTime.parse("2023-08-20 17:00", formatter), 0, 0));
        flightList.add(new Flight("FHM-A022", "Hai Duong", "Can Tho", LocalDateTime.parse("2023-08-20 17:00", formatter), 0, 0));
    }

    public ArrayList<Flight> searchFlight(String departure, String destination, String date) {
        ArrayList<Flight> resultList = new ArrayList();
        for (Flight f : flightList) {
            if (f.getDeparturePlace().equals(departure) && f.getDestination().equals(destination) && f.getDepartureDate().toString().equals(date)) {
                resultList.add(f);
            }
        }

        return resultList;
    }

    public ArrayList<Flight> getFlight(int start, int end) {
        ArrayList<Flight> resultList = new ArrayList();
        for (int i = start; i < end; i++) {
            resultList.add(flightList.get(i));
        }
        return resultList;
    }
    
    public ArrayList<Flight> getSearchFlight(String departure, String destination, String date,int start, int end) {
        ArrayList<Flight> resultList = new ArrayList();
        for (int i = start; i < end; i++) {
            resultList.add(searchFlight(departure, destination, date).get(i));
        }
        return resultList;
    }
}
