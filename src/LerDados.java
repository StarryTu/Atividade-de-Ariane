import java.io.BufferedReader;
import java.io.IOException;
public class LerDados {
    public static void main(String[] args) {
        AbrirArquivos ar = new AbrirArquivos(true );
        try(BufferedReader br = ar.abrirArquivoParaLeitura()){
            String linha;
            int contador = 0;
            while ((linha = br.readLine()) != null){
                contador++;
                System.out.println(linha);
            }
            System.out.println("Quantidade de linhas: " + contador);
        }catch(IOException e){
            System.err.print("Erro ao ler o arquivo");
        }
    }  
}
