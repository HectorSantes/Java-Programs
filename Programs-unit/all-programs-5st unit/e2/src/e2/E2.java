
package e2;

/**
 * OCn optimizacion segun
 * @author Hector caleb mosqueda Santes N° control 25260872
 */
public class E2 {
    public static void main(String[] args) {
        int numeros[]={4,7,1,3,2};
       int n=numeros.length;
         
       for(int i=0;i<numeros.length;i++){
       System.out.println("["+numeros[i]+"]");
    
       }
        System.out.println("--Buuble ordenado optimizado");
       for(int i=0;i<n-1;i++){
         for(int j=0;j<n-1-i;j++){
         if(numeros[j]>numeros[j+1]){
         int temp=numeros[j];
         numeros[j]=numeros[j+1];
         numeros[j+1]=temp;
         }
         }
             
       }
       //salida ordenada
      
       for(int i=0;i<numeros.length;i++){
       System.out.println("["+numeros[i]+"]");
      
       }
     
    }
    
}
