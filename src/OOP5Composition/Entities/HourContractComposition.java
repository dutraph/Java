package OOP5Composition.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HourContractComposition {
    private Date date;
    private Double valuePerHour;
    private Integer hour;

    public HourContractComposition() {
    }
//    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public HourContractComposition(Date date, Double valuePerHour, Integer hour) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public double totalValue(){
        return this.hour * this.valuePerHour;
    }
}
