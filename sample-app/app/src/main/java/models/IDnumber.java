package models;

public class IDnumber {

    private String type;
    private String value;
    private String state_code;

    public IDnumber(String type, String value, String state_code) {
        this.type = type;
        this.value = value;
        this.state_code = state_code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getState_code() {
        return state_code;
    }

    public void setState_code(String state_code) {
        this.state_code = state_code;
    }

    @Override
    public String toString() {
        return "IDnumber{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", state_code='" + state_code + '\'' +
                '}';
    }
}
