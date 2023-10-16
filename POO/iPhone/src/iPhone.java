public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private ReprodutorMusical player;
    private AparelhoTelefonico phone;
    private NavegadorInternet browser;

    public iPhone() {
        // Inicialize as instâncias de player, phone e browser
        player = new MusicPlayer();
        phone = new Phone();
        browser = new WebBrowser();
    }

    // Métodos específicos do iPhone
    public void playMusic() {
        player.play();
    }

    public void pauseMusic() {
        player.pause();
    }

    @Override
    public void call() {
        phone.call();
    }

    @Override
    public void answerCall() {
        phone.answerCall();
    }

    @Override
    public void startVoiceMail() {
        phone.startVoiceMail();
    }

    @Override
    public void displayWebPage() {
        browser.displayWebPage();
    }

    @Override
    public void addNewTab() {
        browser.addNewTab();
    }

    @Override
    public void refreshPage() {
        browser.refreshPage();
    }

    @Override
    public void play() {
        player.play();
    }

    @Override
    public void pause() {
        player.pause();
    }

    @Override
    public void selectMusic() {
        player.selectMusic();
    }
}
