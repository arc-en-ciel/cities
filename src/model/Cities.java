package model;

import java.util.HashSet;
import java.util.Set;


public class Cities {
    Set<String> cities = new HashSet<>();

    public void setCity(String city) {
        cities.add(city);
    }

    public String getCity(char lastLetter) {
        String answer = "quit";
        for (String city : cities) {
            if (lastLetter == city.toLowerCase().charAt(0)) {
                answer = city;
            }
        }
        return answer;
    }

    public void setCompLexicon() {
        cities.add("Москва");
        cities.add("Амстердам");
        cities.add("Анапа");
        cities.add("Анталия");
        cities.add("Астана");
        cities.add("Багдад");
        cities.add("Баку");
        cities.add("Валенсия");
        cities.add("Варна");
        cities.add("Даллас");
        cities.add("Гавана");
        cities.add("Габороне");
        cities.add("Гамбург");
        cities.add("Екатеринбург");
        cities.add("Ереван");
        cities.add("Якутск");
        cities.add("Ярославль");
        cities.add("Юма");
        cities.add("Зальцбург");
        cities.add("Ижевск");
        cities.add("Йоханнесбург");
        cities.add("Казань");
        cities.add("Ливерпуль");
        cities.add("Майами");
        cities.add("Магадан");
        cities.add("Одесса");
        cities.add("Нальчик");
        cities.add("Рим");
        cities.add("Самара");
        cities.add("Ставрополь");
        cities.add("Ялта");
        cities.add("Париж");
    }
}
