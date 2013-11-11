/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Docente 17082011
 */
public enum MovieType {
    ESTRENO(80), NORMAL(50), KIDS(40), UNDEFINE(0);
    int price;
    private MovieType(int p)
    {
        price = p;
    }
}
