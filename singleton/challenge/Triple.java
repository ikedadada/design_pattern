package singleton.challenge;

public enum Triple {
    ALPHA, BETA, GAMMA;

    public static Triple getInstance(String name) {
        switch (name) {
            case "ALPHA":
                return ALPHA;
            case "BETA":
                return BETA;
            case "GAMMA":
                return GAMMA;
        }
        throw new IllegalArgumentException();
    }


}
