
package Entidades;


public class parDeNumeros {
    
    int num1,num2;

    public parDeNumeros() {
        num1=(int)(Math.random()*10+1);
        num2=(int)(Math.random()*10+1);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    

}