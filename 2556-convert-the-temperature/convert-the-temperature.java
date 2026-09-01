class Solution {
    public double[] convertTemperature(double c) {
        double r[]=new double[2];
        r[0]=c+273.15;
        r[1]=c*1.80+32.00;
        return r;
    }
}