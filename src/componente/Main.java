/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componente;

import java.io.File;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author elena
 */
public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, 11, 8, 11, 59, 0);
        FechaPersonalizada fechaPer = new FechaPersonalizada(calendar);
        FechaHoraDigital fecha = new FechaHoraDigital();
        fecha.setFechaEjecucion(fechaPer);
        fecha.setFilePath(new File("C:\\Program Files\\Notepad++\\notepad++.exe"));
        fecha.ejecutarPrograma();
    }
    
}
