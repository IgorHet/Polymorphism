import helper.ClassicMusic;
import helper.MusicStyles;
import helper.PopMusic;
import helper.RockMusic;

public class Main {
    public static void main(String[] args) {
        // Створення музичних гуртів для кожного стилю
        MusicStyles popBand = new PopMusic();
        MusicStyles rockBand = new RockMusic();
        MusicStyles classicBand = new ClassicMusic();

        // Виклик методу playMusic() для всіх спадкоємців MusicStyles
        MusicStyles[] musicBands = {popBand, rockBand, classicBand};
        for (MusicStyles band : musicBands) {
            band.playMusic();
        }
    }
}
