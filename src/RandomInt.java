// Tehtävä 18

import java.util.ArrayList;
import java.util.Random;
import btree.BinaryTree;
import btree.Node;


public class RandomInt {
    
    private final int MAX_ITEMS = 100000;
    
    private static final char[] symbols;
    private final Random random = new Random();

    static {
        StringBuilder tmp = new StringBuilder();
        for (char ch = '0'; ch <= '9'; ++ch)
          tmp.append(ch);
        symbols = tmp.toString().toCharArray();
    }   

    public String getRandomIntAsString(int length) {
        char[] buf;
        buf = new char[length];

        for (int idx = 0; idx < buf.length; ++idx) 
          buf[idx] = symbols[random.nextInt(symbols.length)];
        return new String(buf);
    }

    void testAsBinaryTree()
    {
        BinaryTree tree = new BinaryTree();
     
        int added = 0;
        do
        {
            String s = getRandomIntAsString(6);
            Node existing = tree.find(s);
            if(existing != null)
            {
                continue;
            }
            
            tree.insert(s);
            // System.out.println(tree.find(s).getData());
            
            added ++;
            
        }while(added < MAX_ITEMS);
    }


    void testAsArray()
    {
        ArrayList< String > table = new ArrayList < String >();
        
        int added = 0;
        do
        {
            String s = getRandomIntAsString(6);
            boolean found = false;
            
            for(int i=0; i < table.size(); i ++)
            {
                if(table.get(i) == s)
                {
                    found = true;
                    break;
                }
            }

            if(found)
            {
                continue;
            }
            
            table.add(s);
            
            added ++;
            
        }while(added < MAX_ITEMS);
    }


    public static void main(String[] args) {
        RandomInt rndInt = new RandomInt();
        
        long startTime, stopTime;
        
        startTime = System.nanoTime();
        rndInt.testAsBinaryTree();
        stopTime = System.nanoTime();
        System.out.println(String.format("as binary tree %d",stopTime - startTime));
        
        startTime = System.nanoTime();
        rndInt.testAsArray();
        stopTime = System.nanoTime();
        System.out.println(String.format("as array %d", stopTime - startTime));
      
      /*
      as binary tree 85510400
      as array 3929200900
      */
    }

}