public class Sistema {

    private static void exibirMenu() {
        System.out.println("\nANIMAL_SYSTEM");
        System.out.println("1) Cadastrar Mamifero");
        System.out.println("2) Cadastrar Ave");
        System.out.println("3) Cadastrar Reptil");
        System.out.println("4) Cadastrar Peixe");
        System.out.println("5) Procurar Animal ");
        System.out.println("6) Listar Todos os Animais");
        System.out.println("7) Excluir um animal da lista");
        System.out.println("8) Excluir todos os animais da lista");
        System.out.println("0) Sair");
        System.out.println("\nDigite a opção: ");
    }

    private static void verificarOpcao(int op) {

        int id;
        int quantasPatas;
        String nome;
        String comida;
        String voa;
        String corEscama;
        String rabo;
        String agua;

        switch (op) {
            case 1:

                System.out.println("\nNovo Mamifero:");
                System.out.println("Id do mamifero: ");
                id = Console.lerInt();
                System.out.println("Nome");
                nome = Console.lerString();
                System.out.println("Comida:");
                comida = Console.lerString();

                System.out.println("Quantas patas: ");
                quantasPatas = Console.lerInt();

                Animal a = new Animal(id, nome, comida, quantasPatas);

                Cadastro.cadastrar(a);

                System.out.println("\nAnimal cadastrado com sucesso");

                break;

            case 2:

                System.out.println("\nNova Ave:");
                System.out.println("Id da ave");
                id = Console.lerInt();

                System.out.println("Nome: ");
                nome = Console.lerString();

                System.out.println("Comida: ");
                comida = Console.lerString();

                System.out.println("Quantidade de patas: ");
                quantasPatas = Console.lerInt();

                System.out.println("A ave sabe voar? ");
                voa = Console.lerString();

                Ave av = new Ave(id, nome, comida, quantasPatas, comida);
                Cadastro.cadastrar(av);

                System.out.println("\nAve cadastrada com sucesso");

                break;

            case 3:

                System.out.println("\nNovo Reptil");
                System.out.println("Id do reptil");
                id = Console.lerInt();

                System.out.println("Nome: ");
                nome = Console.lerString();

                System.out.println("Comida: ");
                comida = Console.lerString();

                System.out.println("Quantidade de patas: ");
                quantasPatas = Console.lerInt();

                System.out.println("Cor do reptil: ");
                corEscama = Console.lerString();

                System.out.println("O rabo do reptil se regenera: ");
                rabo = Console.lerString();

                Reptil r = new Reptil(id, nome, comida, quantasPatas, corEscama, rabo);
                Cadastro.cadastrar(r);

                System.out.println("Reptil cadastrado com sucesso");

                break;
            case 4:
                System.out.println("\nNovo Peixe");
                System.out.println("Id do peixe: ");
                id = Console.lerInt();

                System.out.println("Nome: ");
                nome = Console.lerString();

                System.out.println("Comida: ");
                comida = Console.lerString();

                System.out.println("Se tem patas, quantas? ");
                quantasPatas = Console.lerInt();

                System.out.println("Agua doce ou salgada? ");
                agua = Console.lerString();

                Peixe p = new Peixe(id, nome, comida, quantasPatas, agua);
                Cadastro.cadastrar(p);

                System.out.println("Peixe cadastrado com sucesso");

                break;
            case 5:

                System.out.println("\nProcurar Animal:");

                System.out.println("Id: ");
                id = Console.lerInt();

                Animal buscar = Cadastro.buscar(id);
                if (buscar != null) {

                    System.out.println("\nAnimal Localizado");
                    System.out.println(buscar.toString());

                } else {

                    System.out.println("\nAnimal: " + id + " não foi encontrado");
                }

                break;

            case 6:

                System.out.println("\nListar todos os animais cadastrados: ");

                if (Cadastro.GetListaAnimais().size() == 0) {
                    System.out.println("Sem registros!");
                    return;
                }

                for (Animal temp : Cadastro.GetListaAnimais())
                    System.out.println(temp.toString());

                break;

            case 7:

                System.out.println("\nId do animal que deseja excluir: ");
                id = Console.lerInt();

                Animal buscarAnimal = Cadastro.buscar(id);
                if (buscarAnimal != null) {

                    for (Animal temp : Cadastro.GetListaAnimais()) {
                        Cadastro.excluir(buscarAnimal);
                        System.out.println("\nAnimal excluido com sucesso");

                        return;
                    }
                }

                System.out.println("\nAnimal com o id: " + id + " não foi encontrado");

                break;
            case 8:
                if (Cadastro.GetListaAnimais().size() == 0) {
                    System.out.println("Não há animais para excluir");
                    return;
                }

                Cadastro.GetListaAnimais().clear();
                System.out.println("Animais da lista foram excluidos com sucesso");
                break;

            case 0:

                System.out.println("\nPrograma foi finalizado");

                break;

            default:

                System.out.println("\nOpção invalida. Digite novamente");

                break;
        }

    }

    public static void executar() {

        int op;
        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);
        } while (op != 0);
    }
}