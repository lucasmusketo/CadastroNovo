package aula;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CadastroPF extends JFrame{
	
	JLabel  lblNome   = new JLabel ("Nome");
	JTextField txtNome = new JTextField();
	
	JLabel  lblEnd   = new JLabel ("Endereço");
	JTextField txtEnd = new JTextField();
	
	JLabel  lblBairro   = new JLabel ("Bairro");
	JTextField txtBairro = new JTextField();
	
	JLabel  lblCEP   = new JLabel ("CEP");
	JTextField txtCEP = new JTextField();
	
	JLabel  lblCid   = new JLabel ("Cidade");
	JTextField txtCid = new JTextField();
	
	JLabel  lblEst   = new JLabel ("Estado");
	JTextField txtEst = new JTextField();
	
	JLabel  lblTel   = new JLabel ("Telefone");
	JTextField txtTel = new JTextField();
	
	JLabel  lblCel   = new JLabel ("Celular");
	JTextField txtCel = new JTextField();
	
	JLabel  lblSex   = new JLabel ("Sexo");
	JTextField txtSex = new JTextField();
	
	JLabel  lblRg   = new JLabel ("RG");
	JTextField txtRg = new JTextField();
	
	JLabel  lblCPF   = new JLabel ("CPF");
	JTextField txtCPF = new JTextField();
	
	JButton btnCAD = new JButton ("Cadastrar");
	
	private JRadioButton [] rdnSexo = new JRadioButton [2];
	ButtonGroup Grupo = new ButtonGroup();
	
	private JComboBox Estado = new JComboBox();
	
	public CadastroPF(){
		super("Cadastro de Pesssoa Fisica");
		
		 Container paine = this.getContentPane();
		 this.setLayout(null); 
		 
		 paine.add(lblNome);
		 lblNome.setBounds(20,20,245,40);
		 paine.add(txtNome);
		 txtNome.setBounds(80,25,150,25);
		 
		 paine.add(lblEnd);
		 lblEnd.setBounds(20,70,245,40);
		 paine.add(txtEnd);
		 txtEnd.setBounds(80,75,150,25);
		 
		 paine.add(lblBairro);
		 lblBairro.setBounds(20,125,245,40);
		 paine.add(txtBairro);
		 txtBairro.setBounds(80,130,150,25);
		 
		 paine.add(lblCEP);
		 lblCEP.setBounds(20,175,245,40);
		 paine.add(txtCEP);
		 txtCEP.setBounds(80,180,150,25);
		 
		 paine.add(lblCid);
		 lblCid.setBounds(20,225,245,40);
		 paine.add(txtCid);
		 txtCid.setBounds(80,230,150,25);
		 
		 paine.add(lblEst);
		 lblEst.setBounds(20,270,245,40);
		 paine.add(Estado);		 
		 Estado.setBounds(80,275,150,25);
		 Estado.addItem("AC"); Estado.addItem("AL");
		 Estado.addItem("AP"); Estado.addItem("AM");
		 Estado.addItem("BA"); Estado.addItem("CE");
		 Estado.addItem("DF"); Estado.addItem("ES");
		 Estado.addItem("GO"); Estado.addItem("MA");
		 Estado.addItem("MT"); Estado.addItem("MS");
		 Estado.addItem("MG	"); Estado.addItem("PA");
		 Estado.addItem("PB"); Estado.addItem("PR");
		 Estado.addItem("PE"); Estado.addItem("PI");
		 Estado.addItem("RJ"); Estado.addItem("RN");
		 Estado.addItem("RS"); Estado.addItem("RO");
		 Estado.addItem("RR"); Estado.addItem("SC");
		 Estado.addItem("SP"); Estado.addItem("SE");
		 Estado.addItem("TO"); 
		 
		 paine.add(lblTel);
		 lblTel.setBounds(20,325,245,40);
		 paine.add(txtTel);
		 txtTel.setBounds(80,330,150,25);
		 
		 paine.add(lblCel);
		 lblCel.setBounds(20,375,245,40);
		 paine.add(txtCel);
		 txtCel.setBounds(80,380,150,25);
		 
		 rdnSexo[0] = new JRadioButton("Masculino");
		 rdnSexo[1] = new JRadioButton("Feminino");
		 
		 Grupo.add(rdnSexo[0]);
		 Grupo.add(rdnSexo[1]);
		 
		 paine.add(lblSex);
		 lblSex.setBounds(20,425,245,40);
		 paine.add(rdnSexo[0]);
		 rdnSexo[0].setBounds(80,430,120,25);
		 paine.add(rdnSexo[1]);
		 rdnSexo[1].setBounds(200,430,300,25);
		 
		 
		 paine.add(lblRg);
		 lblRg.setBounds(20,470,245,40);
		 paine.add(txtRg);
		 txtRg.setBounds(80,475,150,25);
		 
		 paine.add(lblCPF);
		 lblCPF.setBounds(20,520,245,40);
		 paine.add(txtCPF);
		 txtCPF.setBounds(80,525,150,25);
		 
		 paine.add(btnCAD);
		 btnCAD.setBounds(160,600,245,40);
		
	
		 this.setVisible(true); 
		 this.setSize(600,800);
		 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main (String args[]){
		CadastroPF CadPF = new CadastroPF();
	}
}