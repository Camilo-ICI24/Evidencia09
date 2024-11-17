package PrincipalCafeteria;

import java.util.ArrayList;
import java.util.List;

public class Cafe {

	private Cafeteria cafeteria;
	private int gramosCafe;
	private int mililitrosAgua;
	private Tamaño tamanoCafe;
	private ArrayList<IngredientesCafe> ingrediente;

	public Cafe(int gramosCafe, int mililitrosAgua, Tamaño tamanoCafe){
		this.gramosCafe = gramosCafe;
		this.mililitrosAgua = mililitrosAgua;
		this.tamanoCafe = tamanoCafe;
		this.ingrediente = new ArrayList<IngredientesCafe>();
	}
	public int getGramosCafe() {
		return this.gramosCafe;
	}
	public void setGramosCafe(int gramosCafe) {
		this.gramosCafe = gramosCafe;
	}

	public int getMililitrosAgua() {
		return this.mililitrosAgua;
	}
	public void setMililitrosAgua(int mililitrosAgua) {
		this.mililitrosAgua = mililitrosAgua;
	}

	public Tamaño getTamanoCafe() {
		return this.tamanoCafe;
	}

	public void setTamanoCafe(Tamaño tamanoCafe) {
		this.tamanoCafe = tamanoCafe;
	}
	public boolean agregarIngrediente(IngredientesCafe ingredienteNuevo) {
		if (ingrediente.size() > 3){
			for(IngredientesCafe ingredienteCafe: ingrediente){
				if (ingredienteCafe.equals(ingredienteNuevo)){
					return false;
				}
			}
		}
		ingrediente.add(ingredienteNuevo);
		return true;
	}
	public boolean eliminarIngrediente(IngredientesCafe ingredienteEliminado){
		for(IngredientesCafe ingredienteCafe : ingrediente){
			if(ingredienteEliminado.equals(ingredienteCafe)){
				ingrediente.remove(ingredienteCafe);
				return true;
			}
		}return false;
	}
	@Override
	public String toString() {
		String ingredientes = "";
		for(IngredientesCafe ingrediente1: this.ingrediente){
			ingredientes = ingrediente1.toString()+" ";
		}
		return "Gramos de cafe: "+this.gramosCafe+" Mililitros de agua: "+this.mililitrosAgua+" Tamaño del cafe: "+this.tamanoCafe+" Igredientes extra: "+ingredientes;
	}
}