package ComposantInterfaceGraphique;

import javax.swing.*;
import javax.swing.JTree.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

public class MonTreeModele extends DefaultTreeModel
{

    public MonTreeModele(TreeNode root)
    {
        super(root);
    }
}
