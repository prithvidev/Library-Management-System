/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class CustomCellRenderer extends JLabel implements TableCellRenderer
            {
                public CustomCellRenderer(Color foregroundColor, Color backgroundColor, Font font, Border border, boolean isOpaque)
                {
                    setFont(font);
                    setOpaque(isOpaque);
                    setForeground(foregroundColor);
                    setBackground(backgroundColor);
                    setBorder(border); 
                   
                    
       //DefaultTableCellRenderer renderer = (DefaultTableCellRenderer)
            //jTable1.getTableHeader().getDefaultRenderer();
        //renderer.setHorizontalAlignment(JLabel.CENTER);
    
                }

    CustomCellRenderer(Color BLACK, Color WHITE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value,
                        boolean isSelected, boolean hasFocus, int row, int column) 
                {
                    setText(value.toString());
                    return this;
                }
}