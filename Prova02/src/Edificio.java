
public class Edificio extends Imovel {
	
	public int totalDePortas,totalDeAndares,portasAbertas,total,total2;
	
	Edificio(){
		
	}
	
	
	public void adicionarPorta(){
		Porta pt1 = new Porta();
		total = total+1;
		Porta pt2 = new Porta();
		total = total+1;
		Porta pt3 = new Porta();
		total = total+1;
		Porta pt4 = new Porta();
		total = total+1;
		Porta pt5 = new Porta();
		total = total+1;
		Porta pt6 = new Porta();
		total = total+1;
	
		pt1.abre();
		pt2.abre();
		pt3.fecha();
		pt4.fecha();
		pt5.abre();
		pt6.fecha();
		
		if (pt1.aberta == true){
			portasAbertas = portasAbertas +1;
		}else{
			
		}
		if (pt2.aberta == true){
			portasAbertas = portasAbertas +1;
		}else {
			
		}
		if (pt3.aberta == true){
			portasAbertas = portasAbertas +1;
		}else {
			
		}
		if (pt4.aberta == true){
			portasAbertas = portasAbertas +1;
		}else{
			
		}
		if (pt5.aberta == true){
			portasAbertas = portasAbertas +1;
		}else {
			
		}
		if (pt6.aberta == true){
			portasAbertas = portasAbertas +1;
		}else{
			
		}
		
		
	}
	
	public int quantasPortasEstaoAbertas(){
		
		
		return portasAbertas;
	}
	
	public int totalDePortas(){
	
		
		return total;
	}
	
	public void adicionarAndar(){
		System.out.println("Andar criado com sucesso!");
		total2 = total2+1;
	}
	public int totalDeAndares(){
	
		return total2;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getTotalDePortas() {
		return totalDePortas;
	}
	public void setTotalDePortas(int totalDePortas) {
		this.totalDePortas = totalDePortas;
	}
	public int getTotalDeAndares() {
		return totalDeAndares;
	}
	public void setTotalDeAndares(int totalDeAndares) {
		this.totalDeAndares = totalDeAndares;
	}
	public int getPortasAbertas() {
		return portasAbertas;
	}
	public void setPortasAbertas(int portasAbertas) {
		this.portasAbertas = portasAbertas;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal2() {
		return total2;
	}
	public void setTotal2(int total2) {
		this.total2 = total2;
	}
	
	

}
