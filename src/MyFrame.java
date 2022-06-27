import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class MyFrame extends JFrame{

    Calendar calendar;
    SimpleDateFormat timeFormat;

    JLabel timeLabel;
    JLabel dayLabel;
    String time;
    int day;
    int month;
    int year;

    String data;
    MyFrame(){


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Relógio");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");

        timeLabel = new JLabel();
        dayLabel = new JLabel();


        timeLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        time = timeFormat.format(Calendar.getInstance().getTime());

        day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        month = Calendar.getInstance().get(Calendar.MONTH);
        year = Calendar.getInstance().get(Calendar.YEAR);

        switch(month){
            case 0:
                month = 1;
                break;
            case 1:
                month = 2;
                break;
            case 2:
                month = 3;
                break;
            case 3:
                month = 4;
                break;
            case 4:
                month = 5;
                break;
            case 5:
                month = 6;
                break;
            case 6:
                month = 7;
                break;
            case 7:
                month = 8;
                break;
            case 8:
                month = 9;
                break;
            case 9:
                month = 10;
                break;
            case 10:
                month = 11;
                break;
            case 11:
                month = 12;
                break;
        }

        data = Integer.toString(day) + "/" + Integer.toString(month) + "/" + Integer.toString(year);

        dayLabel.setText(data);
        timeLabel.setText(time);


        this.add(timeLabel);
        this.add(dayLabel);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        setTime();

    }
    public void setTime(){
        while(true) {

            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
