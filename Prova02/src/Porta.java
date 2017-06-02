
public class Porta {
	public boolean aberta;
	public String cor;
	public int dimensaoX,dimensaoY,dimensaoZ;
	
	Porta(){
		
		
	}
	
	public void abre(){
		aberta = true;
		
	}
	public void fecha(){
		aberta = false;
	}
	public String pintar(){
		return cor;
	}
	public void estaAberta(){
		if (aberta == true){
			System.out.println("Esta aberta");
		}else{
			System.out.println("Esta fechada");
		}
	}
	public boolean isAberta() {
		return aberta;
	}
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getDimensaoX() {
		return dimensaoX;
	}
	public void setDimensaoX(int dimensaoX) {
		this.dimensaoX = dimensaoX;
	}
	public int getDimensaoY() {
		return dimensaoY;
	}
	public void setDimensaoY(int dimensaoY) {
		this.dimensaoY = dimensaoY;
	}
	public int getDimensaoZ() {
		return dimensaoZ;
	}
	public void setDimensaoZ(int dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}
	
	
	
	
}
