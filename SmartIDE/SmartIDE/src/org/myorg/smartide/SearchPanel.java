/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.smartide;

import org.openide.windows.WindowManager;

/**
 *
 * @author Janis
 */
public class SearchPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchPanel
     */
    public SearchPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchText = new javax.swing.JTextField();
        wandLabel = new javax.swing.JLabel();

        searchText.setText(org.openide.util.NbBundle.getMessage(SearchPanel.class, "SearchPanel.searchText.text")); // NOI18N
        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });

        wandLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/myorg/smartide/wand16.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(wandLabel, org.openide.util.NbBundle.getMessage(SearchPanel.class, "SearchPanel.wandLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchText, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wandLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
    
        SmartFixTopComponent smartFix = (SmartFixTopComponent) WindowManager.getDefault().findTopComponent("SmartFixTopComponent");
        
        try
        {
            String keyWord = searchText.getText();
            smartFix.search(keyWord);
        }
        catch(Exception ex)
        {
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField searchText;
    private javax.swing.JLabel wandLabel;
    // End of variables declaration//GEN-END:variables
}
