/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.supervision.manager;

import business.enterprise.ConsumerEnterprise;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.consumer.ConsumerManagerOrganization;
import business.userAccount.UserAccount;
import business.util.inventory.Distributed;
import business.util.item.ItemQuantity;
import business.util.request.RequestItem;
import business.workQueue.PaymentWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author swarag
 */
public class SupervisionManagerViewConsumerDataJPanel extends javax.swing.JPanel {

    private JPanel mainPanel;
    private Network network;

    /**
     * Creates new form SupervisionManagerViewPeopleFed
     */
    public SupervisionManagerViewConsumerDataJPanel(JPanel mainPanel, Network network) {
        initComponents();
        this.mainPanel = mainPanel;
        this.network = network;
        populateFedChart();
        //populateExpensesChart();
    }

    public void populateFedChart() {

        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        int peopleFed = 0;
        double amount = 0;
        double avoided = 0;
        double wastage = 0;

        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e.getEnterpriseType() == Enterprise.EnterpriseType.Consumer) {
                String name = e.getName();

                ConsumerEnterprise ne = (ConsumerEnterprise) e;

                //Wastage Avoided
                for (RequestItem ri : ne.getInventory().getRequestItemList()) {
                    avoided += ItemQuantity.getQuantity(ri.getItemName()) * ri.getQuantity();
                }

                // Wastage
                for (RequestItem ri : ne.getWasteInventory().getRequestItemList()) {
                    wastage += ItemQuantity.getQuantity(ri.getItemName()) * ri.getQuantity();
                }

                // People fed
                for (Distributed d : ne.getDistributedList()) {
                    peopleFed += d.getPeopleFed();
                }

                // Expenses
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    if (o instanceof ConsumerManagerOrganization) {
                        for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                            for (WorkRequest wr : o.getWorkQueue().getWorkRequestList()) {
                                if (wr instanceof PaymentWorkRequest) {
                                    PaymentWorkRequest pwr = (PaymentWorkRequest) wr;
                                    amount += pwr.getCollectionWorkRequest().getDeliveryCost();
                                }
                            }
                        }
                    }
                }

                dataSet.setValue(avoided, name, "Disposal Avoided (in pounds)");
                dataSet.setValue(wastage, name, "Disposal in inventory (in pounds)");
                dataSet.setValue(peopleFed, name, "People Served");
                dataSet.setValue(amount, name, "Expenses Inccured (in $)");

                peopleFed = 0;
                avoided = 0;
                wastage = 0;
                amount = 0;
            }
        }
        JFreeChart chart = ChartFactory.createBarChart("Analysis report for Consumer",
                "Consumer",
                "Values",
                dataSet,
                PlotOrientation.VERTICAL, true, true, false);

        CategoryPlot plot = chart.getCategoryPlot();

        plot.setRangeGridlinePaint(Color.BLACK);
        plot.setBackgroundPaint(Color.WHITE);

        ChartPanel chartPanel = new ChartPanel(chart);
        pnlChartFed.removeAll();
        pnlChartFed.add(chartPanel, BorderLayout.CENTER);
        pnlChartFed.validate();

    }

    /*
    public void populateExpensesChart() {

        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        double amount = 0;

        for (Network n : business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getEnterpriseType() == Enterprise.EnterpriseType.Consumer) {
                    String name = e.getName();
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if (o instanceof ConsumerManagerOrganization) {
                            for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                                for (WorkRequest wr : o.getWorkQueue().getWorkRequestList()) {
                                    if (wr instanceof PaymentWorkRequest) {
                                        PaymentWorkRequest pwr = (PaymentWorkRequest) wr;
                                        amount += pwr.getCollectionWorkRequest().getDeliveryCost();
                                    }
                                }
                            }
                        }
                    }
                    dataSet.setValue(amount, "Expenses Incured", name);
                    amount = 0;
                }
            }
        }

        JFreeChart chart = ChartFactory.createBarChart("Expenses Incured by each Consumer",
                "Consumer",
                "Expenses Incured (in $)",
                dataSet,
                PlotOrientation.VERTICAL, true, true, false);

        CategoryPlot plot = chart.getCategoryPlot();

        plot.setRangeGridlinePaint(Color.BLACK);
        plot.setBackgroundPaint(Color.WHITE);

        ChartPanel chartPanel = new ChartPanel(chart);
        pnlChartExpenses.removeAll();
        pnlChartExpenses.add(chartPanel, BorderLayout.CENTER);
        pnlChartExpenses.validate();

    } */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        pnlChartFed = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(1400, 1000));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblHeader.setText("Supervision Work Area - People Served By Consumer Chart");

        pnlChartFed.setLayout(new java.awt.BorderLayout());

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(pnlChartFed, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(620, 620, 620)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(lblHeader)
                .addGap(32, 32, 32)
                .addComponent(pnlChartFed, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        mainPanel.remove(this);
        layout.previous(mainPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JPanel pnlChartFed;
    // End of variables declaration//GEN-END:variables
}
