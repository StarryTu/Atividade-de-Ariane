import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class AbrirArquivos {
    private Path arquivo = Path.of("ArquivoPraTeste.txt");
    public Path getArquivo() {
        return arquivo;
    }
    public void setArquivo(Path arquivo) {
        this.arquivo = arquivo;
    }
    private boolean qualTipo;
    public boolean isQualTipo() {
        return qualTipo;
    }
    public void setQualTipo(boolean qualTipo) {
        this.qualTipo = qualTipo;
    }
    public AbrirArquivos(boolean qualTipo){
        this.qualTipo = qualTipo;
    }
    public BufferedReader abrirArquivoParaLeitura() throws IOException {
        try {
            if(qualTipo == false){
                return Files.newBufferedReader(arquivo);
            } 
        } catch (IOException e) {
            System.err.println("Erro de leitura do arquivo");
        }
        if(qualTipo == false){
            return Files.newBufferedReader(arquivo);
        }
        return null;
    }
    public BufferedWriter abrirArquivosEscrever() throws IOException{
        try {
            if(qualTipo == true){
                return new BufferedWriter(new FileWriter(arquivo.toFile(), true));
            }
        } catch (IOException e) {
            System.err.print("Erro de leitura de arquivo");
        }
        return null;
    }
}

