public class Main {
    public static void main(String[] args) {

        AiAssIstant studyAssistant = new StudyAiassistantBuilderr()
                .setName("Study AI")
                .setModel("gpt-5")
                .setLanguage("English")
                .setResponseStyle("Simple")
                .setMemory(true)
                .setSpecialization("education")
                .build();

        AiAssIstant codingAssistant = new CodingAiassistantbuilder()
                .setName("CodeHelper")
                .setModel("gpt-5")
                .setLanguage("English")
                .setResponseStyle("Technical")
                .setMemory(false)
                .setSpecialization("programming")
                .build();

        System.out.println(studyAssistant);
        System.out.println();
        System.out.println(codingAssistant);
    }
}
