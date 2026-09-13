public class CodingAiassistantbuilder  implements Aibuilderr{
    private String name;
    private String model;
    private String language;
    private String responseStyle;
    private boolean memory;
    private String specialization;

    @Override
    public CodingAiassistantbuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public CodingAiassistantbuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CodingAiassistantbuilder setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public CodingAiassistantbuilder setResponseStyle(String responseStyle) {
        this.responseStyle = responseStyle;
        return this;
    }

    @Override
    public CodingAiassistantbuilder setMemory(boolean memory) {
        this.memory = memory;
        return this;
    }

    @Override
    public CodingAiassistantbuilder setSpecialization(String specialization) {
        this.specialization = specialization;
        return this;
    }

    @Override
    public AiAssIstant build() {
        return new AiAssIstant( name,
                model,
                language,
                responseStyle,
                memory,
                specialization
        );

    }



}
