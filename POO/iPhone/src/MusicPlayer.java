public class MusicPlayer implements ReprodutorMusical {
    @Override
    public void play() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pause() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecionando música...");
    }
}
