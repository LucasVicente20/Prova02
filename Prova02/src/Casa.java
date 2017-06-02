
public class Casa extends Imovel {
	
	public int portasAbertas,total;
	Casa(){
		
	}
	Porta pt1 = new Porta();
	Porta pt2 = new Porta();
	Porta pt3 = new Porta();
	
	
	
	public int quantasPortasEstaoAbertas(){
		if(pt1.aberta == true){
			portasAbertas = portasAbertas +1;
		}else{
			
		}
			
		
		if(pt2.aberta == true){
			portasAbertas = portasAbertas +1;
		}else{
			
		}
			
		
		if(pt3.aberta == true){
			portasAbertas = portasAbertas +1;
			
		}else{
			
		}
			
		return portasAbertas;
		
		
	}
	public int totalDePortas(){
		
		return total;
		
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
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
	
	

}
