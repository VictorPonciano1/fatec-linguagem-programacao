package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frmSomaDeValores;
	private JTextField N1;
	private JTextField N2;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmSomaDeValores.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}
	public static int somarValores(int num1, int num2) {
		int res;
        res=num1+num2;
        return(res);	        		
	}
	public static int subtrairValores(int num1, int num2) {		
		int res;
		res=num1-num2;
		return(res);    		
	}
	public static int multiplicarValores(int num1, int num2) {		
		int res;
		res=num1*num2;
		return(res);    		
	}
	/*public static int dividirValores(int num1, int num2) {		
		int res;
	    res=num1/num2;
	    return(res);    		
	}*/	
	public static int dividirValores(int num1, int num2) 
			throws ArithmeticException{
		return num1/num2;
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSomaDeValores = new JFrame();
		frmSomaDeValores.setTitle("Calculadora");
		frmSomaDeValores.setBounds(100, 100, 739, 463);
		frmSomaDeValores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSomaDeValores.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informe dois números e escolha a operação aritmética");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(165, 54, 490, 28);
		frmSomaDeValores.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número 1:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(114, 137, 116, 28);
		frmSomaDeValores.getContentPane().add(lblNewLabel_1);
		
		N1 = new JTextField();
		N1.setBounds(207, 143, 144, 20);
		frmSomaDeValores.getContentPane().add(N1);
		N1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Número 2:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(114, 192, 77, 14);
		frmSomaDeValores.getContentPane().add(lblNewLabel_2);
		
		N2 = new JTextField();
		N2.setBounds(207, 186, 144, 20);
		frmSomaDeValores.getContentPane().add(N2);
		N2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(117, 239, 86, 14);
		frmSomaDeValores.getContentPane().add(lblNewLabel_3);
		
		result = new JTextField();
		result.setEditable(false);
		result.setBounds(207, 238, 474, 20);
		frmSomaDeValores.getContentPane().add(result);
		result.setColumns(10);
		
		JButton btnNewButton = new JButton("Somar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int retorno;				
				try{
				    retorno = somarValores(Integer.parseInt(N1.getText()),Integer.parseInt(N2.getText()));
				    result.setText(String.valueOf(retorno));
			    }catch (NumberFormatException erro1) {
			    	  result.setText("Digite valores válidos. Não se pode inserir letras, informe apenas números");
			    }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(165, 330, 97, 23);
		frmSomaDeValores.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				N1.setText("");
				N2.setText("");
				result.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(280, 375, 89, 23);
		frmSomaDeValores.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sair");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(416, 375, 89, 23);
		frmSomaDeValores.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Dividir");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numerador, denominador, resultado;
				try{
			        numerador = Integer.parseInt(N1.getText());
			        denominador = Integer.parseInt(N2.getText());
			        resultado = dividirValores(numerador, denominador);
			        result.setText(String.valueOf(resultado));

			      }catch (NumberFormatException erro1) {
			    	  result.setText("Digite valores válidos. Não se pode inserir letras, informe apenas números");
			      }catch(ArithmeticException erro2){
			    	  result.setText("O divisor deve ser diferente de 0");
			      }
			}
		});
		btnNewButton_3.setBounds(507, 329, 108, 25);
		frmSomaDeValores.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Subtrair");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int retorno;
				try {
				   retorno = subtrairValores(Integer.parseInt(N1.getText()),Integer.parseInt(N2.getText()));
				   result.setText(String.valueOf(retorno));
			    }catch (NumberFormatException erro1) {
			       result.setText("Digite valores válidos. Não se pode inserir letras, informe apenas números");
			    }
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_4.setBounds(272, 330, 97, 23);
		frmSomaDeValores.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Multiplicar");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int retorno;	
				try {
				      retorno = multiplicarValores(Integer.parseInt(N1.getText()),Integer.parseInt(N2.getText()));
				      result.setText(String.valueOf(retorno));
			    }catch (NumberFormatException erro1) {
			    	  result.setText("Digite valores válidos. Não se pode inserir letras, informe apenas números");
			    }
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_5.setBounds(379, 330, 116, 23);
		frmSomaDeValores.getContentPane().add(btnNewButton_5);
	}

}
