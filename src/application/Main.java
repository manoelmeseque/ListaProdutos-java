package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produto;
import service.CalcularService;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produto> list = new ArrayList<>();
		
		String path = "in.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String item = br.readLine();
			
			while(item != null) {
				String[] coluna = item.split(",");
				list.add(new Produto(coluna[0], Double.parseDouble(coluna[1])));
				item = br.readLine();
			}
			
			for(Produto p: list) {
				System.out.println(p.getNome() + ", " + p.getPreco());
			}
			
			Produto x = CalcularService.max(list);
			Produto y = CalcularService.min(list);
			
			System.out.println("-------------------------");
			System.out.println("MAX: " + x);
			System.out.println("MIN: " + y);
			System.out.println("-------------------------");
			
			
		}catch(IOException e) {
			System.out.println("Erro: " + e);
		}
		
	}

}
