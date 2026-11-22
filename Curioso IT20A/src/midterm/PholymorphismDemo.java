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

