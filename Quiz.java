import java.util.Scanner;

public class QuizGame {
    private static int score = 0; // Pontuação inicial do jogador

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
      int choice;

        do {
            displayMenu(); // Exibir o menu
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    startQuiz(); // Iniciar o jogo de quiz
                    break;
              case 2:
                    startRegras(); // Mensagem de regras
                break;
                
                case 3:
                   System.out.println("Obrigado por jogar! Sua pontuação final: " + score + " pontos"); // Mensagem de saída
                    break;
              case 4:
                    System.out.println("Obrigado por jogar! Até a próxima!"); // Mensagem de opção inválida
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }

  private static void startRegras() {
System.out.println("=========================");
    System.out.println("Regras:");
    System.out.println("ﾠ");
        System.out.println("1- Cada questão vale 10 pontos.");
        System.out.println("2- Responda o quiz e acomule o maximo de pontos ");
       System.out.println("3- Ao errar nao contabilizará com seus pontos anteriores");
    System.out.println("ﾠ");
    System.out.println("=========================");
      
  }
    private static void displayMenu() {
      System.out.println("\u001B[34m");
        System.out.println("Bem-vindo ao FutQuiz!");
      System.out.println("\u001B[1m");
       System.out.println("ﾠﾠ");
         
        System.out.println("=========================");
        System.out.println(" Menu Principal");
        System.out.println("ﾠ");
        System.out.println("1. Jogar");
        System.out.println("2. Regras");
        System.out.println("3. Pontuação");
        System.out.println("4. Sair");
       System.out.println("ﾠﾠ");
        System.out.println("Digite à opção desejada: ");
       System.out.println("=========================ﾠ");
      System.out.println("\u001B[37m");
      
    }
    private static void startQuiz() {
        Scanner scanner = new Scanner(System.in);
      

        System.out.println("Iniciando o FutQuiz!Boa sorte!");

        // Pergunta 1
        System.out.println("Pergunta 1: Qual país sediou a Copa do Mundo de 2018?");
        System.out.println("a) Brasil");
        System.out.println("b) Alemanha");
        System.out.println("c) Rússia");
        System.out.println("d) França");

        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("c")) {
            System.out.println("Resposta correta!");
            score += 10;
        } else {
            System.out.println("Resposta incorreta!");
        }

        System.out.println();

        // Pergunta 2
        System.out.println("Pergunta 2: Quantas vezes o Brasil ganhou a Copa do Mundo?");
        System.out.println("a) 3 vezes");
        System.out.println("b) 5 vezes");
        System.out.println("c) 7 vezes");
        System.out.println("d) 9 vezes");

        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("b")) {
            System.out.println("Resposta correta!");
            score += 10;
        } else {
            System.out.println("Resposta incorreta!");
        }

        System.out.println();

        // Pergunta 3
        System.out.println("Pergunta 3: Qual jogador brasileiro é o maior artilheiro da história da seleção brasileira?");

        System.out.println("a) Ronaldo Fenômeno");
        System.out.println("b) Pelé");
        System.out.println("c) Zico");
        System.out.println("d) Romário");

        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("b")) {
            System.out.println("Resposta correta!");
            score += 10;
        } else {
            System.out.println("Resposta incorreta!");
        }

        System.out.println();

        // Pergunta 4
        System.out.println("Pergunta 4: Em que ano o Brasil ganhou sua primeira Copa do Mundo?");
        System.out.println("a) 1950");
        System.out.println("b) 1958");
        System.out.println("c) 1962");
        System.out.println("d) 1970");

        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("b")) {
            System.out.println("Resposta correta!");
            score += 10;
        } else {
            System.out.println("Resposta incorreta!");
        }

        System.out.println();

        // Pergunta 5
        System.out.println("Pergunta 5: Quem foi o artilheiro da Copa do Mundo de 2014?");
        System.out.println("a) Neymar");
        System.out.println("b) Thomas Müller");
        System.out.println("c) James Rodríguez");
        System.out.println("d) Lionel Messi");

        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("b")) {
            System.out.println("Resposta correta!");
            score += 10;
        } else{
System.out.println("Resposta incorreta!");   
     
} 
      // Pergunta 6
        System.out.println("Pergunta 6: Qual jogador brasileiro foi o primeiro a vencer o prêmio de Jogador do Ano da FIFA?");
        System.out.println("a) Romário");
        System.out.println("b) Zico");
        System.out.println("c) Pelé");
        System.out.println("d) Ronaldinho Gaúcho");

        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("c")) {
            System.out.println("Resposta correta!");
            score += 10;
        } else{
System.out.println("Resposta incorreta!");   
} 
      // Pergunta 7
        System.out.println("Pergunta 7: Qual país venceu a Copa do Mundo de 2010?");
        System.out.println("a) Espanha");
        System.out.println("b) Alemanha");
        System.out.println("c) Argentina");
        System.out.println("d) Brasil");

        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("a")) {
            System.out.println("Resposta correta!");
            score += 10;
        } else{
System.out.println("Resposta incorreta!");   
     
} 
      // Pergunta 8
        System.out.println("Pergunta 8: Quantas vezes a seleção brasileira ficou em segundo lugar na Copa do Mundo?");
        System.out.println("a) 2 vezes");
        System.out.println("b) 3 vezes");
        System.out.println("c) 4 vezes");
        System.out.println("d) 5 vezes");

        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("c")) {
            System.out.println("Resposta correta!");
            score += 10;
        } else{
System.out.println("Resposta incorreta!");   
     
} 
      // Pergunta 9
        System.out.println("Pergunta 9: Qual é o maior estádio de futebol do Brasil?");
        System.out.println("a) Maracanã");
        System.out.println("b) Mineirão");
        System.out.println("c) Morumbi");
        System.out.println("d) Beira-Rio");

        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("a")) {
            System.out.println("Resposta correta!");
            score += 10;
        } else{
System.out.println("Resposta incorreta!");   
     
} 
      // Pergunta 10
        System.out.println("Pergunta 10: Quantas vezes o Santos FC venceu a Copa Libertadores da América?");
        System.out.println("a) 2 vezes");
        System.out.println("b) 3 vezes");
        System.out.println("c) 4 vezes");
        System.out.println("d) 5 vezes");

        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("b")) {
            System.out.println("Resposta correta!");
            score += 10;
        } else{
System.out.println("Resposta incorreta!");   
     
} 
        System.out.println("Obrigado por jogar! Sua pontuação final: " + score + " pontos");

    }
  
}
