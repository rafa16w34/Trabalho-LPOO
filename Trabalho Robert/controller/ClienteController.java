package controller;

import javax.swing.JOptionPane;
import model.Cliente;
import service.ClienteService;


public class ClienteController {

    public void cadastro () {

        String nome1 = javax.swing.JOptionPane.showInputDialog("Informe seu nome: ");
        int idade1 = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Informe sua idade: "));
        String empresa1 = javax.swing.JOptionPane.showInputDialog("Qual seu plano de saúde? ");

        ClienteService clienteservice = new ClienteService();
        Cliente cliente = clienteservice.cadastrarCliente(nome1,idade1,empresa1);

        boolean fazEmCasa1 = fazEmCasa(cliente);
        cliente.setFazEmCasa(fazEmCasa1);

        cliente.exibirDados();

    }

    public boolean fazEmCasa(Cliente cliente){

        if (cliente.getPrioridadeIdoso()){

            String resposta = javax.swing.JOptionPane.showInputDialog("Gostaria de fazer exame em casa?\n(Responda com sim ou não)\n");

            if (resposta.equalsIgnoreCase("sim")){


                System.out.format("\n%s prefere fazer seus exames em casa.\n",cliente.getNome());
                javax.swing.JOptionPane.showMessageDialog(null,"\n O(A) " + cliente.getNome() + " prefere fazer seus exames em casa.\n");
                return true;

            }else{

                System.out.format("\n%s prefere fazer seus exames na Cliníca.\n",cliente.getNome());
                javax.swing.JOptionPane.showMessageDialog(null,"\n O(A) " + cliente.getNome() + " prefere fazer seus exames na cliníca.\n");
                return false;

            }

        }else{

            System.out.format("\n%s não tem idade suficiente para poder fazer exames em casa.\n",cliente.getNome());
            javax.swing.JOptionPane.showMessageDialog(null,"\n O(A) " + cliente.getNome() + " não tem idade suficiente para poder fazer seus exames em casa.\n");
            return false;
        }

    }


}
