public class Phone implements AparelhoTelefonico {
    @Override
    public void call() {
        System.out.println("Fazendo uma ligação...");
    }

    @Override
    public void answerCall() {
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Iniciando correio de voz...");
    }
}
