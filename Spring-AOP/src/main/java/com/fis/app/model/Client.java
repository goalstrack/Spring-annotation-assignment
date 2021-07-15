package com.fis.app.model;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Client {
	
	@Value("Mehta traders")
	private String clientName;
	
	@Value("123")
	private int clientId;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String clientName, int clientId) {
		super();
		this.clientName = clientName;
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(clientId, clientName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return clientId == other.clientId && Objects.equals(clientName, other.clientName);
	}
	@Override
	public String toString() {
		return "Client [clientName=" + clientName + ", clientId=" + clientId + "]";
	}
	
	
}
