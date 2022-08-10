import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RepositorioTxt {
    public void escreverQuestionario(String questionario, Questionario quest) {
     try(
        FileWriter criador = new FileWriter(questionario, true);
        BufferedWriter buffer = new BufferedWriter(criador);
        PrintWriter escritor = new PrintWriter(buffer);
     ){

         escritor.append(quest.toString());

     }catch (IOException e){
         e.printStackTrace();
     }
    }



    public void escreverTitulo(String questionario,  String titulo) {
        try(
                FileWriter criador = new FileWriter(questionario, true);
                BufferedWriter buffer = new BufferedWriter(criador);
                PrintWriter escritor = new PrintWriter(buffer);
        ){

            escritor.append(titulo);

        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
