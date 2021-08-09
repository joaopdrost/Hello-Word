public class HelloWorld1{
public static void main(String[] args) {
	String mensagem = new HelloWorld1().retornaMensagem();
	System.out.println(mensagem);
}

public String retornaMensagem(){
	return ("Hello World");
}
}