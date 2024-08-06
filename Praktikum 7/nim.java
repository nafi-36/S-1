import java.util.Scanner;

public class nim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== NIM =====");
        System.out.print("Masukkan NIM : ");
        String nim = input.nextLine();
        System.out.println();
        for (int i = 0; i < nim.length(); i++) {
            char aChar = nim.charAt(i);
            switch (aChar) {
                case '1': one(); break;
                case '2': two(); break;
                case '3': three(); break;
                case '4': four(); break;
                case '5': five(); break;
                case '6': six(); break;
                case '7': seven(); break;
                case '8': eight(); break;
                case '9': nine(); break;
                case '0': zero(); break;
                default: break;
            }
            System.out.println("\n");
        }
    }

    static void one() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3 ||
                        i == 7 ||
                        i == 2 && j == 2 ||
                        i == 3 && j == 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void two() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 7 ||
                        j == 1 && i == 2 ||
                        i == 1 && j >= 2 && j <= 4 ||
                        j == 5 && i >= 2 && i <= 3 ||
                        i == 4 && j == 4 ||
                        i == 5 && j == 3 ||
                        i == 6 && j == 2) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void three() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 1 && (i == 2 || i == 6) ||
                        (i == 1 || i == 7) && j >= 2 && j <= 4 ||
                        i == 4 && j >= 3 && j <= 4 ||
                        j == 5 && ((i >= 2 && i <= 3) || (i >= 5 && i <= 6))) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void four() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 5 ||
                        i == 5 ||
                        i == 2 && j == 4 ||
                        i == 3 && j == 3 ||
                        i == 4 && j == 2) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void five() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 ||
                        j == 1 && i <= 4 ||
                        (i == 4 || i == 7) && j <= 4 ||
                        j == 5 && i >= 5 && i <= 6) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void six() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 || i == 7 || i == 4) && j >= 2 && j <= 4 ||
                        j == 1 && i >= 2 && i <= 6 ||
                        j == 5 && ((i >= 5 && i <= 6) || i == 2)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void seven() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 ||
                        j == 5 && i <= 3 ||
                        i == 4 && j == 4 ||
                        i == 5 && j == 3 ||
                        i == 6 && j == 2 ||
                        i == 7 && j == 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void eight() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 || i == 7 || i == 4) && j >= 2 && j <= 4 ||
                        j == 1 && ((i >= 2 && i <= 3) || (i >= 5 && i <= 6)) ||
                        j == 5 && ((i >= 2 && i <= 3) || (i >= 5 && i <= 6))) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void nine() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 || i == 7 || i == 4) && j >= 2 && j <= 4 ||
                        j == 5 && i >= 2 && i <= 6 ||
                        j == 1 && ((i >= 2 && i <= 3) || i == 6)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void zero() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 || i == 7) && j >= 2 && j <= 4 ||
                        (j == 1 || j == 5) && i >= 2 && i <= 6) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}