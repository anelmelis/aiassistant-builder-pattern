public class Main {
    public static void main(String[] args) {

        director Director = new director();

        AiAssIstant studyAssistant = Director.buildStudyAssistantt();
        AiAssIstant codingAssistant = Director.buildCodingAssistant();

        System.out.println(studyAssistant);
        System.out.println();
        System.out.println(codingAssistant);
    }
}
