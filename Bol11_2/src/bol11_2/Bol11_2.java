package bol11_2;
/**
 *
 * @author jalvarezbarciela
 */
public class Bol11_2 {
    public static void main(String[] args) {
        Media a=new Media();
        a.setNom("Algo");
        a.setAutor("Luis");
        a.setDurada(5);
        String n=a.getNom();
        String b =a.getAutor();
        int s=a.getDurada();
        System.out.println("Nome "+n+"\nAutor "+b+"\nDurada "+s);
        
    }
    
}
