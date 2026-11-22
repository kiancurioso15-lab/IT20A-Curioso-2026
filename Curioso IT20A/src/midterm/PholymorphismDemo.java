class MusicalInstrument {
    public void play() {
        System.out.println("The instrument is playing music.");
    }
}

class Guitar extends MusicalInstrument {
    @Override
    public void play() {
        System.out.println("The guitar plays a strumming sound.");
    }
}

class Piano extends MusicalInstrument {
    @Override
    public void play() {
        System.out.println("The piano plays beautiful melodies.");
    }
}

class Drum extends MusicalInstrument {
    @Override
    public void play() {
        System.out.println("The drum produces rhythmic beats.");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {

        MusicalInstrument instrument1 = new Guitar();
        MusicalInstrument instrument2 = new Piano();
        MusicalInstrument instrument3 = new Drum();

        instrument1.play();
        instrument2.play();
        instrument3.play();
    }
}