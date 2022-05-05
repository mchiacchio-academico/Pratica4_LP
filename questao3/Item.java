package questao3;

public class Item {

	String item, autor, local, data, descricao;

	public Item(String item, String autor, String local, String data, String descricao) {
		super();
		this.item = item;
		this.autor = autor;
		this.local = local;
		this.data = data;
		this.descricao = descricao;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}