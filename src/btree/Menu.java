/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package btree;

/**
 *
 * @author kamaj
 */
public class Menu {

    public static void main(String[] args) {

        //printMenu();
        BinaryTree tree = new BinaryTree(); // luo tyhjä puu

        tree.insert("test123");
        tree.insert("tes");
        tree.insert("t");
        tree.insert("test1");
        tree.insert("test");
        tree.insert("test12");
        tree.insert("test1234");
        tree.insert("te");


        System.out.println(tree.find("test123"));
        tree.delete("test123");
        System.out.println(tree.find("test123"));
    }

    private static void printMenu() {
        char select, select1;
        BinaryTree tree = new BinaryTree(); // luo tyhjä puu
        String data;

        do {
            System.out.println("\n\t\t\t1. Lisää avain");
            System.out.println("\t\t\t2. Etsi avaimella");
            System.out.println("\t\t\t3. Tulosta puu esijärjestyksessä.");
            System.out.println("\t\t\t3. Tulosta puu sisäjärjestyksessä.");
            System.out.println("\t\t\t4. lopetus ");
            System.out.print("\n\n"); // tehdään tyhjiä rivejä
            select = btree.Lue.merkki();
            switch (select) {
            case '1':
                data = new String(btree.Lue.rivi());
                tree.insert(data);
                break;
            case '2':
                data = btree.Lue.rivi();
                //if (tree.find(data)!=null) // löytyykö?

                break;
            case '3':
                tree.preOrder();
                char h = btree.Lue.merkki(); // pysäytetään kontrolli
                break;
            case '4':
                //tree.inOrder();
                break;
            }
        }
        while (select != '4');
    }

}

