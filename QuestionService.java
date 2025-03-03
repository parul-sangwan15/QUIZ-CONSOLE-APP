public class QuestionService {
     

    Question[] questions = new Question[6];

    public void displayQuestions(){
        questions[0] = new Question(1, "What is this language?", "Java", "Python", "C#", "C++", "Java");
        questions[1] = new Question(2, "Size of int?", "2", "6", "4", "8", "4");
        questions[2] = new Question(3, "Colour of sky?", "Pink", "Blue", "It's just reflection", "Whatever I want to think!", "Whatever I want to think!");
        questions[3] = new Question(4, "How do I feel today?", "Good", "Happy", "Confident", "All of the above:)", "All of the above:)");
        questions[4] = new Question(5, "Okay, Size of boolean", "1", "2", "3", "4", "1");
        questions[5] = new Question(6, "Size of long?", "2", "6", "4", "8", "8");

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

        for(Question ques : questions){
            System.out.println(ques);                 // but here toString() method will print some value@hashcode so we override the toString() method

        }


    }

}
