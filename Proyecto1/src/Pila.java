import java.util.Stack;

public class Pila {
    private Stack<Post> objetoPila;

    public Pila(){
        objetoPila= new Stack<>();
    }


    public void push(Post dato){
        objetoPila.push(dato);
    }

    public Post pop()throws Exception {
        if (objetoPila.isEmpty())
            throw new Exception("Pila sin elementos");
        return objetoPila.pop();
    }

    public Post peek() throws Exception {
        if (objetoPila.isEmpty())
        throw new Exception("No hay elementos en la pila");
        return objetoPila.peek();
    }

    public String showAll(){
        String resultado="";
        for (int i=objetoPila.size()-1; i>=0;i--){
            resultado+=objetoPila.get(i).toString();
        }
        return resultado.length()!=0?resultado:"No existen elementos";
    }

}
