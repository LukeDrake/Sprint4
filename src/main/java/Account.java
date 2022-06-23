public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name == null) return false;

        int strSize = name.length();
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(this.name.length() - 1);

        if (strSize < 3 || strSize > 19) return false;
        if (firstChar == ' ' || lastChar == ' ') return false;
        return name.chars().filter(c -> c == (int) ' ').count() == 1;
    }
}
