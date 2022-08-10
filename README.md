# estatistica


Clonar projeto em uma IDE java

Roda a aplicacao


Abrir o R-studio e executar o comando: dados <- read.table("C:/Users/Download/Estatistica/questionario.txt", header = TRUE, sep = "\t", dec = ".", encoding = "utf-8") 
onde o mesmo esta sendo separado por \t e o decimal por .


Abrir o projeto em uma IDE para java, executar o sistema e assim gera o txt exigido para ser lido pelo R.
Pós primeira ação executar no R o seguinte: 
dados <- read.table("C:/Users/017729631/IdeaProjects/Estatistica/questionario.txt", header = TRUE, sep = "\t", dec = ".", encoding = "utf-8")
Este commando acima importa o txt gerado para o R onde o mesmo txt analisa motoristas e suas peculiaridades.
Onde obtenho as porcentagens das variáveis através do summary(dados) obtenho:
Variáveis qualitativas: Nome, Profissão, Escolaridade,Religião,Sexo,Cidade, Estado, ,Etnia e Estado Civil, onde a partir dessa podemos obter as seguintes porcentagens:
	Relacionando as variáveis qualitativas em uma unica tabela r <- xtabs(~Religiao + Etnia + Escolaridade + Profissão + Sexo + Estado_Civil + Cidade + Estado, data = dados)
r e obtenho de retorno as seguinte tabelas:
	Escolaridade = Ensino Medio, Profissão = Motorista, Sexo = Feminino, Estado_Civil = Casado, Cidade = Recife, Estado = Pe
             Etnia
Religiao      Branco Preto
  Candomble        0     1
  Catolico         2     0
  Evangelico       2     0
  Protestante      0     1

, , Escolaridade = Ensino Medio, Profissão = Motorista, Sexo = Masculino, Estado_Civil = Casado, Cidade = Recife, Estado = Pe

             Etnia
Religiao      Branco Preto
  Candomble        0     2
  Catolico         1     0
  Evangelico       1     0
  Protestante      0     1

, , Escolaridade = Ensino Medio, Profissão = Motorista, Sexo = Feminino, Estado_Civil = Solteiro, Cidade = Recife, Estado = Pe

             Etnia
Religiao      Branco Preto
  Candomble        0     2
  Catolico         0     0
  Evangelico       0     0
  Protestante      0     2

, , Escolaridade = Ensino Medio, Profissão = Motorista, Sexo = Masculino, Estado_Civil = Solteiro, Cidade = Recife, Estado = Pe

             Etnia
Religiao      Branco Preto
  Candomble        0     0
  Catolico         2     0
  Evangelico       2     1
  Protestante      0     0
Pós a ação de summary(r) entramos para relacionar os dados quantitativos um por um, a inicia pela idade:

Atribuimos i <- dados$Idade
Onde a soma dos valores: Sum(i)
637;
A média das idades temo: mean(i)
31.85;
Sua variância: var(i)
44.45;
A Mediana: median(i)
31.5
Desvio padrão: sd(i) 
6.667083;
1st Qu. = 26.75; 3rd Qu. = 36.25


 Relacionando a altura podemos falar: 
a <- dados$Alturab <- xtabs(~Altura, data = dados)

1st Quartil = 1.708; 3rd Quartil = 1.823;
Mediana = 1.775;
Media = 1.771;
Var = 0.006293
Desvio `sd` = 0.07933


Relacionando o Salário obtemos os seguintes dados:
	1st Quartil = 3188; 3rd Quartil = 3562;
	Mediana  = 3460;
	Media = 3372.05
	Var = 129440.8
	Desvio `sd` = 359.7788

Relacionando o Peso:
	1st Quartil = ; 3rd Quartil = ;
	Mediana = 74;
	Media = 75,5;
	Var = 116.4737
	Desvio `sd`= 10.7923
Relacionando Pessoas Residentes na Casa
	1st Quartil = 3; 3rd Quartil = 5
	Mediana = 4;
	Media = 4.05;
	Variancia = 1.102632
	Desvio padrão ‘sd’ = 1.050063


Relacionado a quantidades de filhos
	1sr Quartil = 1; 3rd Quartil = 3;
	Mediana = 2;
	Media = 2.05
	Var = 1.313158
	Desvio `sd` = 1.14593;


