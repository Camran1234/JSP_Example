/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mycompany.ejerciciojsp.CalculadoraAritmetica;
import com.mycompany.ejerciciojsp.CalculadoraBinaria;
import com.mycompany.ejerciciojsp.Comparador;

/**
 *
 * @author camran1234
 */
@WebServlet("/Calcular")

public class Informacion extends HttpServlet{
    
    /**
     * Metodo para obtener respuestas
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Devolvemos el formato de nuestras resupuestas
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Resultados</h1>");
        String number1 = request.getParameter("numero1");
        String number2 = request.getParameter("numero2");
        String opcion = request.getParameter("opcion");
        CalculadoraAritmetica calculadoraAritmetica = new CalculadoraAritmetica();
        CalculadoraBinaria calculadoraBinaria = new CalculadoraBinaria();
        Comparador comparador = new Comparador();
        
        
        //Verificamos que opcion coloco el usuario y devolvemos la respuesta
        switch(opcion){
            case "Suma":
                out.println("<h3>SUMA</h3>" + "<p>La suma entre: "+number1+" y "+number2+"</p>"+calculadoraAritmetica.sumarNumeros(number1, number2));
            break;
            case "Resta":
                out.println("<h3>RESTA</h3>" + "<p>La resta entre: "+number1+" y "+number2+"</p>"+calculadoraAritmetica.restarNumeros(number1, number2));
            break;
            case "Multiplicacion":
                out.println("<h3>MULTIPLICACION</h3>" + "<p>La multiplicacion entre: "+number1+" y "+number2+"</p>"+calculadoraAritmetica.multiplicarNumeros(number1, number2));
            break;
            case "Division":
                out.println("<h3>DIVISION</h3>" + "<p>La division entre: "+number1+" y "+number2+"</p>"+calculadoraAritmetica.dividirNumerosNumeros(number1, number2));
            break;
            case "Potencia":
                out.println("<h3>Potencia</h3>" + "<p>La Potencia de "+number1+" elevada a la "+number2+" es: </p>"+comparador.getPowerNumbers(number1, number2));
            break;
            case "Mayor":
                out.println("<h3>Numero Mayor</h3>" + "<p>El numero mayor entre: "+number1+" y "+number2+" es: </p>"+comparador.getMajorNumber(number1, number2));
            break;
            case "Binario":
                out.println("<h3>Numeros Binarios</h3>" + "<h4>"+number1+": "+calculadoraBinaria.parseToBinary(number1)+"</h4>" +
                "<h4>"+number2+": "+calculadoraBinaria.parseToBinary(number2)+"</h4>");
            break;
            
            
        }
    }
}
