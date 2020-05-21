import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class JSpinnerTest extends JFrame {
	
	JSpinner spinner;
	JButton btnExibir;

	public JSpinnerTest() {
		super("Uso de Controle JSpinner");
		
		Container tela = getContentPane();
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		tela.setLayout(layout);
		
		SpinnerNumberModel modelo = new SpinnerNumberModel(1982,1969,2020,1);
		spinner = new JSpinner(modelo);
		JSpinner.NumberEditor editor = new JSpinner.NumberEditor(spinner,"0000");
		spinner.setEditor(editor);
		
		btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = "Valor Selecionado: " + spinner.getValue();
				JOptionPane.showMessageDialog(null, texto);			
			}
		});
		
		tela.add(new JLabel("Ano de Nascimento"));
		tela.add(spinner);
		tela.add(btnExibir);
		
		setSize(300,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		JSpinnerTest app = new JSpinnerTest();
	}

}
