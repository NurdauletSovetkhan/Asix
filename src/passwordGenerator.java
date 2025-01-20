import java.util.Random;

public class passwordGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        int passwordLength = 12;
        StringBuilder password = new StringBuilder();

        for(int i = 0; i < passwordLength; i++) {
            int choice = rand.nextInt(4);
            if (choice == 0) {
                password.append((char) ('a' + rand.nextInt(26))); // Маленькие буквы
            } else if (choice == 1) {
                password.append((char) ('A' + rand.nextInt(26))); // Заглавные буквы
            } else if (choice == 2) {
                password.append(rand.nextInt(10)); }// Цифры
//            else {
//                password.append((char) (33 + rand.nextInt(15))); // Спец. символы
//            }
        }
        System.out.println("Сгенерированный пароль: " + password);
    }
}
