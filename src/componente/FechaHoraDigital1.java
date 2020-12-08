/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author elena
 */
public class FechaHoraDigital1 extends JLabel implements Serializable {

    private JLabel fechaHora;
    private boolean formato24h;

    public FechaHoraDigital1() {
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
        // this.setText(fechaHora);
        this.setText(datefinal);
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

}
