import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class inserirRemover extends JFrame {

	JList lista1, lista2;
	DefaultListModel modelo1, modelo2;
	JButton btnRemover;
	String cidades[] = { "Miami Beach", "São Paulo", "Cancun", "Rio de Janeiro", "Salvador", "Guararapes", "Bora-Bora",
			"Maldivas" };

	public inserirRemover() {
		super("Uso de classe JList");

		Container tela = getContentPane();
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		tela.setLayout(layout);

		Tratador trat = new Tratador();

		modelo1 = new DefaultListModel();
		modelo2 = new DefaultListModel();

		for (int i = 0; i < cidades.length; i++) {
			modelo1.addElement(cidades[i]);
		}
		
		lista1 = new JList(modelo1);
		lista1.setVisibleRowCount(5);
		lista1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		lista2 =  new JList(modelo2);
		lista2.setVisibleRowCount(5);
		lista2.setFixedCellWidth(120);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
