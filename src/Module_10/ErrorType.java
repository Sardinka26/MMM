package Module_10;

public enum ErrorType {
    NOT_FOUND("Дело с таким номером не существует");

    private final String description;

    ErrorType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
