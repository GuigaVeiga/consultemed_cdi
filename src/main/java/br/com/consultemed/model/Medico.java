/**
 * 
 */
package br.com.consultemed.model;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@SuppressWarnings("serial")
@NamedQueries({
	@NamedQuery(name = "Medico.findAllCount", query = "SELECT COUNT(m) FROM Medico m"),
	@NamedQuery(name="Medico.findAll", query="SELECT m FROM Medico m")
})
@Entity
@Table(name="TB_MEDICOS")
public class Medico extends AbstractEntity<Long> {

	
	private int crm;
	private String nomeMedico;
	private String especialidade;
	private String telefone;
	
	public Medico() {

	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
}
