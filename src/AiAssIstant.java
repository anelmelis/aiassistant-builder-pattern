public class AiAssIstant {
    private String name;
    private String model;
    private String language;
    private String responseStyle;
    private boolean memory;
    private String specialization;

    public AiAssIstant(String name, String model, String language, String responseStyle, boolean memory,
                       String specialization) {

        this.name = name;
        this.model = model;
        this.language = language;
        this.responseStyle = responseStyle;
        this.memory = memory;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Ai assistant" + name + "\nModel: " + model +
                "\nLanguage: " + language +
                "\nResponse style: " + responseStyle +
                "\nMemory: " + memory +
                "\nSpecialization: " + specialization;
    }

}
