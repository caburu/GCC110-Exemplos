import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/* Esse é um arquivo gerado durante uma aula de Interfaces Gráficas
 * de usuário e eventos. Portanto, ele serve como apoio à aula e deve
 * ser usado em conjunto com os slides.
 *
 * Partes do código estão comentadas e existem trechos com estratégias 
 * diferentes. Pois o código foi alterado durante a aula.
 * 
 * Esse arquivo NÃO deve ser considerado um modelo pois possui diversas
 * opções de implementação, para fins didáticos, e não uma implementação
 * final com a melhor escolha para cada opção.
 */

public class TelaLogin {
	private JFrame janela;
	private JTextField campoLogin;
	private JPasswordField campoSenha;
	private JButton botaoLogin;
	private JButton botaoAjuda;
	private JTextArea areaDeTexto;
	private JTextArea textoDebug;
	
	private JMenuBar barraDeMenu;
	private JMenu menuArquivo;
	private JMenuItem menuAjuda;
	private OuvinteEventos ouvinteEventos; 
	
	public TelaLogin()
	{
		janela = new JFrame("Tela de Login");
//		janela.setPreferredSize(new Dimension(300, 640));
//		janela.setLayout(
//				new BoxLayout(janela.getContentPane(),
//						BoxLayout.Y_AXIS));
		janela.setLayout(new GridLayout(3,2));
		campoLogin = new JTextField();
		campoSenha = new JPasswordField();
		botaoLogin = new JButton("Entrar");
		botaoAjuda = new JButton("Ajuda");
		barraDeMenu = new JMenuBar();
		menuArquivo = new JMenu("Arquivo");
		menuAjuda = new JMenuItem("Ajuda");
		areaDeTexto = new JTextArea();
		areaDeTexto.setPreferredSize(new Dimension(280, 200));
		textoDebug = new JTextArea();
		textoDebug.setPreferredSize(new Dimension(280, 200));
		textoDebug.setBackground(Color.GRAY);
		
		
		areaDeTexto.addMouseListener(new OuvinteEvtMouse());
		
		ouvinteEventos = new OuvinteEventos();
		
		botaoLogin.addActionListener(
				new ActionListener() {					
					@Override public void actionPerformed(ActionEvent arg0) {
						login();						
					}
				});
		
		botaoAjuda.addActionListener(ouvinteEventos);
		menuAjuda.addActionListener(ouvinteEventos);
		
		montarJanela();
	}
	
	private void montarJanela()
	{
		janela.add(new JLabel("Login: ", 
					new ImageIcon("usuario.png"), SwingConstants.LEFT));
		
		janela.add(campoLogin);
		janela.add(new JLabel("Senha: ",
					new ImageIcon("chave.png"), SwingConstants.LEFT));		
		janela.add(campoSenha);
		//janela.add(areaDeTexto);
		//janela.add(textoDebug);
		janela.add(botaoLogin);		
		janela.add(botaoAjuda);
		
		menuArquivo.add(menuAjuda);
		barraDeMenu.add(menuArquivo);
		janela.setJMenuBar(barraDeMenu);;
		
		janela.pack();
	}
	
	public void exibir()
	{
		janela.setVisible(true);
	}
	
	private void login()
	{
		String login = campoLogin.getText();
		String senha = new String(campoSenha.getPassword());
		
		JOptionPane.showMessageDialog(janela, 
			"Login: " + login + ", senha: " + senha);
	}
	
	private class OuvinteEventos implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (arg0.getSource() == botaoLogin)
			{
				String login = campoLogin.getText();
				String senha = new String(campoSenha.getPassword());
				
				JOptionPane.showMessageDialog(janela, 
					"Login: " + login + ", senha: " + senha);
			}
			else if ((arg0.getSource() == botaoAjuda) ||
					 (arg0.getSource() == menuAjuda))
			{
				String nome = JOptionPane.showInputDialog(janela,
					"Digite seu nome");
				
				int resposta = JOptionPane.showConfirmDialog(janela, 
					nome + ", você tem certeza que precisa de ajuda?");
				
				if (resposta == JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(janela,
						"Não acredito, " + nome + "!!!!");
				}
			}
		}
	}
	
	private class OuvinteEvtMouse extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			textoDebug.append("\nClicou!");						
		}
		/*

		@Override
		public void mouseEntered(MouseEvent arg0) {
			textoDebug.append("\nEntrou!");
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			textoDebug.append("\nSaiu!");
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			textoDebug.append("\nPressionou!");
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			textoDebug.append("\nSoltou!");
		}
		*/
	}

}
