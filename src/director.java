public class director {

    public AiAssIstant buildStudyAssistantt(){
        return new StudyAiassistantBuilderr()
                .setName("Study ai")
                .setModel("gpt-5")
                .setLanguage("English")
                .setResponseStyle("Simple")
                .setMemory(true)
                .setSpecialization("education")
                .build();
    }

    public AiAssIstant buildCodingAssistant() {
        return new CodingAiassistantbuilder()
                .setName("CodeHelper")
                .setModel("gpt-5")
                .setLanguage("English")
                .setResponseStyle("Technical")
                .setMemory(false)
                .setSpecialization("programming")
                .build();
    }


}
