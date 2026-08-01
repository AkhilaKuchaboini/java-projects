public class Student
{
    private String name;
    private int score;
    private boolean examStarted;
    private boolean examSubmitted;

    public Student(String name)
    {
        this.name = name;
    }

    public void startExam() throws ExamAlreadyStartedException
    {
        if(examStarted)
        {
            throw new ExamAlreadyStartedException("Exam has already started");
        }
        examStarted = true;
        System.out.println("Exam Started Successfully");
    }
    public void submitExam(int score) throws ExamNotStartedException,ExamAlreadySubmittedException,InvalidScoreException
    {
        if(!examStarted)
        {
            throw new ExamNotStartedException("Exam has not started yet");
        }
        if(examSubmitted)
        {
            throw new ExamAlreadySubmittedException("Exam has already been submitted");
        }
        if(score < 0 || score > 100)
        {
            throw new InvalidScoreException("Score should be between 0 and 100.");
        }
        this.score = score;
        examSubmitted = true;
        System.out.println("Exam submitted successfully");
    }
    public void viewScore() throws ResultNotAvailableException
    {
        if(!examSubmitted)
        {
            throw new ResultNotAvailableException("Result is not available");
        }
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
    }
}