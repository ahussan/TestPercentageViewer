package com.ibm.viewer;
import static spark.Spark.*;

public class Viewer {
    public static void main(String[] args) {
        port(8080);
        get("/", (req, res) -> "Hello World! ✨ It's fun to use sparkly emojis in code!");
    }

}
