
package prelim;


public class twoDArray {
    public static void main(String[] args) {
    
        int marks[][] = {
                         
            {77,85,68},
            {98,56,79},
            {78,85,56}
                
        };
        for (int i = 0; i < marks.length; i++){
            for (int j = 0; j < marks[i].length; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    
        
    }
}
