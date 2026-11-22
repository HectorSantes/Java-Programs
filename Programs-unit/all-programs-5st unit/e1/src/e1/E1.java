
package e1;

//Hector caleb Mosqueda Santes N° control 25260872
public class E1 {

    
    public static void main(String[] args) {
        int []numeros ={4,7,1,3,2};
        System.out.print("[");
        for(int i=0;i<numeros.length;i++){
    System.out.print(numeros[i]+"");
    }
    System.out.print("]\n");
    for (int i=0; i<numeros.length -1;i++){
    for(int j=0;j<numeros.length-1;j++){
       if (numeros[j]>numeros[j+1]){
       int temp= numeros[j];
       numeros[j]=numeros[j+1];
       numeros[j+1]=temp;
       }
    }
    }
    System.out.print("[");
    for(int i=0;i<numeros.length;i++){
    System.out.print(numeros[i]+"");
    
    }
    
    System.out.print("]");
    
    
    
    }
    
}
