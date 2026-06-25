import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
public class CriarArquivos {
    public static void main(String[] args) {
        Path caminho = Path.of("ArquivoPraTeste.txt"); //O nome do arquivo 
        //bloco de try pra fazer o arquivo
        try {
            //Criação do arquivo em si dentro desse try.
            Files.createFile(caminho);
            System.out.print("Arquivo .txt criado.");
        }
        catch(IOException e){
            //Captura do erro de entrada/saida de dados e mostra na tela o erro
            System.err.println("O erro: " + e.getMessage());
        }

    }
    
}
