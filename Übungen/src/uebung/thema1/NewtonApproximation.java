package uebung.thema1;

public class NewtonApproximation {

    private float eps = (float) 0.00000008;

    private float q = 1;

    public void berechne(float zahl){

        while (Math.abs(zahl-(this.q*this.q)) > eps) {
            this.q = (this.q+(zahl/this.q))/2;
        }
        
        float w = (float) Math.sqrt(zahl);

        System.out.println("Die Quadratwurzel nach Newton lautet: " + q);
        System.out.println("Die Quadratwurzel nach Math lautet: " + w);
    }
}
