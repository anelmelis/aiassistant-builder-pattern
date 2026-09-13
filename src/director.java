public class director {

    public AiAssIstant buildStudyAssistantt() {
        return new StudyAiassistantBuilderr()
                .setName("Study ai")
                .build();
    }

    public AiAssIstant buildCodingAssistant() {
        return new CodingAiassistantbuilder()
                .setName("CodeHelper")
                .build();
    }
}