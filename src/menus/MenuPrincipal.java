package menus;

import java.io.IOException;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        int opcao;

        do {
            menu.mostrarMenu();
            while (!scanner.hasNextInt()){
                System.out.println("Insira um número inteiro válido.");
                scanner.next();
                }
                opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    SubMenu1 submenu1 = new SubMenu1();
                    submenu1.mostrarSubMenu();
                    break;
                case 2:
                    SubMenu2 submenu2 = new SubMenu2();
                    submenu2.mostrarSubMenu();
                    break;
                case 3:
                    SubMenu3 submenu3 = new SubMenu3();
                    submenu3.mostrarSubMenu();
                    break;
                case 4:
                    SubMenu4 submenu4 = new SubMenu4();
                    submenu4.mostrarSubMenu();
                    break;
                case 5:
                    SubMenu5 submenu5 = new SubMenu5();
                    submenu5.mostrarSubMenu();
                    break;
                case 6:
                    SubMenu6 submenu6 = new SubMenu6();
                    submenu6.mostrarSubMenu();
                    break;
                case 0:
                    System.out.println("Saindo...\nObrigado(a)! ");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}

