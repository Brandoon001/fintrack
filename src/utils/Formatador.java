/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author brandoon
 */
import java.text.NumberFormat;
import java.util.Locale;

public class Formatador {
    public static String formatarMoeda(double valor){
        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
                return formato.format(valor);
    }
}
