import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TesAI extends JFrame implements ActionListener {
    private ArrayList<Pengeluaran> pengeluaranList;
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField tfNominal, tfKeterangan;
    private JTree tree;
    private DefaultTreeModel treeModel;
    private DefaultMutableTreeNode root;

    public TesAI() {
        pengeluaranList = new ArrayList<>();

        // Set up JFrame
        setTitle("Aplikasi Pengeluaran");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLayout(new BorderLayout());

        // Create JPanel for input fields
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        JLabel lblNominal = new JLabel("Nominal:");
        tfNominal = new JTextField(10);
        JLabel lblKeterangan = new JLabel("Keterangan:");
        tfKeterangan = new JTextField(10);
        JButton btnAdd = new JButton("Tambah");
        btnAdd.addActionListener(this);

        inputPanel.add(lblNominal);
        inputPanel.add(tfNominal);
        inputPanel.add(lblKeterangan);
        inputPanel.add(tfKeterangan);
        inputPanel.add(btnAdd);

        // Create JTable for displaying pengeluaran
        String[] columnNames = {"Nominal", "Keterangan"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);

        // Create JTree for organizing pengeluaran
        root = new DefaultMutableTreeNode("Pengeluaran");
        treeModel = new DefaultTreeModel(root);
        tree = new JTree(treeModel);

        // Add components to JFrame
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(new JScrollPane(tree), BorderLayout.WEST);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TesAI();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Tambah")) {
            String nominalStr = tfNominal.getText();
            String keterangan = tfKeterangan.getText();

            if (!nominalStr.isEmpty() && !keterangan.isEmpty()) {
                double nominal = Double.parseDouble(nominalStr);
                Pengeluaran pengeluaran = new Pengeluaran(nominal, keterangan);
                pengeluaranList.add(pengeluaran);
                tableModel.addRow(new Object[]{nominal, keterangan});

                // Add pengeluaran to the tree
                DefaultMutableTreeNode pengeluaranNode = new DefaultMutableTreeNode(pengeluaran);
                treeModel.insertNodeInto(pengeluaranNode, root, root.getChildCount());

                // Clear input fields
                tfNominal.setText("");
                tfKeterangan.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Nominal dan keterangan tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

class Pengeluaran {
    private double nominal;
    private String keterangan;

    public Pengeluaran(double nominal, String keterangan) {
        this.nominal = nominal;
        this.keterangan = keterangan;
    }

    public double getNominal() {
        return nominal;
    }

    public String getKeterangan() {
        return keterangan;
    }
    
    @Override
    public String toString() {
        return "Nominal: " + nominal + " | Keterangan: " + keterangan;
    }
}
