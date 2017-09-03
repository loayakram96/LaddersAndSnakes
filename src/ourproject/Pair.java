/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourproject;

/**
 *
 * @author loay
 */
public class Pair {
    private double x = 0.0;
    private double y = 0.0;

    public Pair(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Pair()
    {

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


}
