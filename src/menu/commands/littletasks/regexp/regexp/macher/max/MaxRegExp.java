package menu.commands.littletasks.regexp.regexp.macher.max;

public enum MaxRegExp {
    NUMBERS("4[5-9][6-9]|4[6-9][0-9]|[5-9][0-9][0-9]|1[0-1][0-9][0-9]|1200"),
    WORDS("\\b[lL]+[a-zA-Z]+[mM]\\b"),
    SENTENCE("([-][0-9а-яА-Яa-zA-Z\\s\"']+?[/.,]+)"),
    DATE("\\b(0[1-9]|1[0-9]|2[0-9]|3[0-1])[/.](0[1-9]|1[0-2])[/.]([0-9]{1,4})"),
    INVALID_DATE("(3[2-9]|[4-9][0-9])[/.](1[3-9]|[2-9][0-9])[/.](1[0-8][0-9][0-9]|2[0-9][2-9][1-9]|[3-9][0-9][0-9][0-9])"),
    TAGS("<\\w+>.+?<\\\\\\w+>");

    private String regExp;

    MaxRegExp(String regExp) {
        this.regExp = regExp;
    }

    @Override
    public String toString() {
        return regExp;
    }
}

