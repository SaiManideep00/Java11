public enum Day {
    SUNDAY("sun"),
    MONDAY("Mon"),
    TUESDAY("Tues"),
    WEDNESDAY("wed"),
    THURSDAY("thu"),
    FRIDAY("fri"),
    SATURDAY("sat");

    private  String shortName;

    Day (String shortName)
    {
        this.shortName=shortName;
    }

    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName)
    {
        this.shortName=shortName;
    }
}
