package org.example;

public class calc {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int res = a/b;
        System.out.printf("%s+%s=%s \n", a,b,(a+b));
        System.out.printf("%s-%s=%s \n", a,b,(a-b));
        // Esse resultado irá apresentar 2 (sem decimal)
        System.out.printf("%s/%s=%s \n", a,b, (a/b));
        // Esse resultado irá apresentar 2 (com decimal)
        System.out.printf("%s/%s=%s \n", a,b, ((float)a/b));
        System.out.printf("%s*%s=%s \n", a,b,(a*b));

        Double valor = 2d;
        Double res1 = valor*2;
        System.out.printf("Resultado" +res1);

        // Uso do incremento:
        int x = 30;
        System.out.println(x++);
        System.out.println(x--);
        System.out.println(++x);
        System.out.println(--x);
        System.out.println("\n\n\n\n\n\n");

    }
}
