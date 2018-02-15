import java.util.Random;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    Random aleatorio;
    HashMap<HashSet<String>, String> respuestasInput;
    ArrayList <String> respuestas;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestasInput = new HashMap<>();
        respuestas = new ArrayList<>();
        respuestas.add(" venga hasta luegoooo");
        respuestas.add(" muy interesante pero....");
        respuestas.add(" estoy ocupado, estoy con Ana");
        respuestas.add(" no me importa");
        respuestas.add(" hablamos mas tarde");

        HashSet<String> set01 = new HashSet<>();
        set01.add("hola");   
        
        HashSet<String> set02 = new HashSet<>();
        set02.add("oferta");
        set02.add("gratis");  
        
        HashSet<String> set03 = new HashSet<>();
        set03.add("viagra");
        set03.add("alargador");
        
        HashSet<String> set04 = new HashSet<>();
        set04.add("importante");
        set04.add("urgente");
        
        respuestasInput.put(set01, "hola que tal");
        respuestasInput.put(set02, "lo siento no me interesa");
        respuestasInput.put(set03, "gracias pero funciono bien XD");
        respuestasInput.put(set04, "me pondre en contacto contigo lo mas rapido posible");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> userInput)
    {   
        String respuesta = null;        
        respuesta = respuestasInput.get(userInput);
        if(respuesta == null)
        {
            respuesta = respuestas.get(aleatorio.nextInt(respuestas.size()));
        }      
        return respuesta;
    }
}
