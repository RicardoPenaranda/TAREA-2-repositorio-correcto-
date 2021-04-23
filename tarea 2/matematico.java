
public class matematico
{
    public String calculaMayorMenorMedio(int x, int y, int z)
    {
       String mensaje = ""; 
       int numeroMayor = 0;
       int numeroMedio = 0;
       int numeroMenor = 0;
       if(x > y && x > z)
       {
           numeroMayor = x;
       }else
       {
           if(y > x && y > z)
       {
               numeroMayor = y;
       }else
       {
           if(z > x && z > y)  
           {
               numeroMayor = z;
           }   
         }
       }
       if(x < y && x < z)
       {
           numeroMenor = x;
       }else
       {
           if(y < x && y < z)
       {
               numeroMenor = y;
       }else
       {
           if(z < x && z < y)  
           {
               numeroMenor = z;
           }   
         }
       }
       if((x > y && x < z) || (x < y && x > z))
       {
           numeroMedio = x;
       }else
       {
            if((y > x && y < z) || (y < x && y > z))
       {
           numeroMedio = y;
       }else
       {
            if((z > x && z < y) || (z < x && z > y))
       {
           numeroMedio = z;
       }
      } 
    }
       mensaje = "el numeroMenor es" + numeroMenor + "el numeroMedio es" + numeroMedio + "y el numeroMayor es" + numeroMayor;
       return mensaje;
    }
    
    public double Area(double alt, double base)
    {
        double Area = alt * base;
        return Area;
    } 
    public double Distancia(Punto punto1, Punto punto2)
    {
        double distancia = Math.sqrt(Math.pow((punto2.getX()- punto1.getX()),2) + Math.pow((punto2.getY()- punto1.getY()),2));
        return distancia;
    }
    public String Cuadrante(Punto punto)
    {
        String mensaje = "";
        if(punto.getX() > 0 && punto.getY() > 0)
        {
            mensaje = "se encuentra en el primer cuadrante";
        }else
        {
           if(punto.getX() < 0 && punto.getY() > 0)
           {
               mensaje = "se encuentra en el segundo cuadrante";
           } else
           {
                if(punto.getX() < 0 && punto.getY() < 0)
                {
                    mensaje = "se encuentra en el tercer cuadrante";
                }else
                {
                    if(punto.getX() > 0 && punto.getY() < 0)
                    {
                       mensaje = "se encuentra en el cuarto cuadrante"; 
                    }
                }
            }
        }
        return mensaje;
    } 
}
