import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class EscreverDados {  
    public static void main(String[] args) {
        //Um buffered reader pra entrada de dados digitado pelo usuário.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Variável booleana pra ficar rodando em loop o bloco de código try-catch até sair certo.
        boolean foiCerto = false;
        AbrirArquivos ar = new AbrirArquivos(true);
        //Um bloco de try que vai tentar fazer um buffered writer que vai escrever no arquivo
        try(BufferedWriter bw = ar.abrirArquivosEscrever()){
            System.out.print
        }catch(IOException e){
            
        }
        
    }
    
}
