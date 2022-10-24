/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Eduardo Mazas
 */
public class Metodos{
    public double[] Rotacion(double punto_x, double punto_y, double angulo){
        double radiandes = Math.toRadians(angulo);
        double sin = Math.sin(radiandes);
        double cos = Math.cos(radiandes);
        //System.out.println("Seno: " + sin);
        //System.out.println("Coseno: " + cos);
        
        double [][] matriz1  = {
            {cos, -sin, 0},
            {sin, cos, 0},
            {0, 0, 1},
        };
        
        double x = punto_x;
        double y = punto_y;
        double z = 1;
        
        double fx = 0;
        double fy = 0;
        double fz = 0;
        for(int i = 0; i<matriz1.length; i++){
            for(int j = 0; j<matriz1.length; j++){
                if(i == 0) {
                    if( j == 0)
                        fx += (x*matriz1[i][j]);
                    if( j == 1)
                        fx += (y*matriz1[i][j]);
                    if( j == 2)
                        fx += (z*matriz1[i][j]);
                }
                if(i == 1) {
                    if( j == 0)
                        fy += (x*matriz1[i][j]);
                    if( j == 1)
                        fy += (y*matriz1[i][j]);
                    if( j == 2)
                        fy += (z*matriz1[i][j]);
                }
                if(i == 2) {
                    if( j == 0)
                        fz += (x*matriz1[i][j]);
                    if( j == 1)
                        fz += (y*matriz1[i][j]);
                    if( j == 2)
                        fz += (z*matriz1[i][j]);
                }
               System.out.print(matriz1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("x =  "+punto_x);
         System.out.println("y =  "+punto_y);
        System.out.println("fx =  "+fx);
         System.out.println("fy =  "+fy);
         System.out.println("fz =  "+fz);
        
       double [] v_primo = {fx, fy, z};
        
        for(int i = 0; i < v_primo.length; i++){
        System.out.println(v_primo[i]);
            }
        
        return v_primo;
    }
    
    //Traslacion
public double[] Traslacion(double punto_x, double punto_y, double tx, double ty){
    double punto_z = 1; 
    
    double [][] matriz1  = {
            {1, 0, punto_x},
            {0, 1, punto_y},
            {0, 0, 1},
        };
    
     double x = tx;
     double y = ty;
     double z = 1;
    
    double fx = 0;
    double fy = 0;
    double fz = 0;
    
    for(int i = 0; i<matriz1.length; i++){
            for(int j = 0; j<matriz1.length; j++){
                if(i == 0) {
                    if( j == 0)
                        fx += (x*matriz1[i][j]);
                    if( j == 1)
                        fx += (y*matriz1[i][j]);
                    if( j == 2)
                        fx += (z*matriz1[i][j]);
                }
                if(i == 1) {
                    if( j == 0)
                        fy += (x*matriz1[i][j]);
                    if( j == 1)
                        fy += (y*matriz1[i][j]);
                    if( j == 2)
                        fy += (z*matriz1[i][j]);
                }
                if(i == 2) {
                    if( j == 0)
                        fz += (x*matriz1[i][j]);
                    if( j == 1)
                        fz += (y*matriz1[i][j]);
                    if( j == 2)
                        fz += (z*matriz1[i][j]);
                }
               System.out.print(matriz1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("fx =  "+fx);
         System.out.println("fx =  "+fy);
         System.out.println("fx =  "+fz);
    
    double [] result = { fx, fy, z };
    
    
    
    return result;
}

    //Proyeccion
public double[] Proyeccion(double punto_x, double punto_y, double sx, double sy){
    double punto_z = 1; 
    double x = (punto_x*sx) + (punto_y*0) + (punto_z*0);
    double y = (punto_x*0) + (punto_y*sy) + (punto_z*0);
    double z = (punto_x*0) + (punto_y*0) + (punto_z*1);
    double [] result = { x, y, z };
    
    for(int i = 0; i < result.length; i++){
        System.out.println(result[i]);
            }
    
    return result;
}
}
