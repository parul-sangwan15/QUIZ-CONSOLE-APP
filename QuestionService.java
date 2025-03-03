import java.util.Scanner;

public class QuestionService {
     

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "What is this language?", "Java", "Python", "C#", "C++", "Java");
        questions[1] = new Question(2, "Size of int?", "2", "6", "4", "8", "4");
        questions[2] = new Question(3, "Colour of sky?", "Pink", "Blue", "It's just reflection", "Whatever I want to think!", "Whatever I want to think!");
        questions[3] = new Question(4, "Okay, Size of boolean", "1", "2", "3", "4", "1");
        questions[4] = new Question(5, "Size of long?", "2", "6", "4", "8", "8");
    }

    public void playQuiz(){

        // for(int i = 0; i <6; i++){
        // System.out.println("Question no. " + questions[i].getId() + " is: ");
        // System.out.println(questions[i].getQuestion());
        // System.out.println("Option 1: " + questions[i].getOpt1());
        // System.out.println("Option 2: " + questions[i].getOpt2());
        // System.out.println("Option 3: " + questions[i].getOpt3());
        // System.out.println("Option 4: " + questions[i].getOpt4());
        // System.out.println("Answer is: " + questions[i].getAnswer() + "\n");
        // }

        // Instead of this use ternary for loop

        int i = 0;
        for(Question ques : questions){
            // System.out.println(ques);                
            
            // but here toString() method will print some value@hashcode so we override the toString() method

            System.out.println("Question no. " + ques.getId() + " is: ");
            System.out.println(ques.getQuestion());
            System.out.println("Option 1: " + ques.getOpt1());
            System.out.println("Option 2: " + ques.getOpt2());
            System.out.println("Option 3: " + ques.getOpt3());
            System.out.println("Option 4: " + ques.getOpt4());

            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        for(String s : selection){
            System.out.println(s);

        }

    }


    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];
            if (answer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is : " + score);
    }
}
