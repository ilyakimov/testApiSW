package StarWars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
class OutDtoVehicles {
    private String name;
    private String model;
    private String vehicle_class;
    private String manufacturer;
    private String length;
    private String cost_in_credits;
    private String crew;
    private String passengers;
    private String max_atmosphering_speed;
    private String cargo_capacity;
    private String consumables;
    private ArrayList<String> films;
    private ArrayList<String> pilots;
    private String url;
    private String created;
    private String edited;
}
