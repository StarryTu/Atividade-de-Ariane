import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class EscreverDados {  
    public static void main(String[] args) {
        //Um buffered reader pra entrada de dados digitado pelo usuário.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Objeto para a classe AbrirArquivos
        AbrirArquivos ar = new AbrirArquivos(false);
        //Um bloco de try que vai tentar fazer um buffered writer que vai escrever no arquivo.
        try(BufferedWriter bw = ar.abrirArquivosEscrever()){
            //Pedido ao usuário pra digitar o texto.
            System.out.print("Digite o que você quer no texto: ");
            String digitado = br.readLine().strip();
            br = new BufferedReader(Files.newBufferedReader(ar.getArquivo()));
            String primeiraLinha = br.readLine();
            if(primeiraLinha != null && !primeiraLinha.strip().isEmpty()){
                bw.newLine();
                bw.write(digitado);
                System.out.println("Tudo certo, pode conferir o seu arquivo agora.");
            }
            else{
                bw.write(digitado);
                System.out.println("Tudo certo, pode conferir o seu texto."); 
            }
        }catch(IOException e){
            //Tratamento do erro aqui
           System.err.println("Erro de leitura do arquivo" + e); 
        }  
    }
    
}
