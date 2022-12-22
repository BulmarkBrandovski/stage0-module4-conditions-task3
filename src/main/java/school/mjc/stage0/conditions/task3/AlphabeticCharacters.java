package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String ch = Character.toString(character);
        if (!ch.matches("[A-Za-z]")) {
            System.out.println("wrong alphabet!");
        } else if (ch.matches("[aeyuioAEYUIO]")) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
