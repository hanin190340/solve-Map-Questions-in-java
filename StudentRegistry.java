import java.util.HashMap;
import java.util.Map;

class StudentRegistry {
    public class Main {
        public static void main(String[] args) {
            Map<String, String> mainConfig = Map.of("url", "localhost", "port", "7080");
            Map<String, String> updatedConfig = Map.of("port", "8080");

            System.out.println(AppConfig.mergeConfigurations(mainConfig, updatedConfig));
        }
    }

    public Map<String, Integer> invertMap(Map<Integer, String> studentIdToName) {
        Map<String, Integer> nameToStudentId = new HashMap<>();
        for (Map.Entry<Integer, String> newMap : studentIdToName.entrySet()) {

            nameToStudentId.put(newMap.getValue(), newMap.getKey());

        }
        return nameToStudentId;
    }

}



