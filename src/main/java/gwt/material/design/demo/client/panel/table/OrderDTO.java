package gwt.material.design.demo.client.panel.table;

import java.io.Serializable;

public class OrderDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String user;
	private String name;
	private String version;
	private String price;

	public OrderDTO() {
		// TODO Auto-generated constructor stub
	}

	public OrderDTO(long id, String user, String name, String price) {
		super();
		this.id = id;
		this.user = user;
		this.name = name;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

}
