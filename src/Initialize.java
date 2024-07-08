public class Initialize {
    public static void main(String[] args) {
        AppServer lagacyUi = new LegacyAppUI();
        lagacyUi.displayData(new XMLData());
        //--------------
        ModernUiAdapter modernUi = new ModernUiAdapter();
        modernUi.displayData(new XMLData());

    }
}
