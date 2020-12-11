/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componente;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
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
    private File filePath;
    private FechaPersonalizada fechaEjecucion;
    
    public FechaHoraDigital() {
        //   setLayout(new BorderLayout());
        fechaHora = new JLabel();
        fechaHora.setHorizontalAlignment(JLabel.CENTER);
        //cargado.setBackground(Color.red);
        //fechaHora.setFont(UIManager.getFont("Label.font").deriveFont(Font.BOLD, 48f));
        actualizarReloj();
        //add(fechaHora);

        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarReloj();
                ejecutarPrograma();
            }
        });
        timer.setRepeats(true);
        timer.setCoalesce(true);
        timer.setInitialDelay(0);
        timer.start();
    }

    public void actualizarReloj() {

        Calendar calendario = Calendar.getInstance();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        if (!formato24h) {
            dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        }

        String datefinal = dateFormat.format(calendario.getTime());
        this.setText(datefinal);
    }

    public void ejecutarPrograma() {

        //Si alguno de los campos es nulo no hacemos nada
        if (fechaEjecucion == null || filePath == null) {
            //this.cargado.setBackground(Color.red);
          //  this.cargado.setText("NO CARGADO");
            return;
        }
        Calendar ejecucionPrograma = fechaEjecucion.getCalendar();
       
       // Calendar fechaActual = Calendar.getInstance();
        Calendar fechaActual = Calendar.getInstance();
       // fechaActual.set(2020, 11, 10, 00, 00);
        if (ejecucionPrograma.get(Calendar.YEAR) != fechaActual.get(Calendar.YEAR)
                || ejecucionPrograma.get(Calendar.MONTH) != fechaActual.get(Calendar.MONTH)
                || ejecucionPrograma.get(Calendar.DAY_OF_MONTH) != fechaActual.get(Calendar.DAY_OF_MONTH)) {
            return;
        }
        if (ejecucionPrograma.get(Calendar.HOUR_OF_DAY) != fechaActual.get(Calendar.HOUR_OF_DAY)
                || ejecucionPrograma.get(Calendar.MINUTE) != fechaActual.get(Calendar.MINUTE)) {
            return;
        }

        Runtime programa = Runtime.getRuntime();
        try {
            programa.exec(filePath.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

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

    public File getFilePath() {
        return filePath;
    }

    public void setFilePath(File filePath) {
        this.filePath = filePath;
    }
}
