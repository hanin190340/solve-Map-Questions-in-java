import java.util.HashMap;
import java.util.Map;

class AppConfig {


    public  static Map<String, String> mergeConfigurations(Map<String, String> mainConfig, Map<String, String> updatedConfig) {
        Map<String, String> merged = new HashMap<>(mainConfig);
        merged.putAll(updatedConfig);
return merged;
    }

}




