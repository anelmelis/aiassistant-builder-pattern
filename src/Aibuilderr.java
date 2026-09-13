public interface Aibuilderr {

    Aibuilderr setName(String name);

    Aibuilderr setModel(String model);

    Aibuilderr setLanguage(String language);

    Aibuilderr setResponseStyle(String responseStyle);

    Aibuilderr setMemory(boolean memory);

    Aibuilderr setSpecialization(String specialization);

    AiAssIstant build();
}
