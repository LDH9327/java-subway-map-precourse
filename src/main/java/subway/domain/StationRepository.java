package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class StationRepository {
    private static final List<Station> stations = new ArrayList<>();

    public static List<Station> stations() {
        return Collections.unmodifiableList(stations);
    }

    public static void addStation(Station station) {
        stations.add(station);
    }

    public static boolean deleteStation(String name) {
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }

    public static Station getStation(String name) {
        int index = 0;
        for(int i=0; i<stations.size(); i++) {
            if(stations.get(i).getName().equals(name)) {
                index = i;
            }
        }
        return stations.get(index);
    }

    public static List<Station> getStations() {
        return stations;
    }


}
