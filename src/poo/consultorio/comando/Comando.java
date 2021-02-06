package poo.consultorio.comando;
import java.io.IOException;
import java.util.Scanner;

public interface Comando {
	
	public abstract void execute(Scanner entrada) throws IOException;
}
