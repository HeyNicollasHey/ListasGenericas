package Main;
import Model.ListaDeDesejos;
import Model.ProdutoModel;
import Model.ListaDeDesejos;
import Model.ProdutoModel;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ListaDeDesejos<ProdutoModel> lanchonete = new ListaDeDesejos<>();

        ProdutoModel pastel = new ProdutoModel("Hamburger",7.50,5,30);

       lanchonete.add(pastel);
        System.out.println(lanchonete);
        System.out.println(lanchonete.size());

        lanchonete.remove(pastel);
        System.out.println(lanchonete);
        System.out.println(lanchonete.size());


    }
}