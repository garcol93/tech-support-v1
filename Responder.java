import java.util.Random;
import java.util.HashMap;
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
    HashMap<String, String> respuestasInput;
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

        respuestasInput.put("hola", "hola que tal");
        respuestasInput.put("oferta", "lo siento no me interesa");
        respuestasInput.put("viagra", "gracias pero funciono bien XD");
        respuestasInput.put("importante", "me pondre en contacto contigo lo mas rapido posible");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String input)
    {   
        String respuesta = null;
        respuesta = respuestasInput.get(input);
        if(respuesta == null)
        {
            respuesta = respuestas.get(aleatorio.nextInt(respuestas.size()));
        }      
        return respuesta;
    }
}
