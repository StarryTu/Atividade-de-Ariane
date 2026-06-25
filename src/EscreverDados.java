import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class EscreverDados {  
    public static void main(String[] args) {
        //Um buffered reader pra entrada de dados digitado pelo usuário
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("ArquivoPraTeste.txt"))){
            System.out.print("Digite o que vai ter no arquivo: ");
            String digitado = br.readLine();
            bw.write(digitado);
            System.out.print("Texto digitado no arquivo, pode conferir ele");
        } catch(IOException e){
            System.out.print("Erro na entrada de dados");
        }
    }
    
}
