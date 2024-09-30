import java.util.Scanner;
import java.util.Scanner;
public class Quiz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Centro Universitário Alfredo Nasser");
        System.out.println("Aluno: Gustavo de França");
        System.out.println("Data: 18/09/2024");
        System.out.println("Turma: ESN1");
        System.out.println("");
        System.out.println("Nesse quiz, foram elaboradas 15 questões sobre Conhecimentos Gerais! Boa Sorte!");
        System.out.println("================================================================================");


        String[] questions = {
                "Qual é a capital do Brasil?",
                "Qual é o maior planeta do sistema solar?",
                "Quem escreveu 'Dom Casmurro'?",
                "Quem foi o descobridor das Américas?",
                "Qual é o maior oceano do mundo?",
                "Qual é o animal mais rápido do mundo?",
                "Qual a capital dos Estados Unidos (EUA)?",
                "Quem foi o autor do romance 'Romeu e Julieta'?",
                "Qual é o planeta mais próximo do Sol?",
                "Qual a caítal da Austrália?",
                "Qual é a obra de arte mais famosa que em seu esboço, representa uma mulher com um sorriso enigmático?",
                "Qual a fórmula da água?",
                "Qual é o idioma mais falado no mundo?",
                "Em que ano o Homem pisou na Lua pela primeira vez?",
                "Na tabela periódica, qual é o símbolo do Ouro?",

        };

        String[][] options = {
                {"a) São Paulo", "b) Brasília", "c) Rio de Janeiro", "d) Salvador"},
                {"a) Terra", "b) Marte", "c) Júpiter", "d) Saturno"},
                {"a) José de Alencar", "b) Machado de Assis", "c) Manuel Bandeira", "d) Graciliano Ramos"},
                {"a) Cristóvão Colombo","b) Pablo Marçal","c) Pedro Alvarez Cabral", "d) Ronaldo Caiado"},
                {"a) Oceano Atlântico","b) Oceano Índico","c) Oceano Pacífico","d) Oceano Ártico"},
                {"a) Falcão-peregrino", "b) Guepardo", "c) Cavalo", "d) Lince"},
                {"a) Whasington D.C.", "b) California", "c) Texas", "d) Flórida"},
                {"a) Charles Dickens", "b) Mark Tawin", "c) Jane Austen", "d) William Shakespeare"},
                {"a) Vênus", "b) Terra", "c) Mercúrio", "d) Marte"},
                {"a) Sydney", "b) Canberra", "c) Brisbane", "d) Melbourne"},
                {"a) A Noite Estrelada", "b) O Nascimento de Vênus","c) O Grito","d) Mona Lisa"},
                {"a) CO2", "b) O2", "c) H2SO4", "d) H2O"},
                {"a) Mandarim", "b) Inglês", "c) Espanhol", "d) Hindi"},
                {"a) 1969", "b) 1980" ,"c) 1972", "d) 1965"},
                {"a) Ag", "b) Pb", "c) Fe", "d) Au"},
        };

        char[] correctAnswers = {'b', 'c', 'b', 'a', 'c','a','a', 'd', 'c', 'b', 'd', 'd', 'a', 'a', 'd'};

        int score = 0;


        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }


            System.out.print("Escolha sua resposta: (a) (b) (c) (d) - ");
            String userInput = scanner.next().trim().toLowerCase(); // Leitura e formatação da resposta


            if (userInput.length() == 1) {
                char userAnswer = userInput.charAt(0);


                if (userAnswer == correctAnswers[i]) {
                    System.out.println("Resposta correta!");
                    score++;
                } else {
                    System.out.println("Resposta errada! A resposta correta era: " + correctAnswers[i]);
                }
            } else {
                System.out.println("Resposta inválida! Por favor, escolha entre a/b/c/d.");
            }
            System.out.println();
        }

        System.out.println("Você acertou " + score + " de " + questions.length + " perguntas.");


        scanner.close();
    }
}

