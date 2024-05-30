package gb7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Cat cat = new Cat("Barsik", 3);
        String catAsJSON = objectMapper.writeValueAsString(cat);
        System.out.println(catAsJSON);

        String catFromJSON = String.valueOf(objectMapper.readValue(catAsJSON, Cat.class));
        System.out.println(catFromJSON);

        List<Cat> cats = new ArrayList<>(Arrays.asList(cat, new Cat("Tosha", 1)));
        String catsInJSON = objectMapper.writeValueAsString(cats);
        System.out.println(catsInJSON);

        List<Cat> catsFromJSON = objectMapper.readValue(catsInJSON, new TypeReference<List<Cat>>() {
        });
        System.out.println(catsFromJSON);

        String catAfterRefactoring ="{\"name\":\"Barsik\",\"age\":3,\"weight\":\"2\"}";
        //objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Cat catRefactoring = objectMapper.readValue(catAfterRefactoring, Cat.class);
        System.out.println(catRefactoring);

        String catAfterSecondRefactory = "{\"surname\":\"Barsik\",\"age\":3,\"weight\":\"2\"}";
        Cat catSecondRefactory = objectMapper.readValue(catAfterSecondRefactory, Cat.class);
        System.out.println(catSecondRefactory);

        objectMapper.configure(SerializationFeature.WRAP_ROOT_VALUE,true);
        String catRoot= objectMapper.writeValueAsString(cat);
        System.out.println(catRoot);

        Cat catwithEye= new Cat("Pushok", 6);
        catwithEye.setEye(new Eye("green"));

        String catWithEyeJSON = objectMapper.writeValueAsString(catwithEye);
        System.out.println(catWithEyeJSON);

    }
}
