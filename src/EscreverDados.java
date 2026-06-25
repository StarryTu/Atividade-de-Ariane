import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class EscreverDados {  
    public static void main(String[] args) {
        //Um buffered reader pra entrada de dados digitado pelo usuário.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        AbrirArquivos ar = new AbrirArquivos(true);
        //Um bloco de try que vai tentar fazer um buffered writer que vai escrever no arquivo
        try(BufferedWriter bw = ar.abrirArquivosEscrever()){
            System.out.print("Digite o que você quer no texto: ");
            String digitado = br.readLine();
            if(ar.getArquivo().toString().length() > 0 ){
                bw.newLine();
                bw.write(digitado);
                System.out.println("Tudo certo, pode conferir o seu arquivo agora.");
            }
            else{
                bw.write(digitado);
                System.out.print("Tudo certo, pode conferir o seu texto."); 
            }
            bw.write(digitado);
            System.out.print("Tudo certo, pode conferir o seu texto.");
        }catch(IOException e){
           System.err.println("Erro de leitura do arquivo"); 
        }
        
    }
    
}
