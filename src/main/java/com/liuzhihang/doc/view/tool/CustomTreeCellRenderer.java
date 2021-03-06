package com.liuzhihang.doc.view.tool;

import com.intellij.ide.util.treeView.NodeRenderer;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class CustomTreeCellRenderer extends NodeRenderer {

    private static final Color Level1 = new Color(92, 184, 92);
    private static final Color Level2 = new Color(240, 173, 78);
    private static final Color Level3 = new Color(217, 83, 79);

    public CustomTreeCellRenderer() {
        loaColor();
    }

    public static void loaColor() {
    }

    public static BufferedImage getResourceBufferedImage(String filePath) {
        if (CustomTreeCellRenderer.class.getClassLoader().getResourceAsStream(filePath) != null) {
            try {
                return ImageIO.read(CustomTreeCellRenderer.class.getClassLoader().getResourceAsStream(filePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return com.intellij.util.ui.UIUtil.createImage(10, 10, 1);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void customizeCellRenderer(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {

        super.customizeCellRenderer(tree, value, selected, expanded, leaf, row, hasFocus);

        DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
//        Question question = (Question) node.getUserObject();
//
//        if (question.getLevel() == null) {
//
//        } else if (question.getLevel() == 1) {
//            setForeground(Level1);
//        } else if (question.getLevel() == 2) {
//            setForeground(Level2);
//        } else if (question.getLevel() == 3) {
//            setForeground(Level3);
//        }
    }
}