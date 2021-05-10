// Tehtävä 13

import java.util.ArrayList;
import java.lang.Math;


public class HashTable {
    
    final int MAX_HASH_TABLE = 511;
    ArrayList < ArrayList<String> > table;
    
    HashTable()
    {
        table = new ArrayList < ArrayList<String> >();
        for( int i=0; i < MAX_HASH_TABLE; i ++)
            table.add(new ArrayList<String>());
    }

    public void add(String s)
    {
        int index = hashValue(s);
        table.get(index).add(s);
    }
    
    public boolean contains(String s)
    {
        int index = hashValue(s);
        for( int i=0; i < table.get(index).size(); i ++)
            if(table.get(index).get(i) == s)
                return true;
        return false;
    }

    private int hashValue(String s)
    {
        return Math.abs(s.hashCode()) % MAX_HASH_TABLE;
    }

    public void printContains(String s)
    {
        System.out.println(String.format("%s - %s", s, contains(s) ? "yes" : "no"));
    }
 
    public void printAdd(String s)
    {
       add(s); 
       System.out.println(String.format("added %s", s));
    }

    public static void main(String[] args) {
         
        HashTable hashTable = new HashTable();
         
        hashTable.printContains("test");
        hashTable.printAdd("test");
        hashTable.printContains("test");
        hashTable.printAdd("test");
 
         
        hashTable.printAdd("a");
        hashTable.printContains("a");
    }

}