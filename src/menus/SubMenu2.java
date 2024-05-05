package menus;

import com.google.gson.Gson;
import converter.Conversao;
import converter.Requests;

import java.io.IOException;
import java.util.Scanner;

import static menus.ApiEKey.CHAVE;
import static menus.ApiEKey.ENDERECO;

public class SubMenu2 {
    public void mostrarSubMenu() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("====================================================");
            System.out.println("Conversão de Real para Euro");
            System.out.println("1 - Inserir valor em Reais");
            System.out.println("2 - Voltar");
            System.out.println("0 - Sair");
            System.out.println("=====================================================");
            System.out.print("Opção: ");


            while (!scanner.hasNextInt()){
                System.out.println("Insira um número inteiro válido.");
                scanner.next();
            }

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor em Reais = R$ ");
                    String valor;

                    do {
                        valor = scanner.next();
                        if (!valor.matches("[0-9.,]+")) {
                            System.out.println("Insira um número válido.\nValor em Reais = R$ ");
                        }
                    } while (!valor.matches("[0-9.,]+"));

                    valor = valor.replace(',', '.');
                    String busca = ENDERECO + CHAVE +"pair/BRL/" + "EUR/"+  valor;

                    Requests requests = new Requests(busca);
                    String outraBusca = requests.consulta();

                    Gson gson = new Gson();
                    Conversao conversao = gson.fromJson(outraBusca, Conversao.class);

                    System.out.println(conversao.toString());

                    break;
                case 2:
                    return;
                case 0:
                    System.out.println("Saindo...\nObrigado(a)! ");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        } while (true);
    }
}