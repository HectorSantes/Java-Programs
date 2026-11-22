
package e3;

/**
 *
 * @author Hector caleb Mosqueda Santes N° control 25260872
 */
public class E3 {
    public static void main(String[] args) {
         int numeros[]={4,7,1,3,2};
       int n=numeros.length;
       boolean intercambio;
         
       for(int i=0;i<numeros.length;i++){
       System.out.println("["+numeros[i]+"]");
    
       }
        System.out.println("--Buuble ordenado optimizado boolean");
       for(int i=0;i<n-1;i++){
           intercambio=false;
         for(int j=0;j<n-1-i;j++){
         if(numeros[j]>numeros[j+1]){
         int temp=numeros[j];
         numeros[j]=numeros[j+1];
         numeros[j+1]=temp;
         intercambio=true;
         }
         }
          if(intercambio==false){
          break;
          }   
       }
       //salida ordenada
      
       for(int i=0;i<numeros.length;i++){
       System.out.println("["+numeros[i]+"]");
      
       }   
    }
    
}
