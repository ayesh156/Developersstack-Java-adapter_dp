public class ModernUiAdapter implements AppServer {
    private final ModernAppUi modernAppUi;

    public ModernUiAdapter() {
        this.modernAppUi = new ModernAppUi();
    }

    @Override
    public void displayData(XMLData xmlData) {
        JsonData data = convertor(xmlData);
        modernAppUi.displayData(data);
    }

    private JsonData convertor(XMLData data){
        // business logic
        return new JsonData();
    }
}
