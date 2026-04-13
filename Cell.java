public class Cell {
    private Object value;

    public Cell() {
        this.value = null;
    }

    public Cell(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int getIntValue() {
        if (value == null) return 0;
        if (value instanceof Integer) return (Integer) value;
        try {
            return Integer.parseInt(value.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public String getStringValue() {
        return value != null ? value.toString() : "empty";
    }

    @Override
    public String toString() {
        return value != null ? value.toString() : "empty";
    }
}
