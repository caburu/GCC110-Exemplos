/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

/**
 *
 * @author Julio
 */
public class TelaLogin {
    private JFrame janela;
    private JTextField campoLogin;
    private JPasswordField campoSenha;
    private JButton botaoLogin;
    private JButton botaoAjuda;
    private JMenuBar barraMenu;
    private JMenu menuArquivo;
    private JMenuItem menuItemAjuda;
    private JTextArea areaDesenho;
    private JTextArea areaTexto;
    
    public TelaLogin() {
        janela = new JFrame("Tela de Login");        
        campoLogin = new JTextField();
        campoSenha = new JPasswordField();
        botaoLogin = new JButton("Logar");
        botaoAjuda = new JButton("Ajuda");
        barraMenu = new JMenuBar();
        menuArquivo = new JMenu("Arquivo");
        menuItemAjuda = new JMenuItem("Ajuda");
        areaDesenho = new JTextArea();
        areaTexto = new JTextArea();
        
        botaoLogin.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    logar();
                }
            });
        
        
        botaoAjuda.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    exibirAjuda();
                }
            });
        
        
        menuItemAjuda.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    exibirAjuda();
                }
            });
        
        areaDesenho.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                areaTexto.append("clicou\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                 areaTexto.append("começou clique\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                areaTexto.append("terminou clique\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                areaTexto.append("entrou\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                areaTexto.append("saiu\n");
            }
        });
                
        montarJanela();
    }
    
    private void montarJanela() {
        janela.setSize(500, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //janela.setLayout(new FlowLayout());
        //janela.setLayout(new BoxLayout(janela.getContentPane(), BoxLayout.Y_AXIS));
        janela.setLayout(new GridLayout(4, 2));
        
        janela.add(new JLabel("Login: ", new ImageIcon("usuario.png"), SwingConstants.LEFT));
        janela.add(campoLogin);
        janela.add(new JLabel("Senha: ", new ImageIcon("chave.png"), SwingConstants.LEFT));        
        janela.add(campoSenha);
        janela.add(botaoLogin);
        janela.add(botaoAjuda);
        
        menuArquivo.add(menuItemAjuda);
        barraMenu.add(menuArquivo);
        janela.setJMenuBar(barraMenu);
        
        areaDesenho.setBackground(Color.yellow);
        janela.add(areaDesenho);
        janela.add(areaTexto);
        
        janela.pack();
    }
    
    public void exibir() {
        janela.setVisible(true);
    }
    
    private void logar() {
        String login = campoLogin.getText();
        String senha = new String(campoSenha.getPassword());

        JOptionPane.showMessageDialog(janela, "O login eh " + login + " e a senha eh " + senha);
    }
    
    private void exibirAjuda() {
        String nome = JOptionPane.showInputDialog(janela, "Qual é seu nome?");

        int resposta = JOptionPane.showConfirmDialog(janela, nome + ", você precisa mesmo de ajuda????");

        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(janela, "Não acredito!!!");
        }
    }
}
