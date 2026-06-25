import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class AbrirArquivos {
    //Atributo para pegar o arquivo além dos seus respsectivos getter e setter.
    private Path arquivo = Path.of("ArquivoPraTeste.txt");
    public Path getArquivo() {
        return arquivo;
    }
    public void setArquivo(Path arquivo) {
        this.arquivo = arquivo;
    }
    //Atributo booleano para saber qual vai ser o tipo de abertura de arquivo (pra ler ou escrever) e os seus respectivos getter e setter.
    private boolean TipoLeitura;
    public boolean geTipoLeitura() {
        return TipoLeitura;
    }
    public void setTipoLeitura(boolean qualTipo) {
        this.TipoLeitura = qualTipo;
    }
    //Construtor da classe AbrirArquivos
    public AbrirArquivos(boolean qualTipo){
        this.TipoLeitura = qualTipo;
    }
    //Metódo que faz toda a abertura de arquivo para leitura.
    public BufferedReader abrirArquivoParaLeitura()  {
        //Bloco de código try que vai tentar abrir o arquivo
        try {
            //Verifica se o tipo é true para executar a linha que abre o arquivo
            if(TipoLeitura == true){
                return Files.newBufferedReader(arquivo);
            } 
            System.out.print("Leitura Feita. ");
        } catch (IOException e) {
            //Tratamento de erro caso a abertura dê errado
            System.err.println("Erro de leitura do arquivo");
        }
        return null;
    }
    //Metódo que faz a abertura do arquivo para escrever.
    public BufferedWriter abrirArquivosEscrever() {
        try {
            //Verifica se o atributo TipoLeitura é false pra fazer a abertura do arquivo para escrever.
            if(TipoLeitura == false){
                return new BufferedWriter(new FileWriter(arquivo.toFile(), true));
            }
        } catch (IOException e) {
            //Tratamento de erro aqui
            System.err.print("Erro de leitura de arquivo");
        }
        return null;
    }
}

