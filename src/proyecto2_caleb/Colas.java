
package proyecto2_caleb;

/**
 *
 * @author Caleb
 */
public class Colas {
    
    private static final int MaxCola = 10;
    private static int frente;
    private static int ultimo;
    private int []cola;

    public Colas() {
        frente = 0;
        ultimo = 0;
        cola = new int [MaxCola];
    }
    
    public void InsertarCola()
    {
        if(Llena()) {
            //Cuando pasa de insertan 10 veces en cajas diferentes empieza a tirar este mensaje
            //System.out.println("!LA COLA ESTÁ LLENA!");
        }
        else {
            int info;
            info = 1;  
            
            ultimo++; 
            cola[ultimo] = info;              
        }
    }

    public void Atender() {
        if (Vacia()) {
            System.out.println("LA COLA ESTÁ VACÍA");
        } else {
            for (int i = frente; i < ultimo; i++) {
                cola[i] = cola[i + 1];
            }
            ultimo--;
        }
    }

    public boolean Llena() {
    return ultimo == MaxCola - 1;
    }
 
    public boolean Vacia() {
    return frente > ultimo;
    }
    
    public int Cantidad(){
    return ultimo;
    }
}
