/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componente;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author elena
 */
public class FechaHoraDigital extends JLabel implements Serializable {

    private boolean formato24h;

    private String fechaHora;
    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public FechaHoraDigital() {
        this.crearHora();

        // Timer t = new Timer(1000, this);
        //t.start();
    }

    private void crearHora() {

        Calendar calendario = Calendar.getInstance();
        int day, month, year;

        day = calendario.get(Calendar.DAY_OF_MONTH);
        month = calendario.get(Calendar.MONTH);
        year = calendario.get(Calendar.YEAR);
        String fecha = day + "/" + month + "/" + year;

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                int seconds, minutes, hours;
                //verificamos si el formato de la hora debe ser 24 horas o 12 horas
                if (formato24h == true) {
                    hours = calendario.get(Calendar.HOUR_OF_DAY);
                } else {
                    hours = calendario.get(Calendar.HOUR);
                }
                //almacenamos los minutos y segundos del sistema en las variables.
                minutes = calendario.get(Calendar.MINUTE);
                seconds = calendario.get(Calendar.SECOND);

                //establecemos el texto del componente, evaluaremos si se ha seleccionado formato horario de 24 horas o 12 horas.
                //en el caso de ser formato 12 horas, usamos la instancia de la clase calendar para saber si es am o pm
                String hora = Integer.toString(hours) + ":" + Integer.toString(minutes) + ":" + Integer.toString(seconds);
                fechaHora = fecha + " " + hora;
                if (!formato24h) {
                    if (calendario.get(Calendar.AM_PM) == 0) {
                        hora += " A.M";
                    } else {
                        hora += " P.M";
                    }
                }
            }

        }, 0, 1000);
        this.setText(fechaHora);

    }

}
