package com.example.lab_work.model;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Model {

    @Getter
    public double Capacity1;
    @Getter
    public double Capacity2;
    @Getter
    public double Capacity3;

    public double Epsilon0 = 8.85e-12;

    @Getter
    public double Epsilon = 1.0;
    @Getter
    public double Square;
    @Getter
    public double Distance = 1.0;
    @Getter
    public double Radius1 = 1.0;
    @Getter
    public double Radius2 = 2.0;
    @Getter
    public double Length = 1.0;

    // Расчеты
    public void calculatedCapacity1() {
        if (Distance != 0) {
            this.Capacity1 = (Epsilon * Epsilon0 * Square) / Distance;
        }
    }

    public void calculatedCapacity2() {
        if (Radius1 > 0 && Radius2 > Radius1) {
            this.Capacity2 = (2 * Math.PI * Epsilon * Epsilon0 * Length) / Math.log(Radius2 / Radius1);
        }
    }

    public void calculatedCapacity3() {
        if (Radius2 > Radius1) {
            this.Capacity3 = (4 * Math.PI * Epsilon * Epsilon0 * Radius1 * Radius2) / (Radius2 - Radius1);
        }
    }

}