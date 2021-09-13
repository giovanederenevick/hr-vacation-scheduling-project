package br.com.giovanederenevick.hrvacationscheduling.entities.enums;

public enum SemesterEnum {

    FIRST_SEMESTER(1, "Escolha de primeiro semestre"),
    SECOND_SEMESTER(2, "Escolha de segundo semestre");

    private int cod;
    private String description;

    SemesterEnum(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static SemesterEnum toEnum(Integer cod) {

        if(cod == null) {
            return null;
        }

        for (SemesterEnum x : SemesterEnum.values()) {
            if(cod.equals(x.getCod())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Id invalid: " + cod);
    }
}
