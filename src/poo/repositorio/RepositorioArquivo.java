package poo.repositorio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import poo.consulta.Consulta;
;

public class RepositorioArquivo {

	public void gravar(Consulta consulta) throws IOException {	
		FileWriter file = new FileWriter("consultas.txt", true);
		BufferedWriter buffer = new BufferedWriter(file);
		buffer.append(consulta.getCodigoConsulta() +","+
				consulta.getCodigoMedico() +","+
				consulta.getNomeMedico() +","+
				consulta.getCodigoEspecialidade() +","+
				consulta.getNomeEspecialidade() +","+
				consulta.getNomePaciente() +","+
				consulta.getCodigoDoenca() +","+
				consulta.getNomeDoenca() +","+
				consulta.getDataConsulta() +","+
				consulta.getHoraConsulta() +","+
				consulta.getCodigoPlano() +","+
				consulta.getNomePlano()+"\r\n");
		buffer.close();
		file.close();
	}
	
	public List<Consulta> getConsultas() throws IOException {
		FileReader file = new FileReader("consultas.txt");
		BufferedReader buffer = new BufferedReader(file);
		List<Consulta> consultas = new ArrayList<Consulta>();
		String linha = buffer.readLine();
		while(linha != null) {
			String dadosConsultas[] = linha.split(","); 
			Consulta consulta = new Consulta(Integer.parseInt(dadosConsultas[0]), 
											Integer.parseInt(dadosConsultas[1]),
											dadosConsultas[2],
											Integer.parseInt(dadosConsultas[3]),
											dadosConsultas[4],
											dadosConsultas[5],
											Integer.parseInt(dadosConsultas[6]),
											dadosConsultas[7],
											dadosConsultas[8],
											dadosConsultas[9],
											Integer.parseInt(dadosConsultas[10]),
											dadosConsultas[11]);
			consultas.add(consulta);
			linha = buffer.readLine();
		}
		buffer.close();
		file.close();
		return consultas;
	}
}
