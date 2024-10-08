public class Cadastro {
    private String nome_cliente;
    private int idade;
    private String endereco;
    private String telefone;
    private int id_Cliente;
    
    public Cadastro(int id_Cliente, String nome_cliente, int idade, String endereco, String telefone){
        
        this.id_Cliente = id_Cliente;
        this.nome_cliente = nome_cliente;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;   
        
    }
    
    public int getId_Cliente(){
        return id_Cliente;
    }
    
    public void setNome_cliente(String nome_cliente){
        this.nome_cliente = nome_cliente;
    }

    
    public String getNome_cliente(){
        return nome_cliente;   
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
}
