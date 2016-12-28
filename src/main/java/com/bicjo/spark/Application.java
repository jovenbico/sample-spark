package com.bicjo.spark;

import static spark.Spark.get;
import static spark.Spark.port;

public class Application {

	public static void main(String[] args) {
		port(9090);
		get("/hello", (req, res) -> "Halo Mundo");

		new UserHello();
	}

}
