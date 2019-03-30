public enum PlaneType {

    BOEING747(550),
    AIRBUS380(853),
    BEING777(777),
    AIRBUS340(475),
    BEECHCRAFTBONANZA(9),
    PIPER(6),
    CESNA411(8);




    private final int value;

    PlaneType(int value) {
        this.value = value;
    }

    public int returnValue() {
        return this.value;
    }
}

