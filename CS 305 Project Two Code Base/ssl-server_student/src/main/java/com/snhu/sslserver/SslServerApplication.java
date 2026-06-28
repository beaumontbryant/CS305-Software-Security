package com.snhu.sslserver;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";

@RestController
class ServerController{
//FIXME:  Add hash function to return the checksum value for the data string that should contain your name.    
    @RequestMapping("/hash") // API for hash page
    public String myHash() throws NoSuchAlgorithmException { //exception needed for Java
    	String data = "Hello World Check Sum!";
        String algorithm = "SHA-256"; //chosen algorithm

        MessageDigest digest = MessageDigest.getInstance(algorithm); //creates digest for SHA-256
        byte[] hash = digest.digest(data.getBytes(StandardCharsets.UTF_8)); //converts data to bytes and then hashes and stores in an array
        String checksum = bytesToHex(hash); //stores the checksum as a string after converting from bytes to hex

       
        return "<p>data: "+ data + "<p>Algorithm: " + algorithm + "</p>" + "<p>Checksum: " + checksum + "</p>"; //returns data in html format
    }
    
    private static String bytesToHex(byte[] hash) { //converts bytes to hex
        StringBuilder hexString = new StringBuilder(); //string builder for building the hex

        for (byte b : hash) { //goes through each byte in the passed hash array
            String hex = Integer.toHexString(0xff & b); //converts the byte to its hex value

            if (hex.length() == 1) { //appends a 0 if the hex is 1 character long
                hexString.append('0');
            }

            hexString.append(hex); //pushes to the string builder
        }

        return hexString.toString(); //returns the finished string
    }
}
