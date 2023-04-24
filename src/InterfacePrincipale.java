import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.ButtonGroup;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class InterfacePrincipale extends JFrame
{
    private JPanel mainPanel;

    public InterfacePrincipale()
    {
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

        JMenuBar jMenuBar1 = new JMenuBar();
        JMenu jMenu1 = new JMenu();
        JMenuItem jMenuItem1 = new JMenuItem();
        JMenuItem jMenuItem2 = new JMenuItem();
        JMenuItem jMenuItem3 = new JMenuItem();

        jMenu1.setText("Connexion");
        jMenuItem1.setText("Se connecter");
        jMenuItem2.setText("Se déconnecter");
        jMenuItem3.setText("Reset mot de passe");

        jMenuBar1.add(jMenu1);
        jMenu1.add(jMenuItem1);
        jMenu1.add(jMenuItem2);
        jMenu1.add(jMenuItem3);
    }
    //list1 = new JList<>();
    public static void main(String[] args)
    {
        InterfacePrincipale dlm = new InterfacePrincipale();
        //list1.setModel(dlm);
        dlm.setVisible(true);
    }
}
