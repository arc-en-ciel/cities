package model;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Game {

    String cityWordOfPlayer = "";
    String cityWordOfComputer;
    Cities compLexicon = new Cities();
    Set<String> set = new HashSet<>();


    public void start() {
        compLexicon.setCompLexicon();
        System.out.println("Давай поиграем в Города! Я называю город,а тебе нужно придумать свое название, " + "\n" +
                "которое бы начиналось на последнюю букву моего. И так по очереди, пока ты не напишешь слово quit!" + "\n" +
                "Начали!  ");
        cityWordOfComputer = compLexicon.getCity('м');
        set.add(cityWordOfComputer);
        System.out.println("Первый город " + cityWordOfComputer);
        label:
        while (!(cityWordOfPlayer.equalsIgnoreCase("quit"))) {
            do {
                System.out.println("Ваша очередь");
                Scanner scanner = new Scanner(System.in);
                cityWordOfPlayer = scanner.nextLine();

                if (cityWordOfPlayer.equalsIgnoreCase("quit")) {
                    continue label;


                }
            }
            while (cityWordOfComputer.charAt(cityWordOfComputer.length() - 1) != cityWordOfPlayer.toLowerCase().charAt(0));
            set.add(cityWordOfPlayer);
            cityWordOfComputer = compLexicon.getCity(cityWordOfPlayer.charAt(cityWordOfPlayer.length() - 1));
            System.out.println(cityWordOfComputer + "");
            if (cityWordOfComputer.equalsIgnoreCase("quit")) {
                break;
            }
            set.add(cityWordOfComputer);
        }
        System.out.println(set);
    }
}
