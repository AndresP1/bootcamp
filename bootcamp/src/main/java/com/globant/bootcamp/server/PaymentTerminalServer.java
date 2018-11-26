package com.globant.bootcamp.server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.List;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class PaymentTerminalServer {

	private List<String> payments;

	public PaymentTerminalServer(List<String> payments) {
		this.payments = payments;
		startServer();
	}

	private void startServer() {
		int port = 9000;
		HttpServer server;
		try {
			server = HttpServer.create(new InetSocketAddress(port), 0);
			System.out.println("server started at " + port);
			server.createContext("/payments", new HttpHandler() {

				@Override
				public void handle(HttpExchange he) throws IOException {
					String json = "[" ;
					for(String payment : payments)
					{
						json += "\"" + payment + "\"" +  ",";
					}
						
					json = json.substring(0, json.length() - 1);
					json += "]" ;
					
					he.sendResponseHeaders(200, json.length());
					he.getResponseHeaders().add("Content-Type", "application/json; charset=utf-8");
					OutputStream os = he.getResponseBody();
					os.write(json.getBytes());
					
					os.close();
				}
			});
			
			server.setExecutor(null);
			server.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
