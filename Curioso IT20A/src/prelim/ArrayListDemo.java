
package prelim;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main (String[]args){
        
        ArrayList<String>names=new ArrayList<>();
        
        names.add("Kian");
        names.add("Abasolo");
        names.add("tudtud");
        names.set(0, "boy abunda");
        
       // System.out.println(names.getFirst());
        System.out.println(names);
        
        //names.clear();
        
        System.out.println(names.contains("mj"));
        for (int i= 0; i < names.size(); i++){
            System.out.println(names.get(i) + " ");
            
            //names.remove("tudtud");
            
            System.out.println(names.isEmpty());
    }
    }
    
}
