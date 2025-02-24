package Annotation;

class LegacyAPI {
    @Deprecated
    public void oldFeature() {
        System.out.println("This is an old feature. Please use the new one.");
    }

    public void newFeature() {
        System.out.println("This is the new feature!");
    }
}

public class Q2_LegacyAPI {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();
        api.newFeature();
    }
}
