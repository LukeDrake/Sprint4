public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        int strSize = this.name.length();
        char firstChar = this.name.charAt(0);
        char lastChar = this.name.charAt(this.name.length() - 1);

        if (strSize < 3 || strSize > 19) return false;
        if (firstChar == ' ' || lastChar == ' ') return false;
        return this.name.chars().filter(c -> c == (int) ' ').count() == 1;
    }
}
