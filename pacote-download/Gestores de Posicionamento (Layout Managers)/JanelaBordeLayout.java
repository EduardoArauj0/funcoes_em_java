import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.GridLayout;
    
public class JanelaBordeLayout extends JFrame{

    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    
        public JanelaBordeLayout(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Janela GridLayout");
        
            this.setLayout(new GridLayout(2,3));
            
            this.iniciarComponentes();
            
            this.pack();
            this.setVisible(true);
        }
    
        public void iniciarComponentes(){
    
            btn01 = new JButton("Botão 01");
            btn02 = new JButton("Botão 02");
            btn03 = new JButton("Botão 03");
            btn04 = new JButton("Botão 04");
            btn05 = new JButton("Botão 05");
        
            this.add(btn01, BorderLayout.PAGE_START);
            this.add(btn02, BorderLayout.PAGE_END);
            this.add(btn03, BorderLayout.LINE_START);
            this.add(btn04, BorderLayout.LINE_END);
            this.add(btn05, BorderLayout.CENTER);
    
    }
}

