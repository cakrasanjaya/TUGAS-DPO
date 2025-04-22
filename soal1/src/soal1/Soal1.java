package soal1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        // Username dan password yang ditentukan
        try (Scanner scanner = new Scanner(System.in)) {
            // Username dan password yang ditentukan
            String correctUsername = "cakra";
            String correctPassword = "password123";
            
            int attempts = 0;
            boolean success = false;
            
            // Maksimal 3 kali percobaan
            while (attempts < 3) {
                System.out.print("Masukkan username: ");
                String inputUsername = scanner.nextLine();
                
                System.out.print("Masukkan password: ");
                String inputPassword = scanner.nextLine();
                
                if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
                    System.out.println("Selamat datang, " + inputUsername + "!");
                    success = true;
                    break;
                } else {
                    attempts++;
                    System.out.println("Username atau password salah. Percobaan ke-" + attempts);
                }
            }
            
            if (!success) {
                System.out.println("Akun diblokir!");
            }
        }
    }
}
