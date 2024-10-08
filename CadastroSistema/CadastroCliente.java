import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroCliente {
    static ArrayList<Cadastro> clientes = new ArrayList<>();
    public static int id_Cliente = 0;

    public CadastroCliente() {
        CadastroCliente.clientes = new ArrayList<>();
    }

    public static void add(Cadastro idCl) {
    	//System.out.println("TESTE "+idCl);
        clientes.add(idCl);
    }

    public static String removerCliente(int idCliente) {
    List<Cadastro> clientesParaRemover = new ArrayList<>();

    for (Cadastro cliente : clientes) {
        if (cliente.getId_Cliente() == idCliente) {
            clientesParaRemover.add(cliente);
        }
    }

    if (!clientesParaRemover.isEmpty()) {
        clientes.removeAll(clientesParaRemover); // Remove todos os clientes encontrados
        return "Cliente(s) removido(s) com sucesso.";
    } else {
        return "Cliente não encontrado.";
    }
}

    public static void exibir(int idCliente) {
        boolean clienteEncontrado = false;
        for (Cadastro cliente : clientes) {
            if (cliente.getId_Cliente() == idCliente) {
                System.out.println("Cliente encontrado:");
                System.out.println("Nome: " + cliente.getNome_cliente());
                System.out.println("Idade: " + cliente.getIdade());
                System.out.println("Endereço: " + cliente.getEndereco());
                System.out.println("Telefone: " + cliente.getTelefone());
                System.out.println("-----------------------------------------");
                clienteEncontrado = true;
                break;
            }
        }
    
        if (!clienteEncontrado) {  // Se o cliente não foi encontrado
            System.out.println("Cliente com ID " + idCliente + " não encontrado.");
        }
        System.out.println("Processo concluído!");
        MenuCadastro.chamarMenu();
    }
    
    public static void listar() {
        for(Cadastro cliente : clientes) {
            System.out.println("ID do Cliente: "+cliente.getId_Cliente());
            System.out.println("Nome: " + cliente.getNome_cliente());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("-----------------------------------------");
        }
        System.out.println("Processo concluído!");
        MenuCadastro.chamarMenu();
    }

    public static void atualizar(int idCli, int atualizarEscolha) {
        boolean clienteEncontrado = false;
        Scanner input = new Scanner(System.in); 
        
        for (Cadastro cliente : clientes) {
            if (cliente.getId_Cliente() == idCli) {
                clienteEncontrado = true;
    
                switch (atualizarEscolha) {
                    case 1: 
                        System.out.println("Insira o novo nome: ");
                        String novoNome = input.nextLine();
                        cliente.setNome_cliente(novoNome);
                        System.out.println("Nome atualizado");
                        break;
    
                    case 2:  
                        System.out.println("Insira a nova idade: ");
                        int novaIdade = input.nextInt();
                        cliente.setIdade(novaIdade);
                        input.nextLine(); // Limpa o buffer
                        System.out.println("Idade atualizada");  
                        break;
    
                    case 3:
                        System.out.println("Insira o novo endereço: ");
                        String novoEndereco = input.nextLine();
                        cliente.setEndereco(novoEndereco);
                        System.out.println("Endereço atualizado");
                        break;
    
                    case 4: 
                        System.out.println("Insira o novo telefone: ");
                        String novoTelefone = input.nextLine();
                        cliente.setTelefone(novoTelefone);
                        System.out.println("Telefone atualizado");
                        break;
    
                    case 5:
                        System.out.println("Saindo do menu de atualização...");
                        return;
    
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }
    
                // Exibir informações atualizadas após a alteração
                CadastroCliente.exibir(idCli);
                System.out.println("Alterações salvas com sucesso.");
                break;
            }
        }
    
        if (!clienteEncontrado) {
            System.out.println("Cliente com ID " + idCli + " não encontrado.");
        }
        System.out.println("Processo concluído!");
    }
}
