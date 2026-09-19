abstract class Instrument {

    public Instrument() {
    }

    public String play() {
        return "";
    }
}

class StringInstrument extends Instrument {

    public StringInstrument() {
        super();
    }

    @Override
    public String play() {
        String message = super.play();
        return message + "Strumming the strings";
    }
}

class Violin extends StringInstrument {

    public Violin() {
        super();
    }

    @Override
    public String play() {
        String message = super.play();
        return message + ", with a bow drawn across four strings";
    }
}

public class Main {

    public static void main(String[] args) {

        StringInstrument s = new StringInstrument();
        System.out.println(s.play());

        Violin v = new Violin();
        System.out.println(v.play());
    }
}
