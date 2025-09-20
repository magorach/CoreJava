package CoreJavaByDurgaSir.Video6;

import java.util.ArrayList;
import java.util.List;

final class Customer {

    public Customer(String name, List<String> skills) {
        this.name = name;
        this.skills = new ArrayList<>(skills); // ✅ defensive copy in constructor
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return new ArrayList<>(skills);
    }


     private final String name;
     private final List<String> skills;
}
