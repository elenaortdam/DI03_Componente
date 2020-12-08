/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author elena
 */
public class FechaHoraDigital extends JLabel implements Serializable {

    private JLabel fechaHora;
    private boolean formato24h;
    private FechaPersonalizada fechaEjecucion;

    public FechaHoraDigital() {
        //   setLayout(new BorderLayout());
        fechaHora = new JLabel();
        fechaHora.setHorizontalAlignment(JLabel.CENTER);
        //fechaHora.setFont(UIManager.getFont("Label.font").deriveFont(Font.BOLD, 48f));
        actualizarReloj();
        //add(fechaHora);

        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarReloj();
             //   ejecutarPrograma();
            }
        });
        timer.setRepeats(true);
        timer.setCoalesce(true);
        timer.setInitialDelay(0);
        timer.start();
    }

    public void actualizarReloj() {

        Calendar calendario = Calendar.getInstance();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        if (!formato24h) {
            dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        }

        String datefinal = dateFormat.format(calendario.getTime());
        this.setText(datefinal);
    }

    private void ejecutarPrograma() {
        /*
        //Si alguno de los campos es nulo no hacemos nada
        if (fechaEjecucion == null || programaEjecutado == null) {
            return;
        }
        long fechaActual = Calendar.getInstance().getTimeInMillis();
   //     long fechaEjecucionPrograma = fechaEjecucion.getCalendar().getTimeInMillis();
      //  if (fechaActual == fechaEjecucionPrograma) {
            Runtime programa = Runtime.getRuntime();
            try {
                programa.exec(programaEjecutado.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
       // }
*/
    }

    public JLabel getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(JLabel fechaHora) {
        this.fechaHora = fechaHora;
    }

    public boolean isFormato24h() {
        return formato24h;
    }

    public void setFormato24h(boolean formato24h) {
        this.formato24h = formato24h;
    }

    public FechaPersonalizada getFechaEjecucion() {
        return fechaEjecucion;
    }

    public void setFechaEjecucion(FechaPersonalizada fechaEjecucion) {
        this.fechaEjecucion = fechaEjecucion;
    }
}
