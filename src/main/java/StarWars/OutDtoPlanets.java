package StarWars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
class OutDtoPlanets {
   private String name;
   private String diameter;
   private String rotation_period;
   private String orbital_period;
   private String gravity;
   private String population;
   private String climate;
   private String terrain;
   private String surface_water;
   private ArrayList<String> residents;
   private ArrayList<String> films;
    private String url;
    private String created;
    private String edited;
}
