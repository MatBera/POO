/**
 *
 * @author Bera
 */
public class Aluno {
    private int ra;
    private double ntPrv1;
    private double ntPrv2;
    private double ntTrab1;
    private double ntTrab2;
    
    public void setRA(int num){
        ra = num;
    }
    public void setNtPrv1(double P1){
        ntPrv1 = P1;
    }
    public void setNtPrv2(double P2){
        ntPrv2 = P2;
    }
    public void setNtTrab1(double T1){
        ntTrab1 = T1;
    }
    public void setNtTrab2(double T2){
        ntTrab2 = T2;
    }
    public int getRA(){
        return(ra);
    }
    public double getNtPrv1(){
        return(ntPrv1);
    }
    public double getNtPrv2(){
        return(ntPrv2);
    }
    public double getNtTrab1(){
        return(ntTrab1);
    }
    public double getNtTrab2(){
        return(ntTrab2);
    }
    
    public double calcMediaProva(){
        return(0.75 * (ntPrv1 + 2 * ntPrv2) / 3);
    }
    public double calcMediaTrab(){
        return(0.25 * (ntTrab1 + 2 * ntTrab2) / 2);
    }
    public double calcMediaFinal(){
        return(calcMediaProva() + calcMediaTrab());
    }
}
