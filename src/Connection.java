import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Connection extends JDialog
{
    private JPanel mainPanel;
    public Connection(JFrame parent,boolean modal,String titre)
    {
        setTitle("login");
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        pack();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screen.width - this.getSize().width) / 2, (screen.height - this.getSize().height) / 2);
    }
}
