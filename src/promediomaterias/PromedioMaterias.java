

package promediomaterias;

import java.util.Scanner;

/**
 *
 * @author ferch
 */
public class PromedioMaterias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      System.out.println("MATERIAS");
      System.out.println("a.Matematicas");
      System.out.println("b.Español");
      System.out.println("c.Ingles");
      
      double n1,n2,n3,Mat=0,Esp=0,Ing=0,Prom;
      int estudiante,cont2=1,cont3 = 1;
      char menu= entrada.next().charAt(0);
      
      switch(menu)
      {
          case 1:
              System.out.println("Matematicas:");
              System.out.println("Ingresa el numero total de estudiantes en esta materia:");
              
              estudiante= entrada.nextInt();
              
              for(int cont=1; cont<=estudiante;cont++)
              {
                System.out.println("Ingrese nota  del estudiante:"+cont+ "");
                n1=entrada.nextDouble();
                Mat=Mat+n1;
              }
              Prom=Mat/estudiante;
              System.out.println("El promedio del grupo de matematicas es:"+Prom);
              break;
              
         
    } 
    }
    
}
