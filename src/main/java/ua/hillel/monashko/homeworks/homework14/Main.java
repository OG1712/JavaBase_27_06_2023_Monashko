package ua.hillel.monashko.homeworks.homework14;

public class Main  {

    public static void main(String[] args) {

        MusicStyles[] musicStyles = {new PopMusic(), new RockMusic(), new ClassicMusic()};



        for (MusicStyles style : musicStyles) {

            style.playMusic();

        }


    }
}
