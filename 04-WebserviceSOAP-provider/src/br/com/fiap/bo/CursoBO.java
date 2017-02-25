package br.com.fiap.bo;

public class CursoBO {

	public float calcularMedia(float ps,
							float nac, float am){
		return ps*0.5f + nac*0.2f + am*0.3f;
	}
	
	public String calcularExame(float media, 
			float exame){
		if (media + exame >= 12)
			return "Aprovado";
		else
			return "Reprovado";
	}
	
}