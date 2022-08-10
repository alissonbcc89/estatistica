import java.io.IOException;



public class Main {

    public static void main(String[] args) throws IOException {


        Questionario questionarios;
        Questionario questionarios1;
        Questionario questionarios2;
        Questionario questionarios3;
        Questionario questionarios4;
        Questionario questionarios5;
        Questionario questionarios6;
        Questionario questionarios7;
        Questionario questionarios8;
        Questionario questionarios9;
        Questionario questionarios10;
        Questionario questionarios11;
        Questionario questionarios12;
        Questionario questionarios13;
        Questionario questionarios14;
        Questionario questionarios15;
        Questionario questionarios16;
        Questionario questionarios17;
        Questionario questionarios18;
        Questionario questionarios19;

        RepositorioQuestionario repQuestionario = new RepositorioQuestionario();

        RepositorioTxt repTxt = new RepositorioTxt();



        questionarios = new Questionario("T1",48,"Motorista",3500,75,"000000000",
                "Ensino Medio",5,3,1.88,"Evangelico",
                "Feminino","Recife","Pe","Branco","Casado");

       questionarios1 = new Questionario("T2",22,"Motorista",3500,85,"1111111111",
                "Ensino Medio",3,0,1.88,"Evangelico",
                "Masculino","Recife","Pe","Preto","Solteiro");

       questionarios2 = new Questionario("T3",23,"Motorista",3600,60,"222222222",
                "Ensino Medio",5,3,1.69,"Candomble",
                "Feminino","Recife","Pe","Preto","Solteiro");


       questionarios3 = new Questionario("T4",24,"Motorista",3700,70,"333333333",
                "Ensino Medio",2,0,1.73,"Catolico",
                "Masculino","Recife","Pe","Branco","Solteiro");

       questionarios4 = new Questionario("T5",25,"Motorista",3500,80,"444444444",
                "Ensino Medio",3,1,1.65,"Protestante",
                "Feminino","Recife","Pe","Preto","Solteiro");

       questionarios5 = new Questionario("T6",26,"Motorista",3500.99,65,"555555555",
                "Ensino Medio",3,1,1.75,"Evangelico",
                "Masculino","Recife","Pe","Branco","Solteiro");

       questionarios6 = new Questionario("T7",27,"Motorista",3900,90,"666666666",
                "Ensino Medio",3,1,1.65,"Candomble",
                "Feminino","Recife","Pe","Preto","Solteiro");

       questionarios7 = new Questionario("T8",28,"Motorista",3400,70,"777777777",
                "Ensino Medio",3,1,1.77,"Catolico",
                "Masculino","Recife","Pe","Branco","Solteiro");

       questionarios8 = new Questionario("T9",29,"Motorista",3100,75,"888888888",
                "Ensino Medio",5,3,1.67,"Protestante",
                "Feminino","Recife","Pe","Preto","Solteiro");

       questionarios9 = new Questionario("T10",30,"Motorista",3000,88,"999999999",
                "Ensino Medio",4,2,1.70,"Evangelico",
                "Masculino","Recife","Pe","Branco","Solteiro");

       questionarios10 = new Questionario("T11",31,"Motorista",3200,73,"9111111111",
                "Ensino Medio",4,2,1.83,"Candomble",
                "Feminino","Recife","Pe","Preto","Casado");

       questionarios11 = new Questionario("T12",32,"Motorista",3250,68,"9222222222",
                "Ensino Medio",5,3,1.80,"Catolico",
                "Masculino","Recife","Pe","Branco","Casado");

       questionarios12 = new Questionario("T13",33,"Motorista",3150,90,"9333333333",
                "Ensino Medio",3,1,1.73,"Protestante",
                "Feminino","Recife","Pe","Preto","Casado");

       questionarios13 = new Questionario("T14",34,"Motorista",3210,61,"9444444444",
                "Ensino Medio",6,4,1.88,"Evangelico",
                "Masculino","Recife","Pe","Branco","Casado");

       questionarios14 = new Questionario("T15",35,"Motorista",3550,88,"9555555555",
                "Ensino Medio",5,3,1.82,"Candomble",
                "Masculino","Recife","Pe","Preto","Casado");

       questionarios15 = new Questionario("T16",36,"Motorista",3980,93,"9666666666",
                "Ensino Medio",4,2,1.90,"Catolico",
                "Feminino","Recife","Pe","Branco","Casado");

       questionarios16 = new Questionario("T17",37,"Motorista",3700,63,"9777777777",
                "Ensino Medio",4,2,1.81,"Protestante",
                "Masculino","Recife","Pe","Preto","Casado");

       questionarios17 = new Questionario("T18",38,"Motorista",3420,65,"9888888888",
                "Ensino Medio",4,3,1.79,"Evangelico",
                "Feminino","Recife","Pe","Branco","Casado");

       questionarios18 = new Questionario("T19",39,"Motorista",2780,83,"9999999991",
                "Ensino Medio",5,3,1.78,"Candomble",
                "Masculino","Recife","Pe","Preto","Casado");

       questionarios19 = new Questionario("T20",40,"Motorista",2500,68,"9999999992",
                "Ensino Medio",5,3,1.71,"Catolico",
                "Feminino","Recife","Pe","Branco","Casado");





        String titulo ="Nome\t"+"Idade\t"+"Profissão\t"+"Salario\t"+"Peso\t"+"Telefone\t"+"Escolaridade\t"+
                "Quantidade_de_Moradores_casa\t"+"Quantidade_de_Filhos\t"+"Altura\t"+"Religiao\t"+
                "Sexo\t"+"Cidade\t"+"Estado\t"+"Etnia\t"+"Estado_Civil\t\n";


        repTxt.escreverTitulo("questionario.txt", titulo.toString());


        repTxt.escreverQuestionario("questionario.txt",questionarios);
        repTxt.escreverQuestionario("questionario.txt",questionarios1);
        repTxt.escreverQuestionario("questionario.txt",questionarios2);
        repTxt.escreverQuestionario("questionario.txt",questionarios3);
        repTxt.escreverQuestionario("questionario.txt",questionarios4);
        repTxt.escreverQuestionario("questionario.txt",questionarios5);
        repTxt.escreverQuestionario("questionario.txt",questionarios6);
        repTxt.escreverQuestionario("questionario.txt",questionarios7);
        repTxt.escreverQuestionario("questionario.txt",questionarios8);
        repTxt.escreverQuestionario("questionario.txt",questionarios9);
        repTxt.escreverQuestionario("questionario.txt",questionarios10);
        repTxt.escreverQuestionario("questionario.txt",questionarios11);
        repTxt.escreverQuestionario("questionario.txt",questionarios12);
        repTxt.escreverQuestionario("questionario.txt",questionarios13);
        repTxt.escreverQuestionario("questionario.txt",questionarios14);
        repTxt.escreverQuestionario("questionario.txt",questionarios15);
        repTxt.escreverQuestionario("questionario.txt",questionarios16);
        repTxt.escreverQuestionario("questionario.txt",questionarios17);
        repTxt.escreverQuestionario("questionario.txt",questionarios18);
        repTxt.escreverQuestionario("questionario.txt",questionarios19);


    }
}

