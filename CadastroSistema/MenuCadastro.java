import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

class MenuCadastro {
    public static void chamarMenu() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n----[ MENU ]----"
                    + "\n1. Cadastrar"
                    + "\n2. Consultar"
                    + "\n3. Atualizar"
                    + "\n4. Remover"
                    + "\n5. Listar"
                    + "\n6. Sair"
                    + "\nDigite a sua opção:"
                    + "\n---------------");
            int opcao = 0;
            boolean entradaValida = false;

            // Loop para garantir que a entrada é válida
            while (!entradaValida) {
                try {
                    opcao = in.nextInt();
                    entradaValida = true; // Saia do loop se a entrada for válida
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Por favor, digite um número.");
                    in.nextLine(); // Limpa o buffer
                }
            }
            in.nextLine(); // Limpar o buffer após nextInt()

            switch (opcao) {
                case 1:
					System.out.println("--[ CADASTRAR CLIENTE ]--");
					System.out.println("Insira as informações do cliente: ");
			
					System.out.println("Nome: ");
					String nm_Cliente = in.nextLine();
					
					System.out.println("Idade: ");
					int ia_Cliente = in.nextInt();
					in.nextLine();
					
					System.out.println("Endereço: ");
					String ed_Cliente = in.nextLine();
					
					System.out.println("Número de Telefone: ");
					String nu_Cliente = in.nextLine();

					CadastroCliente.id_Cliente++;
					
					CadastroCliente.add(new Cadastro(CadastroCliente.id_Cliente,nm_Cliente,ia_Cliente,ed_Cliente,nu_Cliente));
					CadastroCliente.exibir(CadastroCliente.id_Cliente);
					
					System.out.println("Processo Concluido! ID "+ CadastroCliente.id_Cliente);
					MenuCadastro.chamarMenu();
					break;

                case 2:
                    System.out.println("--[ CONSULTAR CLIENTE ]--");
                    System.out.println("Insira o número identificador do cliente: ");
                    int escolha = in.nextInt();
                    CadastroCliente.exibir(escolha);
                    break;
				
                case 3:
                    System.out.println("--[ ATUALIZAR CLIENTE ]--");
                    System.out.println("Insira o número identificador do cliente: "); 
                    int var1 = in.nextInt();
                    in.nextLine(); // Limpa o buffer após nextInt()
                
                    boolean clienteExiste = false;
                
                    for (Cadastro cliente : CadastroCliente.clientes) {
                        if (cliente.getId_Cliente() == var1) {
                            clienteExiste = true;
                
                            System.out.println("Selecione quais informações deseja editar: ");
                            System.out.println("1 - Nome\n2 - Idade\n3 - Endereço\n4 - Telefone\n5 - Sair");
                            
                            int atualizarEscolha = in.nextInt();
                            in.nextLine(); // Limpa o buffer após nextInt()
                            CadastroCliente.atualizar(var1, atualizarEscolha);
                            break;
                        }
                    }
                
                    if (!clienteExiste) {
                        System.out.println("Cliente com ID " + var1 + " não encontrado.");
                    }
                    break;

				case 4:
					System.out.println("--[ REMOVER CLIENTE ]--");
					System.out.println("Insere o número do identificador do cliente");
					int exclui = in.nextInt();
					if(exclui == CadastroCliente.id_Cliente){
						CadastroCliente.removerCliente(exclui);
						System.out.println("Removido com Sucesso");
					}else{
						System.out.println("Número de indentificador não encontrado");
					}  
				break;

                case 5:
                    System.out.println("--[ LISTAR CLIENTES ]--");
                    CadastroCliente.listar();
                    break;

                case 6:
                    System.out.println("Desligado...");
                    in.close();
                    return; // Sair do método

                default:
                    System.out.println("Opção inválida! Tente novamente");
            }
        }
    }
}
