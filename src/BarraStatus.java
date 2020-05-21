import javax.swing.*;
import javax.swing.Timer;
import javax.swing.border.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class BarraStatus extends JFrame {

	JLabel horas, data;
	JPanel inferior;
	String diaSemana[] = { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado" };
	String meses[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
			"Outubro", "Novembro", "Dezembro" };

	public BarraStatus() {
		super("Criando uma barra de status");

		Container tela = getContentPane();
		BorderLayout layout = new BorderLayout();
		tela.setLayout(layout);
		
		Border moldura = BorderFactory.createLoweredBevelBorder();

		horas = new JLabel("Horas", JLabel.CENTER);
		horas.setPreferredSize(new Dimension(75, 20));
		horas.setBorder(moldura);

		data = new JLabel("Data", JLabel.CENTER);
		horas.setPreferredSize(new Dimension(215, 20));
		horas.setBorder(moldura);
		
		inferior = new JPanel();
		inferior.setLayout(new FlowLayout(FlowLayout.LEFT,1,0));
		inferior.add(horas);
		inferior.add(data);
		
		tela.add(inferior, BorderLayout.SOUTH);
		
		ActionListener tarefa = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				horasData();
			}
		};
		
		Timer tempo = new Timer(1000, tarefa);
		
		tempo.start();

		setSize(300, 100);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		BarraStatus app = new BarraStatus();
	}
	
	private void horasData() {
		Calendar agora = Calendar.getInstance();
		
		int ho = agora.get(Calendar.HOUR_OF_DAY);
		int mi = agora.get(Calendar.MINUTE);
		int se = agora.get(Calendar.SECOND);
		
		int ds = agora.get(Calendar.DAY_OF_WEEK);
		int dia = agora.get(Calendar.DAY_OF_MONTH);
		int mes = agora.get(Calendar.MONTH);
		int ano = agora.get(Calendar.YEAR);
		
		horas.setText(formatar(ho % 12)+":"+formatar(mi)+":"+formatar(se)+"");
		data.setText(diaSemana[ds-1]+", "+formatar(dia)+" de "+meses[mes]+" de "+ano+"");
	}
	
	private String formatar(int num) {
		DecimalFormat df = new DecimalFormat("00");
		return df.format(num);
	}
	
	
	
	
	

}
