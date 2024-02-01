package Interfaces_in_java;

class Phone {
    void call() {
        System.out.println("You can call.");
    }

    void sms() {
        System.out.println("You can message.");
    }
}

interface camera {
    void click();

    void record();
}

interface music_player {
    void play();

    void start();

    void pause();
}

class smartphone extends Phone implements camera, music_player {
    void video_call() {
        System.out.println("video call.");
    }

    public void click() {
        System.out.println("click a picture.");
    }

    public void record() {
        System.out.println("You can keep a record.");
    }

    public void play() {
        System.out.println("Play your music.");
    }

    public void start() {
        System.out.println("Start button.");
    }

    public void pause() {
        System.out.println("You may pause.");
    }
}

public class Interface_example {
    public static void main(String[] args) {
        smartphone s = new smartphone();
        Phone p = s;
        camera c = s;
        music_player m = s;
        s.call();
        s.pause();
        s.call();
        p.call();
        c.click();
        m.play();
    }
}
