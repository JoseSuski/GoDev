import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class Main {

    private static void menu() {
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("        C A D A S T R O   D E    C L I E N T E S");
        System.out.println("            1 - CADASTRAR PESSOA");
        System.out.println("            2 - CADASTRAR SALA");
        System.out.println("            3 - CADASTRAR CAFÉ");
        System.out.println("            4 - EXIBIR TODOS OS CLIENTES");
        System.out.println("            5 - SAIR");
        System.out.println("       -------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Collection<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
        Collection<Sala> listaDeSalas = new ArrayList<Sala>();
        Collection<Cafe> listaDeCafes = new ArrayList<Cafe>();
        int opcao;
        Pessoa pessoas = new Pessoa();
        Sala salas = new Sala();
        Cafe cafes = new Cafe();

        do {
            menu();
            System.out.println("Digite a opção desejada: ");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o nome da pessoa:");
                    pessoas.setNome(entrada.next());

                    System.out.println("Digite o sobrenome da pessoa:");
                    pessoas.setSobrenome(entrada.next());

                    listaDePessoas.add(pessoas);
                    break;

                case 2:

                    System.out.println("Digite o nome da sala:");
                    salas.setNome(entrada.next());

                    System.out.println("Digite a capacidade da sala:");
                    salas.setLotacao(entrada.nextInt());

                    listaDeSalas.add(salas);
                    break;

                case 3:
                    System.out.println("Digite o nome do Café:");
                    cafes.setNome(entrada.next());

                    listaDeCafes.add(cafes);
                    break;

                case 4:
                    System.out.println(listaDeSalas);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        } while (opcao != 0);
    }

}