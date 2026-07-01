import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
public class ApagarArquivos {
    public static void main(String[] args) {
        Path arquivo = Path.of("ArquivoPraTeste.txt");
        try{
            Files.delete(arquivo);
            System.out.println("Arquivo apagado com sucesso");
        }
        catch(IOException e){
            System.err.println("Erro ao apagar o arquivo" + e);
        }
    }
}
