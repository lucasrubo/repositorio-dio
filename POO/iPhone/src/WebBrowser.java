public class WebBrowser implements NavegadorInternet {
    @Override
    public void displayWebPage() {
        System.out.println("Exibindo página da web...");
    }

    @Override
    public void addNewTab() {
        System.out.println("Abrindo nova aba...");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando página...");
    }
}
