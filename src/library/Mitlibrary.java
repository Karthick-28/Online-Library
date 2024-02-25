package mitlibrary;

public class Mitlibrary {

    public static void main(String[] args) {

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }
    
}
