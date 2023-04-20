public class App {

    static boolean iWillNotCheat = true;
    static boolean iWillWin = true;

    public static void main(String[] args) throws Exception {

        assert iWillNotCheat == true:" I'll accept  any outcome";

        enterCompetition();

        assert iWillWin == true:"oh no!";

        
    }

    static void enterCompetition(){
        iWillNotCheat = false;
    }
}
