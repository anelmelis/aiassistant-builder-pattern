public abstract class Abstractt implements Aibuilderr{

    protected String name;
    protected String model;
    protected String language;
    protected String responseStyle;
    protected boolean memory;
    protected String specialization;

    @Override
    public Abstractt setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Abstractt setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public Abstractt setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public Abstractt setResponseStyle(String responseStyle) {
        this.responseStyle = responseStyle;
        return this;
    }

    @Override
    public Abstractt setMemory(boolean memory) {
        this.memory = memory;
        return this;
    }

    @Override
    public Abstractt setSpecialization(String specialization) {
        this.specialization = specialization;
        return this;
    }

    @Override
    public AiAssIstant build() {
        if (name == null || name.isBlank()) {
            throw new IllegalStateException("Assistant name is required");
        }

        return new AiAssIstant(
                name,
                model,
                language,
                responseStyle,
                memory,
                specialization
        );
    }

}
