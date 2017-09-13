package aula;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CadastroPF extends JFrame{
	
	JLabel  lblNome   = new JLabel ("Nome");
	JTextField txtNome = new JTextField();
	
	JLabel  lblEnd   = new JLabel ("Endereço");
	JTextField txtEnd = new JTextField();
	
	JLabel  lblBairro   = new JLabel ("Bairro");
	JTextField txtBairro = new JTextField();
	
	MaskFormatter formatCEP = null;
	JLabel  lblCEP   = new JLabel ("CEP");
	JFormattedTextField txtCEP = null;
	
	JLabel  lblCid   = new JLabel ("Cidade");
	JTextField txtCid = new JTextField();
	
	JLabel  lblEst   = new JLabel ("Estado");
	JTextField txtEst = new JTextField();
	
	
	MaskFormatter formatTel = null;
	JLabel  lblTel   = new JLabel ("Telefone");
	JFormattedTextField txtTel = null;
	
	MaskFormatter formatCel = null;
	JLabel  lblCel   = new JLabel ("Celular");
	JFormattedTextField txtCel = null;
	
	JLabel  lblSex   = new JLabel ("Sexo");
	JTextField txtSex = new JTextField();
	
	MaskFormatter formatRG = null;
	JLabel  lblRg   = new JLabel ("RG");
	JFormattedTextField txtRg = null;
	
	MaskFormatter formatCPF = null;
	JLabel  lblCPF   = new JLabel ("CPF");
	JFormattedTextField txtCPF = null;
	
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
		 try {
			 formatCEP = new MaskFormatter("#####-###");
			 txtCEP = new JFormattedTextField(formatCEP);
		 } catch (Exception ex){
			 ex.printStackTrace();
					 
		 }
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
		 
		 try {
			 formatTel = new MaskFormatter("(##)####-####");
			 txtTel = new JFormattedTextField(formatTel);
		 } catch (Exception ex){
			 ex.printStackTrace();
					 
		 }
		 paine.add(txtTel);
		 txtTel.setBounds(80,330,150,25);
		 
		 paine.add(lblCel);
		 lblCel.setBounds(20,375,245,40);
		 
		 try {
			 formatCel = new MaskFormatter("(##)#####-####");
			 txtCel = new JFormattedTextField(formatCel);
		 } catch (Exception ex){
			 ex.printStackTrace();
					 
		 }

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
		 try {
			 formatRG = new MaskFormatter("##.###.###-A");
			 txtRg = new JFormattedTextField(formatRG);
		 } catch (Exception ex){
			 ex.printStackTrace();
					 
		 }
		 paine.add(txtRg);
		 txtRg.setBounds(80,475,150,25);
		 
		 paine.add(lblCPF);
		 lblCPF.setBounds(20,520,245,40);
		 try {
			 formatCPF = new MaskFormatter("###.###.###.##");
			 txtCPF = new JFormattedTextField(formatCPF);
		 } catch (Exception ex){
			 ex.printStackTrace();
					 
		 }
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