
public class Testar {

	public static void main(String[] args) {
		
		Porta pt = new Porta();
		
		pt.setDimensaoX(1);
		pt.setDimensaoY(2);
		pt.setDimensaoZ(3);
		
		pt.fecha();
		pt.abre();
		pt.estaAberta();
		pt.setCor("Amarelo");
		pt.pintar();
		

	
	Casa cs = new Casa();
	
	cs.pt1.setDimensaoX(6);
	cs.pt2.setDimensaoY(4);
	cs.pt3.setDimensaoZ(5);
	cs.pt1.setCor("Vermelho");
	cs.pt2.setCor("Azul");
	cs.pt3.setCor("Verde");
	cs.setCor("Preto");
	cs.pt1.abre();
	cs.pt2.abre();
	cs.pt3.fecha();
	System.out.println("Cor: "+cs.getCor());
	System.out.println("Quantidade de portas abertas: "+cs.quantasPortasEstaoAbertas());
	
	Edificio ed = new Edificio();
	
	System.out.println("Quantidade de portas abertas: "+ed.quantasPortasEstaoAbertas());
	
	
	
	}

}
