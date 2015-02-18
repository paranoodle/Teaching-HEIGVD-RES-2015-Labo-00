package ch.heigvd.res.lab00;

public abstract class IInstrument {
    public abstract int getSoundVolume();
    public String play() { return ""; }
    public String getColor() { return ""; }
}

class Trumpet extends IInstrument {
    public String play() { return "pouet"; }
    public int getSoundVolume() { return 5; }
    public String getColor() { return "golden"; }
}

class Flute extends IInstrument {
    public int getSoundVolume() { return 2; }
}