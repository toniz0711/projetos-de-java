

import javax.swing.JFrame;


public class tela {
        public static void main(String[] args) {
            Drawpanel panel = new Drawpanel();
            
            Jframe appllication = new JFrame();
            
            application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            application.add(panel)

        }

}
