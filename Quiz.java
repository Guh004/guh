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
                    System.out.println("Aqui estão a regras do jogo"); // Mensagem de regras
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

  private static void regras() {

        System.out.println("Regras a exibir");
      
  }
    private static void displayMenu() {
        System.out.println("Bem-vindo ao Jogo de Quiz!");
        System.out.println("Menu:");
        System.out.println("1. Jogar");
        System.out.println("2. Regras");
        System.out.println("3. Pontuação");
        System.out.println("4. Sair");
        System.out.print("Digite o número correspondente à opção desejada: ");
      
    }
    private static void startQuiz() {
        Scanner scanner = new Scanner(System.in);
      

        System.out.println("Iniciando o Quiz...");

        // Pergunta 1
        System.out.println("Pergunta 1: Qual é a capital do Brasil?");
        System.out.println("a) São Paulo");
        System.out.println("b) Rio de Janeiro");
        System.out.println("c) Brasília");
        System.out.println("d) Belo Horizonte");

        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("c")) {
            System.out.println("Resposta correta!");
            score += 10;
        } else {
            System.out.println("Resposta incorreta!");
        }

        System.out.println();

        // Pergunta 2
        System.out.println("Pergunta 2: Quem pintou a Mona Lisa?");
        System.out.println("a) Leonardo da Vinci");
        System.out.println("b) Pablo Picasso");
        System.out.println("c) Vincent van Gogh");
        System.out.println("d) Salvador Dalí");

        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("a")) {
            System.out.println("Resposta correta!");
            score += 10;
        } else {
            System.out.println("Resposta incorreta!");
        }

        System.out.println();

        // Pergunta 3
        System.out.println("Pergunta 3: Qual é o maior planeta do Sistema Solar?");
        System.out.println("a) Júpiter");
        System.out.println("b) Saturno");
        System.out.println("c) Terra");
        System.out.println("d) Vênus");

        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("a")) {
            System.out.println("Resposta correta!");
            score += 10;
        } else {
            System.out.println("Resposta incorreta!");
        }

        System.out.println();

        // Pergunta 4
        System.out.println("Pergunta 4: Qual é a capital da França?");
        System.out.println("a) Londres");
        System.out.println("b) Paris");
        System.out.println("c) Roma");
        System.out.println("d) Madrid");

        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("b")) {
            System.out.println("Resposta correta!");
            score += 10;
        } else {
            System.out.println("Resposta incorreta!");
        }

        System.out.println();

        // Pergunta 5
        System.out.println("Pergunta 5: Qual é o maior oceano do mundo?");
        System.out.println("a) Oceano Atlântico");
        System.out.println("b) Oceano Índico");
        System.out.println("c) Oceano Pacífico");
        System.out.println("d) Oceano Ártico");

        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("c")) {
            System.out.println("Resposta correta!");
            score += 10;
        } else{
System.out.println("Resposta incorreta!");   
     
} 
      
        System.out.println("Obrigado por jogar! Sua pontuação final: " + score + " pontos");

    }
  
}
